public class GeekForGeeks_6 {
    public static int missingNumber(int A[], int N)
    {
        // Your code goes here
        int sum = (N *(N+1))/2;
        for(int i = 0; i < N; i++){
            sum -= A[i];
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
