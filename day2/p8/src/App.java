import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("시간을 입력해 주세요 00:00");
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        String[] timeArray = time.split(":");
        int timenum = Integer.parseInt(timeArray[0]);

        if (timenum >= 12) {
            int num = timenum - 12;
            if (num == 12) {
                System.out.println("오전 12시 " + timeArray[1] + "분");
            } else if (num == 0) {
                System.out.println("오후 12시 " + timeArray[1] + "분");
            } else if (num >= 10) {
                System.out.println("오후 " + num + "시 " + timeArray[1] + "분");
            } else {
                System.out.println("오후 0" + num + "시 " + timeArray[1] + "분");
            }
        } else {
            System.out.println("오전 " + timeArray[0] + "시 " + timeArray[1] + "분");
        }
        scanner.close();
    }
}
