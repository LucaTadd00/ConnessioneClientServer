package com.mycompany.comunicazionec_s;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.BindException;


public class Server {
    
    private ServerSocket sSocket;
    private Socket cSocket;
    private int porta;
    
    
      public Server(int porta) {
        this.porta=porta;
        try {
           this.sSocket=new ServerSocket(porta);  //socket(), bind(), listen();
           System.out.println("il server è in ascolto");
        } catch (IOException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("errore nella fase di ascolto");
        }
    }
      
        public Socket attendi() {
        //consento l'ingresso di dati dalla porta
        try {
            cSocket = sSocket.accept(); //attende connessioni finche il client non si collega
            System.out.println("Connessione Riuscita");
        } catch (BindException e) {
            System.err.println(e);
            System.out.println("server gia avviato e occupa la porta");
        } catch (IOException e) {
            System.err.println(e);
            System.out.println("Connessione fallita al metodo accept()");
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
            sSocket.close(); //chiudo il server
        } catch (IOException e) {
            System.err.println(e);
        }
    }
      
      
}
