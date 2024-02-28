public class ValidParentheses
{
    public static void main(String[] args)
    {
        System.out.println("is valid parentheses is:"+isValid("(){}[][]()[]"));
    }
    public static boolean isValid(String s) {
        char openBrackets1 = '(';
        char closeBrackets1 = ')';
        char openBrackets2 = '{';
        char closeBrackets2 = '}';
        char openBrackets3 = '[';
        char closeBrackets3 = ']';
        boolean isValid = false;
        for (int i = 0; i<s.length()-1; i=i+2 )
        {
            int k = i;
            if((s.charAt(k)==openBrackets1 && s.charAt(++k)==closeBrackets1)||
                    (s.charAt(k)==openBrackets2 && s.charAt(++k)==closeBrackets2)||
                    (s.charAt(k)==openBrackets3 && s.charAt(++k)==closeBrackets3))
                isValid = true;
            else
                isValid = false;
        }
        return isValid;
    }
}