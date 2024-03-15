package com.mycompany.comunicazionec_s;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    
    private String nome;
    private String colore;
    private Socket socket;

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public void connetti(String nomeS, int portaS) {
        System.out.println("Client "+nome+" in esecuzione\n");
        try {
            this.socket = new Socket(nomeS, portaS); 
        } catch(UnknownHostException ex){ 
            System.err.println("Host sconosciuto!");
            System.err.println(ex);
        } catch (IOException e){
            System.err.println("Errore generico nella Creazione del Client!");
            System.err.println(e);
        }
        
    }
    
    public void leggi() {
       
    }
    
    public void scrivi() {
       
    }

    public void chiudi() {
            try {
                // Chiudi il socket 
                this.socket.close();
                System.out.println("Connessione chiusa.");
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
}
