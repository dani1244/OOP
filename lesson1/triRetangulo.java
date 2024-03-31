import java.util.Scanner;

public class triRetangulo {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Cateto1? ");
        int a = sc.nextInt();
        System.out.println("Cateto2? ");
        int b = sc.nextInt();
        double c = Math.pow(a+b, 2);
        double hipo = Math.sqrt(c);
        System.out.println("Cateto1 = " +a+ "\n Cateto2 = " +b+ "\n Hipotenusa = " +hipo);
        sc.close();

    }
}
