/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class ArrayLoopApp {

    static int[] movs;
    static int max_movs = 6;
    static int saldo = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        movs = new int[max_movs];
        //movs[0]=200; 
        //movs[1]=-50;
        // int val = movs[0];

        //fase input dati
        getMovs();
        //fase elaborazione dati
        //calcolo del saldo
        saldo = preparaSaldo();
        //fase output
        printOutput();
    }

    static int preparaSaldo() {
        int newsaldo = 0;
        for (int i = 0; i < movs.length; i++) {
            newsaldo = newsaldo + movs[i];
        }
        return newsaldo;
    }

    static void getMovs() {
        
        for (int i = 0; i < movs.length; i++) {
            movs[i] = mygetInt();

        } //fine fase inpuyt array movs

    }

    static void printOutput() {
        String output = "";
        //inizio fase lettura e conti vari
        for (int i = 0; i < movs.length; i++) {
            int nriga = i + 1;
            output += nriga + ": ";
            //output += (i+1) + ": ";
            if (movs[i] > 0) {
                output += "+" + movs[i] + "€\n";
            } else {
                output += movs[i] + "€\n";
            }

        }
        output += "il saldo e' di " + saldo;
        JOptionPane.showMessageDialog(null, output);
    }

    static int mygetInt() {
        int ris = 0;
        boolean ok = false;
        while (ok == false) //(!ok)
        {
            try {
                String strmov = JOptionPane.showInputDialog("dimmi valore movimento (es. 200, -50)");
                ris = Integer.parseInt(strmov);
                ok = true;
            } catch (Exception err) {
                ris = 0;
                JOptionPane.showMessageDialog(null, "hai scritto un valore errato e ti "
                        + "e' stato messo il valore 0");
            }
        }

        return ris;
    }

}
