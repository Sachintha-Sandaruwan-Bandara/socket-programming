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
            serverSocket.accept();
            Socket localSocket = new Socket();
            DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}