package com.mycompany.comunicazionec_s;

/**
 *
 * @author asuf507zu4lp054w
 */
public class MainServer {

    public static void main(String[] args) {
      Server server=new Server(4002); //crea il server e apre la porta 4002
      server.attendi();
      server.termina();  //chiude il server
    }
    
}
