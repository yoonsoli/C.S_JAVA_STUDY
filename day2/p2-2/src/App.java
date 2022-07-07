import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double doubleArray[] = new double[5];
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            double num = scanner.nextDouble();
            doubleArray[i] = num;
        }
        for (int i = 0; i < doubleArray.length; i++) {
            sum += doubleArray[i];
        }
        System.out.println("합계" + sum);
        System.out.println("평균" + sum / 5);
        scanner.close();
    }
}
