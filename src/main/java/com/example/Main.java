package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("client");

        Socket s = new Socket("10.22.10.20", 3000);

        String t="";

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);



        while(!t.equals("exit")){

                Scanner scanner = new Scanner(System.in);

                System.out.print("Inserisci il primo numero:");
                String numero1 = scanner.nextLine();
                System.out.print("Inserisci il secondo numero:");
                String numero2 = scanner.nextLine();
                System.out.print("Inserisci l'operazione da eseguire:");
                String operazione = scanner.nextLine();

                out.println(numero1);
                out.println(numero2);
                out.println(operazione);

                t=operazione;

                
            String risultato = in.readLine();
            System.out.println(risultato);

        }

    }
}