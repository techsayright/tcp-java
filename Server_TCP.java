package server_tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_TCP {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(9999);
            
            Socket s = ss.accept(); //accept connection
            
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            
            String str = br.readLine();
            System.out.println("i recieved:"+str);
            
            //for sending ack
            PrintStream pr = new PrintStream(s.getOutputStream());
            String str2 = "Server Ack: i got ur msg !!";
            pr.println(str2);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
