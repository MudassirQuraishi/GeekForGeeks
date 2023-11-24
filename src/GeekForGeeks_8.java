public class GeekForGeeks_8 {
    public long totalFine( long n, long date, long car[], long fine[])
    {
        long totalFine = 0;
        if(date % 2 == 0){
            for(int i = 0; i < car.length; i++){
                if(car[i] % 2 != 0) totalFine += fine[i];
            }
        }
        else{
            for(int i= 0; i < car.length; i++){
                if(car[i] % 2 == 0) totalFine += fine[i];
            }

        }
        return totalFine;
    }
    public static void main(String[] args) {

    }
}
