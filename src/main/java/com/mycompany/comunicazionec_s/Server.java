package com.mycompany.comunicazionec_s;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    
    private ServerSocket sSocket;
    private Socket cSocket;
    private int porta;
    
    
      public Server(int porta) {
        this.porta=porta;
        try {
           this.sSocket=new ServerSocket(this.porta);
        } catch (IOException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public Socket attendi() {
        //consento l'ingresso di dati dalla porta
        try {
             this.cSocket = sSocket.accept();
              
           System.out.println("Connessione Effettuata");
        } catch (IOException e) {
            System.err.println(e);
        }
        return cSocket;
    } 
        
    public void leggi() {
       
    }

    public void scrivi() {
       
    }

    public void chiudi() {
      
    }

    public void termina() {
        try {
            //chiudo il server
            sSocket.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
      
      
}
