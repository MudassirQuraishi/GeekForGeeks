public class GeekForGeeks_9 {

        public static void print_array(int [] arr){
            for( int i : arr){
                System.out.println(i);
            }
        }
        public static int[] sort_array(int [] arr){
            int length = arr.length;
            int max = arr[length-1];
            arr[length-1] = -1;
            for(int i = length-2 ; i>=0; i--){
                int temp = arr[i];
                arr[i] = max;
                if(temp > max) max = temp;
            }
            return  arr;
        }


        public static void main(String[] args) {
            int [] arr ={16,17,5,4,2,1};
            print_array(sort_array(arr));
        }
    }


