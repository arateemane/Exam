public class Fibb {

    public static void main()
    {
        int n = 10;
        int f1 = 0;
        int f2 = 1;
        for(int i = 1; i<=n; ++i)
        {
            System.out.print(f1+", ");

            int next = f1+f2;
            f1 = f2;
            f2 = next;
        }
    }
    
}
