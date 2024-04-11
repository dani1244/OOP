package OOP;

import java.util.*;

public class investimento {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Valor Investido?");
        double valorInv = sc.nextDouble();
        double jurosMes = 0.01;
        int tempo = 3;
        double valorTotal = valorInv*(Math.pow(1+jurosMes, tempo));
        double valorArredondado = Math.round(valorTotal * 1000.0) / 1000.0; 
        System.out.println("Valor Investido = " +valorInv+ " \nValor ao fim de 3 meses = " +valorArredondado);
        sc.close();

    }
}
