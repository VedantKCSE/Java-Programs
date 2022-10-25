class Combination {
 
static int nCr(int n, int r)
{
    return factorial(n) / (factorial(r) *
                  factorial(n - r));
}
 
static int factorial(int n)
{
      if(n==0)
      return 1;
    int result = 1;
    for (int i = 2; i <= n; i++)
        result = result * i;
    return result;
}

public static void main(String[] args)
{
    int N = 7, R = 2;
    System.out.println(nCr(N, R));
}
}
 
