package com.kirthika;

import java.util.*;

public class Main {

    public static boolean isBalanced(String expression) {
        Stack<Character> brackets= new Stack<>();
        for(int i=0;i<expression.length();i++){
            Character curr = expression.charAt(i);
            if(curr=='{'){
                brackets.add('}');
            }else if(curr=='['){
                brackets.add(']');
            }else if(curr=='('){
                brackets.add(')');
            }else if(brackets.isEmpty()||brackets.pop()!=curr){
                return false;
            }
        }
        return brackets.isEmpty();
    }


    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
