import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class GuavaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something");
        String userInput = scanner.nextLine();
        System.out.printf("You Entered '%s' \n",userInput);
        System.out.println("Swapped Cases: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed string:" + StringUtils.reverse(userInput));

        if (StringUtils.isNumeric(userInput) == true){
            System.out.println("is not number");
        }else {
            System.out.println("is a number");;
        }


    }

//    public static void swapCase(String words){
//        System.out.println(String.Util);
//    }
}
