import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        if ((money % 10) > 0) {
            System.out.println("잘못입력하셨습니다.");
        } else {
            if (money >= 50000) {
                double a;
                int c;
                a = money / 50000;
                c = (int) a;
                money -= c * 50000;
                System.out.println("5만원 " + c + "장");
            }
            if (money >= 10000) {
                double a;
                int c;
                a = money / 10000;
                c = (int) a;
                money -= c * 10000;
                System.out.println("만원 " + c + "장");
            }
            if (money >= 1000) {
                double a;
                int c;
                a = money / 1000;
                c = (int) a;
                money -= c * 1000;
                System.out.println("천원 " + c + "장");
            }
            if (money >= 500) {
                double a;
                int c;
                a = money / 500;
                c = (int) a;
                money -= c * 500;
                System.out.println("오백원 " + c + "개");
            }
            if (money >= 100) {
                double a;
                int c;
                a = money / 100;
                c = (int) a;
                money -= c * 100;
                System.out.println("백원 " + c + "개");
            }
            if (money >= 50) {
                double a;
                int c;
                a = money / 50;
                c = (int) a;
                money -= c * 50;
                System.out.println("오십원 " + c + "개");
            }
            if (money >= 10) {
                double a;
                int c;
                a = money / 10;
                c = (int) a;
                money -= c * 10;
                System.out.println("십원 " + c + "개");
            }
        }
        scanner.close();
    }
}
