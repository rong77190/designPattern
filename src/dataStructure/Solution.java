package dataStructure;

import javafx.beans.binding.When;

import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0 ; i < tokens.length; i++){
            if (tokens[i].matches("[0-9]")){
                stack.push(Integer.parseInt(tokens[i]));
            }else {
                int p1 = stack.pop();
                int p2 = stack.pop();
                stack.push(cal(p1,p2,tokens[i].charAt(0)));
            }
        }
        return stack.peek();
    }
    public int cal(int a,int b,char op){
        switch(op){
            case '+':return a + b;
            case '-':return a - b;
            case '*':return a * b;
            case '/':return a / b;
            default:return 0;
        }
    }
}