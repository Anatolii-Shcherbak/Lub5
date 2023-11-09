import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String str1, str2, concat1, concat2;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first string: ");
         str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
         str2 = scanner.nextLine();

         concat1 = str1.concat(str2);
        System.out.println("Concatenated String1: " + concat1);
         concat2 = str2.concat(str1);


        System.out.println("Concatenated String2: " + concat2);
       boolean b = concat1.matches(concat2);

       System.out.println(b);



    }
}
