package com.mycompany.ConnessioneTCP_Multithreading;

import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {
        Client client= new Client("LucaTadd.com","Blu");
        client.connetti("127.0.0.1",4002);
        client.start();
    }
}
