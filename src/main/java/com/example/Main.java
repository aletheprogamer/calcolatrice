package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("client");

        Socket s = new Socket("127.0.0.1", 3000);

       String t="";

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);



        while(t != "exit"){

                Scanner scanner = new Scanner(System.in);

                System.out.print("Inserisci il primo numero:");
                float numero1 = scanner.nextFloat();

                out.println(numero1);

                System.out.print("Inserisci il secondo numero:");
                float numero2 = scanner.nextFloat();

                out.println(numero2);

                System.out.print("Inserisci l'operazione da eseguire:");
                String operazione = scanner.nextLine();

                out.println(operazione);

                t=operazione;

                
            

        }

    }
}