import java.util.Scanner;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {


    public static void main(String[] args) {
        int hour, minute, minAngle, hrAngle, betweenAngle;
        hour = minute = minAngle = hrAngle = betweenAngle = 0;
        System.out.println("To exit, click e");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter time:");
            String N = scanner.nextLine();
            if (N.equals("e")) {
                break;
            }
            String timeRegex = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
            try {
                if (!Pattern.matches(timeRegex, N)) {
                    throw new IncorrectTimeFormatException("lolz ale debil");
                }
                hour = Integer.parseInt(N.split(":")[0]);
                if (hour > 12) hour -= 12;
                minute = Integer.parseInt(N.split(":")[1]);
            } catch (IncorrectTimeFormatException e) {
                e.printStackTrace();
                System.out.println("bad time format");
            }
            minAngle = minute * 6;
            hrAngle = hour * 30 + minute / 2;
            betweenAngle = Math.abs(minAngle - hrAngle);
            if (betweenAngle > 180) betweenAngle = 360 - betweenAngle;
            System.out.println("Angle between clock's indicator equals:" + betweenAngle);
        }

    }
}





