import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("과목명을 입력해 주세요!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name) {
            case "국어":
                System.out.println("701호");
                break;
            case "수학":
                System.out.println("702호");
                break;
            case "영어":
                System.out.println("703호");
                break;
            case "과학":
                System.out.println("704호");
                break;
            default:
                System.out.println("상담원에게 문의해주세요.");

        }
        scanner.close();
    }
}
