import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("수를 결정하였습니다. 맞추어 보세요. (0~99)");
            int randomNum = (int) (Math.random() * 100);
            int range1 = 0;
            int range2 = 99;
            int i = 1;
            while (true) {
                System.out.print((i++) + " >> ");
                int inputNum = scanner.nextInt();
                if (inputNum < 0 | inputNum > 99) {
                    System.out.println("다시 입력하세요");
                } else {
                    if (inputNum == randomNum) {
                        break;
                    } else if (inputNum > randomNum) {
                        if (range2 > inputNum) {
                            range2 = inputNum;
                        }
                        System.out.println("더 낮게 " + "(" + range1 + "~" + range2 + ")");
                    } else if (inputNum < randomNum) {
                        if (range1 < inputNum) {
                            range1 = inputNum;
                        }
                        System.out.println("더 높게 " + "(" + range1 + "~" + range2 + ")");
                    }
                }
            }
            System.out.print("맞았습니다. 다시 하시겠습니까? (y/n) >> ");
            String answer = sc.nextLine().toLowerCase();
            if (answer.equals("n")) {
                System.out.println("종료하겠습니다.");
                break;
            } else if (answer.equals("y")) {
                continue;
            }

        }

    }
}
