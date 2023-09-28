import java.util.Scanner;

public class LowestValues {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int valCount;
        double inValue;
        int i;

        valCount = scnr.nextInt();

        // Read the first value I put this code outside the for loop
        inValue = scnr.nextDouble();
        double lowestVal = inValue;  // Initialize with the first value


        System.out.println("Value read: " + inValue);

        // Loop valCount - 1 times to read the rest of the values
        for (i = 1; i < valCount; i++) {
            inValue = scnr.nextDouble();
            System.out.println("Value read: " + inValue);

            if (inValue < lowestVal) {  // If the new value is less than lowestVal
                lowestVal = inValue;     // Update lowestVal
            }
        }

        System.out.println("Lowest: " + lowestVal);
    }
}
