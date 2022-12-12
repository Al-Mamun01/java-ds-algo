
import java.util.*;
public class oddeven {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number1 = sc.nextInt();
        System.out.print("Enter Second Number :");
        int number2 = sc.nextInt();
        if(number1==number2){
            System.out.println("its equal number");
        }
        else if(number2>number1){
            System.out.println("number2 is big");
        }
        else{
            System.out.println("number1 is big");
        }
    }
}
