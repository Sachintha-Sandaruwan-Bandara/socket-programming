package lk.ijse;
/* 
    @author Sachi_S_Bandara
    @created 1/6/2024 - 11:38 AM
*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("server");

        try {

            ServerSocket serverSocket = new ServerSocket(3002);
            System.out.println("server is started");
            Socket localSocket = serverSocket.accept();
            System.out.println("request accepted");
            while (true) {
                DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());
                String massage = dataInputStream.readUTF();
                System.out.println("from client:  " + massage);

                DataOutputStream dataOutputStream = new DataOutputStream(localSocket.getOutputStream());
                Scanner input = new Scanner(System.in);
                System.out.print("input:");
                String msg = input.nextLine();


                dataOutputStream.writeUTF(msg);
                dataOutputStream.flush();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}