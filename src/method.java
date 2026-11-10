import java.util.Scanner;
import java.lang.*;

public class method {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);

        boolean found;
        char alpha='U';
        found=isVowel(alpha);
        System.out.print("is the character"+alpha +"vowel?" + found);


    }
    public static boolean isVowel(char letter){
        switch(letter)
        {
            case'a':
            case'A':
            case'e':
            case'E':
            case'i':
            case'I':
            case'o':
            case'O':
            case'u':
            case'U':
             return true;
            default:
              return false;












        }
    }

}

