import java.util.*;

public class energia {
    public static void main(String [] args){

        //Leitura de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Água KG?");
        int M = sc.nextInt();
        System.out.println("Temperatura final?");
        int finalTemperature = sc.nextInt();
        System.out.println("Temperatura inicial?");
        int initialTemp = sc.nextInt();
        double Q = M*(finalTemperature-initialTemp)+4184;
        System.out.println("Q = " +Q);
        sc.close();

    }
}
