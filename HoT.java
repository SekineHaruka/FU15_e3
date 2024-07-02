import java.util.Random;

public class HoT{
    public static void main(String[] args) {
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
        if(heads>=3) System.out.println("you won!");
        else System.out.println ("you lose.");
    }
}
