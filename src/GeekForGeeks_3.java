class Pair{
    long max,min;
    public Pair(long max, long min){
        this.max = max;
        this.min =min;
    }
}
public class GeekForGeeks_3 {
     public static Pair getMinMax(long a[], long n)
    {
        //Write your code here
        long maximum = Integer.MIN_VALUE;
        long minimum = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
            if(a[i] > maximum) maximum = a[i];
            if(a[i] < minimum) minimum = a[i];
        }
        return new Pair(minimum, maximum);
    }
    public static void main(String[] args) {

    }
}
