public class maxSmall {

    public static  void maxNumber(int x,int y, int z){

        int a=x;
        int b=y;
        int c=z;
        if((a >b ) && (a>z)){
            System.out.println(a+ " is bigger");
        }
            else if((b >c) && (b>a)){
                System.out.println(b+ " is bigger");
            }
            else if((c >b) && (c>a)){
                System.out.println(c+ " is bigger");
            }
        
    }

    public static void main(String[] args) {           
       maxNumber(10,9,8);
    }
}
