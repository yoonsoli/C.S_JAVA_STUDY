import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[10];
        System.out.println("정수 10개 입력");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            intArray[i] = num;
        }
        System.out.println("3의 배수");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != 0) {
                if (intArray[i] % 3 == 0) {
                    System.out.print(intArray[i]);
                    System.out.print(" ");
                }
            }
        }
        scanner.close();
    }
}