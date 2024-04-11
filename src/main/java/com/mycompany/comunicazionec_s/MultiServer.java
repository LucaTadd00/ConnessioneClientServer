package com.mycompany.comunicazionec_s;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.BindException;
import java.io.*;

public class MultiServer extends Thread {
    
    int porta = 4002;
    
    public void run() {
       try {
          ServerSocket serverSocket = new ServerSocket(porta);
          
          while(true) {
           System.out.println("server in attesa di una connesione...");
           Socket socket = serverSocket.accept();
           System.out.println("connessione accettata a " + socket);
           Server server = new Server(porta, socket);
           server.start();
           
          }
          } catch (IOException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("errore nel multiThreading");
    }
}
}

