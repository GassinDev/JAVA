public class Main {
    public static void main(String[] args) {

        int n,divisores;

        for (n = 2; n <= 1000; n++)
        {
            divisores = 0;

            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    divisores++;
                    break;
                }
            }

            if (divisores == 0)
            {
                System.out.println(n);
            }
        }
    }
}