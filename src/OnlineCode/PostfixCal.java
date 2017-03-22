package OnlineCode;
import java.awt.*;
import java.util.Scanner;
import java.util.Stack;

public class PostfixCal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(postfixCal(str));
        TextArea ta = new TextArea("Hello", 5, 5);
    }




    public static int postfixCal(String str) {
        int p1, p2;
        Stack stack = new Stack();
        char[] ch = str.toLowerCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '+' && ch[i] != '-' && ch[i] != '*' && ch[i] != '/')
                switch (ch[i]) {
                    case 'a':
                        stack.push(10);
                        break;
                    case 'b':
                        stack.push(11);
                        break;
                    case 'c':
                        stack.push(12);
                        break;
                    case 'd':
                        stack.push(13);
                        break;
                    case 'e':
                        stack.push(14);
                        break;
                    case 'f':
                        stack.push(15);
                        break;
                    case '0':
                        stack.push(0);
                        break;
                    case '1':
                        stack.push(1);
                        break;
                    case '2':
                        stack.push(2);
                        break;
                    case '3':
                        stack.push(3);
                        break;
                    case '4':
                        stack.push(4);
                        break;
                    case '5':
                        stack.push(5);
                        break;
                    case '6':
                        stack.push(6);
                        break;
                    case '7':
                        stack.push(7);
                        break;
                    case '8':
                        stack.push(8);
                        break;
                    case '9':
                        stack.push(9);
                        break;
                    default:
                        stack.push(0);
                        break;
                }
            else{
                p2 = (Integer) stack.pop();
                p1 = (Integer) stack.pop();
                switch (ch[i]) {
                    case '+':stack.push( p1+p2);break;
                    case '-':stack.push( p1-p2);break;
                    case '*':stack.push(p1*p2);break;
                }
             }
        }
        return (Integer) stack.pop();
    }




}


