package OOP;

import java.util.*;

public class velocidade {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Velocidade Ida? ");
        double vIda = sc.nextDouble();
        System.out.println("Distancia Ida? ");
        double dIda = sc.nextDouble();
        System.out.println("Velocidade Volta? ");
        double vVolta = sc.nextDouble();
        System.out.println("Distancia Volta? ");
        double dVolta = sc.nextDouble();
        
        //Calcular a velociade media final?
        double tempoTotal = (dIda/vIda)+(dVolta/vVolta);
        double tempoArredondado = Math.round(tempoTotal * 100.0) / 100.0; 
        double distTotal = dIda+dVolta;
        double vmFinal = distTotal/tempoTotal;
        double velocidadeArredondada = Math.round(vmFinal * 100.0) / 100.0; 
        System.out.println("V1 = " +vIda+ " \nD1 = " +dIda+ " \nV2 = " +vVolta+ " \nD2 = " +dVolta+ " \nTempoTotal = " +tempoArredondado+ " \nDistanciaTotal = " +distTotal+ " \nVmFinal = " +velocidadeArredondada);

        sc.close();
    }
    
}
