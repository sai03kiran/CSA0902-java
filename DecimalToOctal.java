import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String octal = Integer.toOctalString(decimal);
        System.out.println("The Octal representation of " + decimal + " is: " + octal);
    }
}