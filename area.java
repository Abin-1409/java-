import java.util.Scanner;
public class area{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length ");
        float l=sc.nextFloat();
        System.out.println("enter breadth ");
        float b=sc.nextFloat();
        float area=l*b;
        float perimeter=2*l+b;

        System.out.println("area is :"+ area + "perimeter is :"+ perimeter);


    }
}
