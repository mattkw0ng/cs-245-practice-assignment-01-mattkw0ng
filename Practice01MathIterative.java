public class Practice01MathIterative implements Practice01Math
{
    public int fact (int n) throws Exception
    {
        if (n < 0){
            throw new Exception("negative number");        //throws exception for negative numbers
        } else {
            int total = 1;
            for (int x = 1; x <= n; x++) {                 //starts at 1 and multiplies all integers until it reaches n
                total = total * x;
            }
            return total;
        }
    }

    public int fib (int n) throws Exception
    {
        if (n < 0){
            throw new Exception("negative number");        //throws exception for negative numbers
        }else {
            int total = 0;
            int n2 = 0;     // n - 2
            int n1 = 1;     // n - 1
            if (n > 1) {
                for (int x = 1; x < n ; x++) {
                    total = n2 + n1;
                    int t1 = n1;        //temporary value
                    n2 = t1;            //changes the value of n2 to equal n1
                    n1 = total;         //changes value of n1 to equal the total
                }
            } else if (n == 1) {        //fixes the total for n = 1
                total = 1;
            } else if (n == 0) {        //fixes the total for n = 0
                total = 0;
            }
            return total;
        }
    }
}