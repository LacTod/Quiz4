
/*Java Program to put the even and odd elements in two separate array*/
import java.util.Scanner;

public class quizArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize; // Declare array size
        System.out.println("Enter the size of the array");
        arraySize = scan.nextInt(); // Initialize array size

        int arr[] = new int[arraySize]; // Declare array
        System.out.println("Enter the array");
        for (int i = 0; i < arraySize; i++) // Initialize array
        {
            arr[i] = scan.nextInt();
        }

        int m = 0, n1 = 0; // Declare the size of the array for even and odd elements
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] % 2 == 0)
                m++; // Increment even array size
            else
                n1++; // Increment odd array size
        }
        int even[] = new int[m]; // Declare an even array
        int odd[] = new int[n1]; // Declare an odd array

        int k = 0, t = 0;
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] % 2 == 0) {
                even[k] = arr[i]; // Initialize elements of even array
                k++;
            } else {
                odd[t] = arr[i]; // Initialize elements of odd array
                t++;
            }
        }

        System.out.println("The array with even elements...");
        for (int i = 0; i < m; i++) {
            System.out.print(even[i] + " "); // Print Even Array
        }
        System.out.println("");
        System.out.println("The array with odd elements...");
        for (int i = 0; i < n1; i++) {
            System.out.print(odd[i] + " "); // Print Odd Array
        }

    }
}