package lk.ijse;
/* 
    @author Sachi_S_Bandara
    @created 1/6/2024 - 11:38 AM 
*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("client");
        try {

            Socket remoteSocket = new Socket("localhost", 3002);
            while (true) {
                DataOutputStream dataOutputStream = new DataOutputStream(remoteSocket.getOutputStream());
                Scanner input = new Scanner(System.in);
                System.out.print("input:");
                String msg = input.nextLine();


                dataOutputStream.writeUTF(msg);
                dataOutputStream.flush();


                DataInputStream dataInputStream = new DataInputStream(remoteSocket.getInputStream());
                String massage = dataInputStream.readUTF();
                System.out.println("from server:  " + massage);


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
