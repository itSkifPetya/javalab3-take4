package domain;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * Реализация Presenter для работы в консоли
 */
public class RequestManager {
    private static RequestManager instance;
    private SocketChannel client;


    private RequestManager(SocketChannel client) {
        this.client = client;
    }

    /**
     * Реализация Singleton
     *
     */
    public static RequestManager getInstanse(SocketChannel client) {
        if (client == null) {
            throw new NullPointerException("Клиент не может быть null");
        }
        if(instance == null) {
            instance = new RequestManager(client);
        }
        return instance;
    }

    /**
     * Передать сообщение в вывод
     * @param msg сообщение
     */
    public void post(String msg) throws IOException {
        client.write(ByteBuffer.wrap(msg.getBytes()));
    }

    /**
     * Получить пользовательский ввод
     * @return пользовательский ввод
     */
//    @Override
    public String get() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Получить пользовательский ввод по сообщению
     * @param msg сообщение, отображаемое у пользователя
     * @return пользовательский ввод
     */
//    @Override
    public String get(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
}
