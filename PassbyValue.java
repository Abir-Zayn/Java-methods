public class PassbyValue
{
    public static void main(String[] args) {
        //Methods using => pass by value. not by reference.
        int c,d;
        c=10;
        d=20;
        swapping(c,d);
        System.out.println(" C value is "+ c);
        System.out.print("D value is "+ d);
        
    }
    static void swapping(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a +" "+b);

    }
 
}
