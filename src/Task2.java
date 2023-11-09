import java.util.Random;

public class Task2 {
    public static void main(String[] args) {


        int Nums[] = new int[10];
        int largest = 0, smallest = 100;
        Random rn = new Random();

        for (int i = 0; i < Nums.length; i++){
            Nums[i] = rn.nextInt(100);
            if(Nums[i] > largest)
                largest = Nums[i];
            else if(Nums[i] < smallest)
                smallest = Nums[i];
        }

        System.out.println("Largest Num:" +  largest);
        System.out.println("Smaller Num:" +  smallest);
    }
}
