public class GeekForGeeks_7 {
    public static boolean matrixSearch(int[][] matrix, int target){
        int m = matrix.length;
        if(m == 0) return false;
        int n = matrix[0].length;
        int row = 0;
        int column = n-1;
        while(row < m && column >= 0){
            if(matrix[row][column] == target ) return true;
            else if( matrix[row] [column] < target) row++;
            else column--;
        }
        return false;
    }
    public static void main(String[] args) {
        int target = 343;
        int[][] arr ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(matrixSearch(arr,target));
    }
}
