import java.util.*;

public class milhas {
    public static void main(String [] args){
        
        //leitura de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Quilometros?");
        int km = sc.nextInt();
        double milhas = km/1609;
        System.out.println("Milhas = " +milhas);
        sc.close();
        
    }
    
}
