package lk.ijse;
/* 
    @author Sachi_S_Bandara
    @created 1/6/2024 - 11:38 AM
*/

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)
    {
        System.out.println("server");

        try {
            ServerSocket serverSocket = new ServerSocket(3002);
            System.out.println("server is started");
            Socket localSocket = serverSocket.accept();
            System.out.println("server accepted");

            DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());
            String massage = dataInputStream.readUTF();
            System.out.println("from client:  "+massage);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}