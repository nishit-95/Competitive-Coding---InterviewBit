import java.util.*;

public class RepeatedNumber {
    public ArrayList<Integer> repeatedNumber(final List<Integer> arr) {
        int n = arr.size();
        long sumN = (long) n * (n + 1) / 2; // expected sum of 1 to n
        long sumSqN = (long) n * (n + 1) * (2 * n + 1) / 6; // expected sum of squares of 1 to n
        
        long sum = 0, sumSq = 0;
        
        // Calculate actual sum and sum of squares from the array
        for (int num : arr) {
            sum += num;
            sumSq += (long) num * num;
        }

        // diff1 = A - B
        long diff1 = sum - sumN;
        
        // diff2 = A^2 - B^2 = (A - B)(A + B)
        long diff2 = sumSq - sumSqN;
        
        // diff2 / diff1 = A + B
        long sumAB = diff2 / diff1;
        
        // A = (diff1 + sumAB) / 2
        long A = (diff1 + sumAB) / 2;
        
        // B = sumAB - A
        long B = sumAB - A;
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) A); // Repeated element
        result.add((int) B); // Missing element
        
        return result;
    }
}
