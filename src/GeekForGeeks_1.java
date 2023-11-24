import java.util.HashMap;

public class GeekForGeeks_1 {
    public static boolean check(long A[],long B[],int N)
    {
        ///Your code here
        if(A.length != B.length) return false;

        HashMap<Long,Integer> frequencyMap = new HashMap<>();
        for(long element : A){
            frequencyMap.put(element, frequencyMap.getOrDefault(element,0)+1);
        }

        for(long element : B){
            if(!frequencyMap.containsKey(element)) return false;
            int count = frequencyMap.get(element);
            if(count == 1) frequencyMap.remove(element);
            else frequencyMap.put(element,count-1);
        }
        return frequencyMap.isEmpty();
    }
    public static void main(String[] args) {

    }

}