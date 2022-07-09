import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 10개 입력 >> ");
        int intArray[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            intArray[i] = num;
        }
        Arrays.sort(intArray);
        for (int i = 0; i < 10; i++) {
            System.out.print(intArray[i]);
            System.out.print(" ");
        }
        scanner.close();

    }
}
