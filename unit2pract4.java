public class unit2pract4
{
    public static void main(String[] args) 
    {
        int n, i;
        String Company[] = {"LG","SAMSUNG","SONY","PHILIPS","MI"};
        int price[]={1000,2000,1500,500,200};
        n = price.length;
        int low=price[0];
        for(i=0;i<=n;i++)
        {
            if(low > price[i])
            {
                low = price[i];
            }
            for(i=0; i<=n-1;i++)
            {
                if(low==price[i])
                {
                    System.out.println(Company[i]);
                }
            }
            System.out.println(low);
        }
    }
}