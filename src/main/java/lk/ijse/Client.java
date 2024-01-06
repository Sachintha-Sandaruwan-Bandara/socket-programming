package lk.ijse;
/* 
    @author Sachi_S_Bandara
    @created 1/6/2024 - 11:38 AM 
*/

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("client");
        try {
            Socket remoteSocket = new Socket("localhost",3002);
            DataOutputStream dataOutputStream = new DataOutputStream(remoteSocket.getOutputStream());
            dataOutputStream.writeUTF("hello server");
            dataOutputStream.flush();
            remoteSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
