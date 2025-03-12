import java.util.Scanner;  

public class CompositeNumbers {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the upper limit to generate composite numbers: ");  
        int limit = scanner.nextInt();  
        System.out.println("Composite numbers up to " + limit + ":");  
        for (int num = 4; num <= limit; num++) {  
            boolean isComposite = false;  
            for (int i = 2; i <= Math.sqrt(num); i++) {  
                if (num % i == 0) {  
                    isComposite = true;  
                    break;  
                }  
            }  
            if (isComposite) {  
                System.out.print(num + " ");  
            }  
        }  
        scanner.close();  
    }  
}  
