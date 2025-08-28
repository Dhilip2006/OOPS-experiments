import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            if (size <= 0) {
                throw new NegativeArraySizeException("Array size must be positive!");
            }
            int[] arr = new int[size];
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter first index: ");
            int i1 = sc.nextInt();
            System.out.print("Enter second index: ");
            int i2 = sc.nextInt();
            int a = arr[i1];
            int b = arr[i2];
            System.out.println("Choose operation: 1-Addition  2-Subtraction  3-Multiplication  4-Division");
            int choice = sc.nextInt();

            int result = 0;
            switch (choice) {
                case 1: result = a + b; break;
                case 2: result = a - b; break;
                case 3: result = a * b; break;
                case 4: result = a / b; break; 
                default: 
                    System.out.println("Invalid choice!");
                    return;
            }
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        } 
        catch (NegativeArraySizeException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integers!");
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        } 
        finally {
            System.out.println("Program execution finished (finally block).");
            sc.close();
        }
    }
}
