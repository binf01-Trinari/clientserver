public class MainServer {
    public static void main(String[] args) {
        Server server = new Server(12345);
        server.attendi();
        server.leggi();
        server.scrivi("Ciao dal server!");
        server.chiudi();
        server.termina();
    }
}
