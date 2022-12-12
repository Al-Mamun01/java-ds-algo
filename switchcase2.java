import java.util.*;

public class switchcase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("hello world");
                break;
            case 2:
                System.out.println("noghty Amaricka");
                break;
            case 3:
                System.out.println("I don't know ");
                break;
            default:
                System.out.println("I dont know ");
                break;
        }
    }
}
