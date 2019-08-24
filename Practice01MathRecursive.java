public class Practice01MathRecursive implements Practice01Math
{

    public int fact (int n) throws Exception
    {

        if (n < 0){
            throw new Exception("negative number");    //throws exception for negative numbers
        } else if (n == 0) {                           //base case
            return 1;
        } else {
            return n * fact(n - 1);                 //recursive call
        }

    }

    public int fib (int n) throws Exception
    {
        if (n < 0){
            throw new Exception("negative number");    //throws exception for negative numbers
        } else if( n==0 || n == 1)                     //base case
        {
            return n;
        }else{
            return fib(n-1) + fib(n-2);         //recursive call
        }
    }
}