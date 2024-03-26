import java.util.*;

public class temperatura {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura?");
        double celsius = sc.nextInt();
        double F = 1.8*celsius+32;
        System.out.println("F = " +F);
        sc.close(); 
    }
}
