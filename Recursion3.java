// print factorial of number
public class Recursion3 {
    public static int calculateFact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }

        int fact = calculateFact(n-1);
        int res = fact * n;
        return res;
    }
    public static void main(String[] args) {
        
        System.out.println(calculateFact(5));
    }
}
