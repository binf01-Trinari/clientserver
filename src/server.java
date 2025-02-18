import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    ServerSocket serverSocket;
    Socket clientSocket;
    int porta;
    public server(int porta){
        this.porta = porta;
        try{
            serverSocket = new ServerSocket(porta);
            System.out.println("il server è in ascolto");
        } catch (IOException e) {
            System.err.println("errore nella fase di ascolto");
        }
    }
    public Socket attendi (){
        try{
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("problrmi di connessione con il client");
        }
        return clientSocket;
    }
}
