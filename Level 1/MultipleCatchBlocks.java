import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sn.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) nums[i] = sn.nextInt();
        System.out.print("Enter the index you want to access: ");
        int index = sn.nextInt();
        try {
            System.out.println("Value at index " + index + ": " + nums[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        sn.close();
    }
}
