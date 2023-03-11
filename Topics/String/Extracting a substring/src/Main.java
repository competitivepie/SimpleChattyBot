import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        String subStr = str.substring(x, y + 1);

        System.out.println(subStr);
    }
}