package lesson2;

import java.util.Scanner;

public class notasPT {
    
        public static int validNota(Scanner sc){
        int notaT;
        System.out.println("Insira a nota da teória!");
        int notaP;
        System.out.println("Insira a nota da prática!");

         while(true){
            notaT = sc.nextInt();
            notaP = sc.nextInt();
            if ((notaT >= 0) && (notaP<=20) || (notaT<=20) && (notaP>=0)){
                //Se for verdade, pode prosseguir
                break;
            }else {
                System.out.println("Nota Inválida!");
            }
        }
         return notaT;
         return notaP;
    }
        public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        int notaT = validNota(sc);
        double notaFinal = (0.4*notaT)+(0.6*notaP);
        if (notaP<7||notaT<7){
            System.out.println("66");
            System.out.println(" A nota final foi de : " +notaFinal);
        }

}
        
    

