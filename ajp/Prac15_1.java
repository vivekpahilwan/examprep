// Write a program to demonstrate the use of URL 
//  and URLConnection class and its methods

import java.net.*;

public class Prac15_1 {
    public static void main(String args[]) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
