package dataStructure.Recursion;

/**
 * 汉诺塔
 */
public class Hanoi {

   public static void main(String[] args) {
       hanio(10,'a','b','c');
       System.out.println(count);
    }
    static int count = 0;
    public  static void hanio(int n, char x,char y,char z){
        if (n == 1)move(x,n,z);
        else {
            hanio(n-1,x,z,y);
            move(x,n,z);
            hanio(n-1,y,x,z);
        }
    }
    public static void move(char x,int n,char y){
        System.out.println("move "+n+"from "+x+"to "+y);
        count++;
    }
}
