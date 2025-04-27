import java.util.Scanner;
import java.util.regex.Pattern;

public class SpaceFixer {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String txt = sn.nextLine();
        String fixed = Pattern.compile("\\s+").matcher(txt).replaceAll(" ");
        System.out.println(fixed);
        sn.close();
    }
}