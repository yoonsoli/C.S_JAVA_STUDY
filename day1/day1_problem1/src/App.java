import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("아이디를 입력해 주세요!");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        switch (id) {
            case "cs2626":
                System.out.println("비밀번호를 입력해 주세요!");
                String password = scanner.nextLine();
                if (password.equals("1q2w")) {
                    System.out.println("로그인 성공!");
                } else {
                    System.out.println("로그인 실패!");
                }
                break;
            default:
                System.out.println("로그인 실패!")
        }
    }
}
