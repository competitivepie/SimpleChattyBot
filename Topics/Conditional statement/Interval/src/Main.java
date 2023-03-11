import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int x = scanner.nextInt();

        if((x > -15 && x <=12) || (x > 14 && x < 17) || (x >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}