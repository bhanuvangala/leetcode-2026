import java.util.Stack;
import java.util.HashMap;

public class ValidParentheses {

    // Valid Parentheses
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        String open = "({[";
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket
            if (open.contains(ch + "")) {
                stack.push(ch);
            }
            // If closing bracket
            else {
                if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                    return false;
                }
                stack.pop();
            }
        }

        // Stack must be empty for valid parentheses
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
    }
}
