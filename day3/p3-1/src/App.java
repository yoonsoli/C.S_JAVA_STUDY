import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        scanner.close();
    }
}
