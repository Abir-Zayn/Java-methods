public class Main
{
    public static void main(String[] args) {
  //find out bigger number in java out of two numbers   
        int firstnum=10;
        int secondnum=12;
        int result= maxof(firstnum, secondnum);
        System.out.println(result);
    }
        static int maxof(int a, int b){
            return (a>b)? a:b;
        }
  
}
