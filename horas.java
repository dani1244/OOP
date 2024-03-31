package OOP;

import java.util.*;

public class horas {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira os segundos? ");
        int segundos = sc.nextInt();
        
        //horas
        int hh = segundos/3600;

        //minutos
        int tempoRestante = segundos%3600;
        int mm = tempoRestante/60;

        //segundos
        int ss = tempoRestante%60;

        System.out.print(String.format("%02d", hh) + ":" + String.format("%02d", mm) + ":" + String.format("%02d", ss));
        sc.close();
    }
}
