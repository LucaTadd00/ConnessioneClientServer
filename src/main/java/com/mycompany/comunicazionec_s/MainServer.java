package com.mycompany.comunicazionec_s;

import java.util.Scanner;

/**
 *
 * @author asuf507zu4lp054w
 */
public class MainServer {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("-------------------------------");
      System.out.println("---------SERVER ATTIVO---------");
      System.out.println("-------------------------------");
      MultiServer server = new MultiServer(4002); //crea il server e apre la porta 4002
      server.start();
      
    }
    
}
