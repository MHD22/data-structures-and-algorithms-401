package utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        Pattern openBracket = Pattern.compile("[{(\\[]");
        Pattern closeBracket = Pattern.compile("[})\\]]");
        Pattern matchBrackets = Pattern.compile("(\\{\\})|(\\[\\])|(\\(\\))");

        Stack<Character> validator = new Stack<Character>();
        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);
            if(openBracket.matcher(ch+"").find()){
                validator.push(ch);
            }
            else if (closeBracket.matcher(ch+"").find()){
                if(validator.isEmpty())
                    return false;
                char currentOpenBracket = validator.pop();
                String currentBrackets= currentOpenBracket+""+ch;
                if(matchBrackets.matcher(currentBrackets).find())
                    continue;
                return false;
            }
        }
        if(validator.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Pattern openBracket = Pattern.compile("[{(\\[]");
        Pattern closeBracket = Pattern.compile("[})\\]]");
        Pattern matchBrackets = Pattern.compile("(\\{\\})|(\\[\\])|(\\(\\))");
        System.out.println(multiBracketValidation("{"));

    }
}
