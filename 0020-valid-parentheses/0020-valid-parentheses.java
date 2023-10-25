class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
            } else {
                if (stack.isEmpty())    return false;
                char temp = stack.pop();
                if (x == ')' && temp != '(')    return false;
                if (x == '}' && temp != '{')    return false;
                if (x == ']' && temp != '[')    return false;
            }
        }

        // System.out.println(stack);
        return stack.isEmpty();
    }
}