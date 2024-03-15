/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.comunicazionec_s;

/**
 *
 * @author asuf507zu4lp054w
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Server server=new Server(4002);
      server.attendi();
      server.termina();
    }
    
}
