import java.util.Random;
import java.util.Scanner;

public class HoT{
    public static void main(String[] args) {
        System.out.println("Who are you?");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("Hello,"+username+"!");
        
        String[] hot = {"Heads", "Tails"};
        Random rdm = new Random();
        int heads=0, tails=0;
        for(int i=1;i<=5;i++){
            int j;
            String value = hot[j=rdm.nextInt(2)];
            System.out.println("Round "+i+":"+value);
            if (j==0) heads++;
            if (j==1) tails++;
        }
        System.out.println("Heads: "+heads+", Tails: "+tails);
        if(heads>=3) System.out.println(username+" won!");
        else System.out.println (username+" lose.");
    }
}
