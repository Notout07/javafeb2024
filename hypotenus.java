public class hypotenus 
{
    public static void main(String[] args) 
    {
        int n,v;
        double k,ans;

        v=Integer.parseInt(args[0]);
        n=Integer.parseInt(args[1]);

        k=(n * n) + (v * v);
        ans=Math.sqrt(k);

        System.out.println(" Hypotenus = " + ans);
    }
}