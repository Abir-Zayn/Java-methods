public class MethodOverloading
{
    public static void main(String[] args) {
    
        //overloading method means =>  same method name with different parameter.
        
        int firstnum=10;
        int secondnum=12;
        int thirdnum=16;
        int result,result1,result2;
        result= maxof(firstnum, secondnum);
        System.out.println(result);
        
        result1= maxof(firstnum, secondnum, thirdnum);
        System.out.println(result1);
        
    }
        static int maxof(int a, int b){
            return (a>b)? a:b;
        }
        static int maxof(int a,int b,int c){
          // condition checking => if a is greater than b then check a is greater than c if yes then  a 
          //check if b is greater than c if yes then return b.
            return (a>b) ? ((a>c) ? a:c) :(b>c? b:c);
        }
}
