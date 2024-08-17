class Solution {
    public boolean isValid(String s) {
        if(s.length()<2 || s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']'){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(s.charAt(i)==')'){
                    if(stack.isEmpty()){
                        return false;
                    }else if(stack.peek()!='('){
                        return false;
                    }else{
                        stack.pop();
                    }
                }if(s.charAt(i)==']'){
                    if(stack.isEmpty()){
                        return false;
                    }else if(stack.peek()!='['){
                        return false;
                    }else{
                        stack.pop();
                    }
                }if(s.charAt(i)=='}'){
                    if(stack.isEmpty()){
                        return false;
                    }else if(stack.peek()!='{'){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
            }
        }return stack.isEmpty();
    }
}