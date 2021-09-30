import java.util.Scanner;

public class sum {

    int methodSum(int x, int y ){         //creating a method
        int add = x + y;                 
        return add;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //storing values 
        int j=scanner.nextInt();
        int k=scanner.nextInt();

        sum addition= new sum();              //creating an object
        int result = addition.methodSum(j,k);   // calling the object

        System.out.println(result);
        scanner.close();

    }
}
