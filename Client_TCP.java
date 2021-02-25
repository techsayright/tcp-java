package client_tcp;

import java.io.*;
import java.net.Socket;

public class Client_TCP {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",9999);
            
            //to send data to the server
            PrintStream pr = new PrintStream(s.getOutputStream()); //getoutput stream
            System.out.println("Enter msg:");
            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            pr.println(str);
                    
            // for  getting ack from server
            BufferedReader ackbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str2 = ackbr.readLine();
            System.out.println(str2);
            
        } catch (IOException e) {
            System.out.println(e);
        }

    
    }
}