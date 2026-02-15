import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        try(Scanner s1=new Scanner(System.in)){
            System.out.println("Enter 1st number:");
            System.out.println("Enter 2nd number:");
            int x=s1.nextInt();
            int y=s1.nextInt();
            int z=x+y;
            System.out.println("Addition is: " + z);
        };
    };
};
