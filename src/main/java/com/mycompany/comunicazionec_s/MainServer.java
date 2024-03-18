package com.mycompany.comunicazionec_s;

import java.util.Scanner;

/**
 *
 * @author asuf507zu4lp054w
 */
public class MainServer {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String r = "si";
      Server server=new Server(4002); //crea il server e apre la porta 4002
      while(r.equals("si")){
        server.attendi();
        server.leggi();
        server.scrivi();
        System.out.println("continuare ad aspettare un altro client?");
        r = s.nextLine(); 
        server.chiudi();    
      }
      server.termina();  //chiude il server
    }
    
}
