package javaCode;

import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        int l = s.length();
        HashMap <Character, Character> keys = new HashMap<>(3);
        keys.put(')', '(');
        keys.put('}', '{');
        keys.put(']', '[');

        Stack<Character> stack = new Stack<>();

        if (l > 1) {
            for (int i = 0; i <= l-1; i++) {
                char c = s.charAt(i);

                if (keys.containsValue(c)){
                    stack.push(c);
                }
                if (keys.containsKey(c)){
                    if(stack.isEmpty() || stack.peek() != keys.get(c)) return false;
                    else {
                        if(stack.peek() == keys.get(c)) stack.pop();
                    }
                }
            }

        }else return false;
        return stack.isEmpty();
    }
}
