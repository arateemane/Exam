public class Armstrong {
    
    public static void main(String args[])
    {
        int n = 371, o , r, res=0;
        o = n;
         
        while(o != 0)
        {
            r = o%10;
            res += Math.pow(r,3);
            o /= 10;
        }

        if(res == n)
        {
            System.out.println("This no is Armstrong");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
