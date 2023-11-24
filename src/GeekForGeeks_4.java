public class GeekForGeeks_4 {
    public static int findMissing(int[] arr, int n) {
        // code here
        int commonDiff = (arr[arr.length - 1] - arr[0]) / arr.length;

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] + commonDiff != arr[mid + 1]) {
                return arr[mid] + commonDiff;
            }

            if (arr[mid] - commonDiff != arr[mid - 1]) {
                return arr[mid] - commonDiff;
            }

            if (arr[mid] == arr[0] + mid * commonDiff) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
