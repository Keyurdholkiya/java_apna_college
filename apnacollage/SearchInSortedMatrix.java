public class SearchInSortedMatrix {
    public static boolean stairCase(int[][] arr, int key) {
        int colum = 0;
        int row = arr.length-1;
        while (row >= 0 && colum <= arr[0].length-1) {
            if (arr[row][colum] == key) {
                System.out.println("key is found ("+row+","+colum+")");
                return true;
            } else if (key < arr[row][colum]) {
                row--;
            } else {
                colum++;
            }
        }
        return false;
    }
    public static void searching(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("key place is := " + "(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        //searching(arr, 39);
        System.out.println(stairCase(arr,30));

    }
}

