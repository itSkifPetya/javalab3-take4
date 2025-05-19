package data.repo;

public class RemoteRepo {
    private static RemoteRepo instance;
    private String HOST;
    private int PORT;

    private RemoteRepo(String host, int port) {
        this.HOST = host;
        this.PORT = port;
    }

    public static RemoteRepo getInstance(String host, int port) {
        if (instance == null || !instance.HOST.equals(host) || instance.PORT != port) {
            instance = new RemoteRepo(host, port);
        }
        return instance;
    }



}
