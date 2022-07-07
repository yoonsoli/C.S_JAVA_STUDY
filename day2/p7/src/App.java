import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1~31 사이의 값을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt(); // scanner로 값을 받아옴
        if (day >= 1 & day <= 31) { // 1~31 사이의 값인지 확인함

            switch (day % 7) { // 7로 나눈 나머지를 이용해 계산해서 요일을 구함
                case (0):
                    System.out.println("목요일입니다."); // ex) 7월의 목요일의 경우 7의 배수로 이루어져 있기 때문에 7로 나누면 나머지가 0 나머지가 0이면 목요일
                    break;
                case (1):
                    System.out.println("금요일입니다.");
                    break;
                case (2):
                    System.out.println("토요일입니다.");
                    break;
                case (3):
                    System.out.println("일요일입니다.");
                    break;
                case (4):
                    System.out.println("월요일입니다.");
                    break;
                case (5):
                    System.out.println("화요일입니다.");
                    break;
                case (6):
                    System.out.println("수요일입니다.");
                    break;

            }
        } else {
            System.out.println("1~31 사이의 값을 입력하세요.");
        }

        scanner.close();
    }
}
