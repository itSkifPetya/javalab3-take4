package domain;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * Класс Сервера. Содержит методы для запуска и остановки
 */
public class Server {
    private static Server instance;
//    private SocketChannel client;

    private Server() {}

    public static Server getInstance() {
        if (instance == null) instance = new Server();
        return instance;
    }

    /**
     * Запускает сервер на заданном порте.
     * @param PORT
     * @return
     * @throws IOException
     * @throws InterruptedException
     */
    public SocketChannel init(int PORT) {
        try (ServerSocketChannel socketChannel = ServerSocketChannel.open()) {
            socketChannel.bind(new InetSocketAddress(PORT));
            socketChannel.configureBlocking(false);
            SocketChannel client = null;

            while (client == null) {
                System.out.println("Ожидаем подключения:");
                client = socketChannel.accept();
                Thread.sleep(100);
            }
            System.out.println("Подключено: " + client.getRemoteAddress());
            return client;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void stopServer(ServerSocketChannel server) throws IOException {
        server.close();
        System.out.println("Сервер выключен");
    }
}
