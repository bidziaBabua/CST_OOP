import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++){
            arr[i] = input.nextInt();
        }

        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < arrLength; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println((int)min);
    }
}
