import java.util.Arrays;
import java.util.*;
public class LargestInArrayfind{
public static int getLargest(int[] a, int total){
Arrays.sort(a);
return a[total-1];
}

public static void main(String args[]){
Scanner input=new Scanner(System.in);
int num=input.nextInt();
int a[]=new int [num];

for(int i=0; i<num; i++){
  System.out.println("numbers "+i+ " : ");
  a[i]=input.nextInt();
}
for(int x:a) System.out.println(x);
  System.out.print("Highest Number:");
  System.out.println(getLargest(a,a.length));

}

}
