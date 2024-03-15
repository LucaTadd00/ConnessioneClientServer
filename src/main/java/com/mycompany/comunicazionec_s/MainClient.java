/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comunicazionec_s;

/**
 *
 * @author asuf507zu4lp054w
 */
public class MainClient {

    public static void main(String[] args) {
        Client client= new Client("User","Giallo");
        client.connetti("127.0.0.1",4002);
        client.chiudi();
    }
}
