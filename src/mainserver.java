import java.net.Socket;

public class mainserver {
    public static void main(String[] args) {
        server ss = new server(2000);
        Socket s = ss.attendi();
    }
}
