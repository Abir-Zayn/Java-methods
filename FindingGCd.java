import java.util.*;
public class hello {

   static int findingGCd(int m , int n){

// GCD ==> GCD means find the highest common factorial between  two number.
       for(int i=m; i!=n; i++ ){
         if(m>n) m=m-n;
         else n=n-m;
       } 
       return m;
   }
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    System.out.print(findingGCd(a,b));
       scan.close();
    }
}
