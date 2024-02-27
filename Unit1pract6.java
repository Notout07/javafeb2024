public class Unit1pract6 {
    double Area(double l, double b)
    {
        return(l * b);
    }
    double Area(double a)
    {
        return(a * a);
    }
    
    public static void main(String[] args) {
        Unit1pract6 v=new Unit1pract6();
        double n=v.Area(12,3.1);
        System.out.println("Area of Rectangle is " + n);
        
        double k=v.Area(4.2);
        System.out.println("Area of Rectangle is " + k);
    }
}