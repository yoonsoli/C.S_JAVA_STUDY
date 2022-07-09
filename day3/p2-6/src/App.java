import java.util.Scanner;
import java.util.Arrays;

public class App {
    // public static void main(String[] args) throws Exception {
    // Scanner scanner = new Scanner(System.in);
    // String eng[] = { "student", "love", "jave", "happy", "future" };
    // String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };
    // System.out.print("영어 단어를 입력하세요 >> ");
    // String word = scanner.nextLine();
    // int indexNum = Arrays.asList(eng).indexOf(word);
    // if (indexNum >= 0) {
    // System.out.println(kor[indexNum]);
    // } else {
    // System.out.println("그런 영어 단어가 없습니다.");
    // }
    // scanner.close();
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eng[] = { "student", "love", "java", "happy", "future" };
        String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };
        String word = " ";
        while (word != "exit") {
            int indexNum = -1;
            System.out.print("영어 단어를 입력하세요 >> ");
            word = scanner.nextLine();
            if (word.equals("exit")) {
                break;
            } else {
                for (int i = 0; i < 5; i++) {
                    if (word.equals(eng[i])) {
                        indexNum = i;
                    }
                }
                if (indexNum >= 0) {
                    System.out.println(kor[indexNum]);
                } else {
                    System.out.println("그런 영어 단어가 없습니다.");
                }
            }

        }
        scanner.close();

    }
}
