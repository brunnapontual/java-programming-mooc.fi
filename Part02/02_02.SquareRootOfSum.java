import java.util.Scanner;
 
public class SquareRootOfSum {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int n2 = Integer.valueOf(scanner.nextLine());
        
        int squareRoot = (int) Math.sqrt( n + n2 );
        
        System.out.println(squareRoot);
 
    }
}
