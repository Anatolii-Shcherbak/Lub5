import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String str;
        String strlove;
        StringBuilder reverse1 = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        str = scanner.nextLine();
        strlove = str.toLowerCase();

        StringBuilder palindromeBuilder = new StringBuilder();
        palindromeBuilder.append(new StringBuilder(strlove).reverse());

        if(strlove.equals(palindromeBuilder.toString()))
        System.out.println("Word is Polindrom");
        else
            System.out.println("Word is not a polindrom");
    }
}
