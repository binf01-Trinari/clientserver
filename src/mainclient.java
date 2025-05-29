public class MainClient {
    public static void main(String[] args) {
        Client client = new Client("Mario", "rosso");
        if (client.connetti("localhost", 12345) == 0) {
            client.scrivi("Ciao dal client!");
            client.leggi();
            client.chiudi();
        }
    }
}
