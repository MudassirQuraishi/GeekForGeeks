public class GeekForGeeks_10 {
    int remove_duplicate(int A[],int N){
        // code here
        int index = 1;
        int prevElement = A[0];
        for(int i  = 1; i< A.length; i++){
            if(A[i] != prevElement){
                A[index++] = A[i];
                prevElement = A[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {

    }
}
