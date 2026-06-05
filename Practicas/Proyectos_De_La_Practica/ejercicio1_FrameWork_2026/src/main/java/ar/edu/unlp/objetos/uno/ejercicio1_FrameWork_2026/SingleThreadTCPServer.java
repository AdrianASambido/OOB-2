package ar.edu.unlp.objetos.uno.ejercicio1_FrameWork_2026;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {

    public abstract void handleMessage(String message, PrintWriter out);

    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

    
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java"+this.getClass().getName() +"<port number>");
    }

    

    private final void handleClient(Socket clientSocket) {
        
        try (	
                PrintWriter   out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) { //Leemos al cliente mientras no cierre la conexión o llega null
                System.out.println("Received message: " + inputLine + " from " //Mostramos mensaje
                        + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
              //obtenemos la IP del cliente,       la obtenemos como texto,   obtenemos el puerto del cliente
                if (inputLine.equalsIgnoreCase("")) { //Compara ignorando mayusculas y minúsculas y si 
                	                                  //recibimos linea vacia del cliente se cierra la conexión
                    break; // Client requested to close the connection
                }
                handleMessage(inputLine, out);//llama al método para interpretar el mensaje
            }
            System.out.println("Connection closed with " + clientSocket.getInetAddress().getHostAddress() + ":"
                    + clientSocket.getPort());//conexión cerrada
        } catch (IOException e) {//captura de errores de red, lectura escritura, socket.
            System.err.println("Problem with communication with client: " + e.getMessage());
        } finally {		//Siempre se ejecuta haya error o no libera conexión, memoria, recursos.												//obtiene el mensaje de error
            try {
                clientSocket.close();
            } catch (IOException e) {//captura de errores de red, lectura escritura, socket.
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }
}
