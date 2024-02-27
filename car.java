class car
{
    public static void main(String args [])
    {
        double total_price=0 ;
        int ch,quantity;
         System.out.println("1 seat cover");
         System.out.println("2 streing wheel cover");
          System.out.println("3  car lighting");
           System.out.println("4 air purifiters");
            System.out.println("5 all other items have");
        
        ch=Integer.parseInt(args[0]);
        quantity=Integer.parseInt(args[1]);

        switch(ch)
        {
            case 1:
                total_price=200*quantity+(1*200/100);
                break;
             case 2:
                total_price=300*quantity+(2*200/100);
                break;
            case 3:
                total_price=400*quantity+(3*200/100);
                break;
            case 4:
                total_price=300*quantity+(2.5*200/100);
                break;
            case 5:
                total_price=200*quantity+(1.5*200/100);
                break;
            default:
                System.out.println("no valid");       
        }
        System.out.println(" price "+ total_price);
    }
}