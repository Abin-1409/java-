import java.util.Scanner;
public class MaximumThree{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three number ");
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        if(first>second && first>third){
            System.out.println(first + " is large" );
        }
        else if(second>first && second>third){
            System.out.println(second + " is large" );
        }
        else {
            System.out.println(third + " is large" );
        }

    }
}

