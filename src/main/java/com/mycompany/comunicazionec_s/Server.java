package com.mycompany.comunicazionec_s;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.BindException;
import java.io.*;


public class Server extends Thread {
    
    private Socket cSocket;
    private int porta;
    private int numeroClient;
    private  boolean connection = true;
    String receivedData;
    
    
      public Server(int porta, Socket socket, int n) {
        this.porta=porta;
        this.cSocket = socket;
        this.numeroClient = n;
    }
     
    @Override  
    public void run() {
        while(connection) {
    leggi();
    scrivi();
        }
    chiudi();    
    } 
        
    public void leggi() {
        try {
            InputStream inputStream = cSocket.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            
            receivedData = in.readLine();
                       
            System.out.println("Dati ricevuti dal client numero " + numeroClient + ": " + receivedData );
            
            if(receivedData.equals("FINE")) {
            connection = false;
            }
            
            
        } catch (IOException e) {
            System.err.println("errore nella ricezione di dati dal client");
            chiudi();
            connection = false;
        } finally {
            
        }
    }

    public void scrivi() {
    try {
      OutputStream outputStream = cSocket.getOutputStream();
      PrintWriter out = new PrintWriter(outputStream, true);
       if (connection == true) {
           
            out.println("dati inviati correttamente; sei il client numero " + numeroClient + "!");
            
      } else {
         out.println("Hai richiesto la chiusura, chiusura connessione in corso...");
      }       
    } catch (IOException e) {
            System.err.println("errore nell'invio della risposta al client");
            System.err.println(e);
        }
    }

    public void chiudi() {
        try {           
            System.out.println("chiusura connessione col client numero " + numeroClient);
            cSocket.close(); //chiudo la connessione col client
        } catch (IOException e) {
            System.err.println(e);
        } 
      
    }

      
      
}
