import java.util.Stack;

public class Stack {
    //valid parentheses
    public static boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        String open="({[";
        open.contains('['+"");
        HashMap<Character,Character>map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(open.contains(ch+"")){
                stack.push(ch);
            }else{
                if(stack.isEmpty() || stack.peek()!=map.get(ch)){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
    }
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.add('r');
        stack.add('a');
        stack.add('v');
        stack.add('i');

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
