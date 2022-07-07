import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("국어 성적을 입력해 주세요");
        Scanner scanner = new Scanner(System.in);
        double korean_score = scanner.nextInt();
        System.out.println("영어 성적을 입력해 주세요");
        double english_score = scanner.nextInt();
        System.out.println("수학 성적을 입력해 주세요");
        double math_score = scanner.nextInt();
        double average = (korean_score + english_score + math_score) / 3;
        System.out.println("평균 성적은 " + average + "점입니다.");
        if (average >= 90) {
            System.out.println("평균 학점은 A입니다.");
        } else if (average >= 80) {
            System.out.println("평균 학점은 B입니다.");
        } else if (average >= 70) {
            System.out.println("평균 학점은 C입니다.");
        } else if (average >= 60) {
            System.out.println("평균 학점은 D입니다.");
        } else {
            System.out.println("평균 학점은 F입니다.");
        }
        scanner.close();
    }
}
