package ar.edu.unlp.objetos.uno.ejercicio1_FrameWork_2026;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServerRefactor {	
	// Método abstracto obligatorio para las subclases
	public abstract void handleMessage(String message, PrintWriter out);

	// --- MÉTODOS HOOK OPCIONALES ---
	// Tienen una implementación por defecto vacía. Las subclases eligen si usarlos o no.
	    
	protected void onClientConnected(PrintWriter out) {
	//Hook opcional: se ejecuta antes de empezar a leer mensajes
	}

	protected void onClientDisconnected() {
	// Hook opcional: se ejecuta al finalizar la comunicación de manera exitosa
	}
	// ---------------------------------

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
	    System.err.println("Usage: java " + this.getClass().getName() + " <port number>");
	}

	// REFACTORIZADO: Ahora es final (Template Method) y expone la estructura del algoritmo
	public final void handleClient(Socket clientSocket) {
	      
	    try (//1 Canal para escribir al cliente y un canal para leer al cliente 
	        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	    ) {
	        // 1. LLAMADA AL HOOK DE CONEXIÓN
	        onClientConnected(out);

	        String inputLine;
	        while ((inputLine = in.readLine()) != null) {
	            System.out.println("Received message: " + inputLine + " from "
	                    + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
	                
	            if (inputLine.equalsIgnoreCase("")) {
	                break; // Client requested to close the connection
	            }
	                
	            // Paso abstracto obligatorio
	            handleMessage(inputLine, out);
	        }
	            
	        System.out.println("Connection closed with " + clientSocket.getInetAddress().getHostAddress() + ":"
	                + clientSocket.getPort());
	           
	        // 2. LLAMADA AL HOOK DE DESCONEXIÓN
	        onClientDisconnected();

	    } catch (IOException e) {
	          System.err.println("Problem with communication with client: " + e.getMessage());
	    } finally {
	        try {
	            clientSocket.close();
	        } catch (IOException e) {
	            System.err.println("Error closing socket: " + e.getMessage());
	        }
	    }
	}
}
