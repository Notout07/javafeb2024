class classtest
 {
    public static void main(String args[])
    {
        double total_price=0;
        int ch,quantity;
        System.out.println("1 to seat covers");
        System.out.println("2 to steering wheel covers");
        System.out.println("3 to  car lighting ");
        System.out.println("4 for air purifiers");
        System.out.println("5 All other items have code or more ");

        ch=Integer.parseInt(args[0]);
        quantity=Integer.parseInt(args[1]);
        switch (ch)
         {
            case 1:
              total_price =200*quantity+ (2*200/100);
              break;
            case 2:
             total_price =400*quantity+ (3*200/100);
             break;
            
            case 3:
              total_price =300*quantity+ (4*200/100);
              break;
             
            case 4:
              total_price =100*quantity+ (25*200/100);
              break;
            
            case 5:
              total_price =50*quantity+ (15*200/100);
              break;
              default: System.out.println("invalid choise");
        }
        System.out.println( "price=" + total_price);
    }
}