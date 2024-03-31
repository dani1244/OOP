package OOP;

import java.util.*;

public class pontos {
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
        System.out.println("X1? ");
        int x1 = sc.nextInt();
        System.out.println("Y1? ");
        int y1 = sc.nextInt();
        System.out.println("X2? ");
        int x2 = sc.nextInt();
        System.out.println("Y2? ");
        int y2 = sc.nextInt();
        double Xx1 = Math.pow(x2-x1, 2);
        double Yy1 = Math.pow(y2-y1, 2);
        double Dist = Math.sqrt(Xx1+Yy1);
        double distArredondada = Math.round(Dist * 10.0) / 10.0; 
        System.out.println("Distancia entre os Pontos = " +distArredondada);
        sc.close();

    }
}
