import java.util.*;
public class loop4 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your coloumn: ");
        int number1 = sc.nextInt();
        System.out.print("enter your row : ");
        int number2 = sc.nextInt();
       
        for(int i =1; i<=number1; i++){
            for(int j =1; j<=number2; j++){
                if (i==1||j==1||number1==i||number2==j) {
                    System.out.print("*");
                }
                else
                {System.out.print(" ");}
            }
            System.out.println();
        }
        

    }
}
