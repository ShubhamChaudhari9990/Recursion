//  print fibonacci series 
public class Recursion4 {
    public static void printFibo(int f,int s,int n)
    {
        if(n==0)
        {
            return;
        }
        int c = f + s;
        System.out.println(c);
        printFibo(s, c, n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        printFibo(a, b, n-2);
    }
}
