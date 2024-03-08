import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParentheses
{
    public boolean isValid(String s)
    {
        Deque<Character> string = new ArrayDeque<>();
        for (char c : s.toCharArray())
            switch (c)
            {
                case '(':
                    string.push(')');
                    break;
                case '{':
                    string.push('}');
                    break;
                case '[':
                    string.push(']');
                    break;
                default:
                    if(string.isEmpty()||string.pop()!=c)
                        return false;
            }
        return string.isEmpty();
    }
}