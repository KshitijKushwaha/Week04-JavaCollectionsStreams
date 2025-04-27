import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUsername{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        String user = sn.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        if(Pattern.matches(regex,user)) System.out.println("Valid");
        else System.out.println("Invalid");
        sn.close();
    }
}