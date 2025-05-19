import domain.RequestManager;
import domain.Server;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Server server = Server.getInstance();
        var client = server.init(1234);
        RequestManager rm = RequestManager.getInstanse(client);
        while (!client.isConnected()) {
            Thread.sleep(100);
        }
        try {
            rm.post("Алоха");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
