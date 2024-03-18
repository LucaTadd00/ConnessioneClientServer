package com.mycompany.comunicazionec_s;
/**
 *
 * @author asuf507zu4lp054w
 */
public class MainClient {

    public static void main(String[] args) {
        Client client= new Client("LucaTadd.com","Blu");
        client.connetti("127.0.0.1",4002);
        client.scrivi();
        client.leggi();
        client.chiudi();
    }
}
