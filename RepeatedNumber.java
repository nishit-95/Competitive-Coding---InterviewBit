import java.util.*;
public class RepeatedNumber {
    public ArrayList<Integer> repeatedNumber(final List<Integer> arr) {
        int n = arr.size();
        long sumN = (long) n * (n + 1) / 2; 
        long sumSqN = (long) n * (n + 1) * (2 * n + 1) / 6; 
        
        long sum = 0, sumSq = 0;
        
        for (int num : arr) {
            sum += num;
            sumSq += (long) num * num;
        }

        long diff1 = sum - sumN;
        
        long diff2 = sumSq - sumSqN;
        
        long sumAB = diff2 / diff1;
        
        long A = (diff1 + sumAB) / 2;
        
        long B = sumAB - A;
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) A); 
        result.add((int) B);
        
        return result;
    }
}
