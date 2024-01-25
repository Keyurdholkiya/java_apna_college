public class SpiralMatrix {
    public static void spiralMatrix(int [][]arr){
        int startRow = 0;
        int endRow=arr.length-1;
        int startColum=arr[0].length-1;
        int endColum=0;
        while (startRow < endRow && startColum > endColum){
            //top print
            for (int j = startColum ; j >= endColum ; j--){
                System.out.print(arr[startRow][j]+" ");
            }
            //left print
            for (int i = startRow+1 ; i <= endRow ; i++){
                System.out.print(arr[i][endColum]+" ");
            }
            //bottom print
            for (int j = endColum+1 ; j <= startColum ; j++){
                if (startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }
            //right print
           for (int i = endRow-1 ; i > startRow ; i--){
               if (startColum == endColum ){
                   break;
               }
               System.out.print(arr[i][startColum]+" ");
           }
            startRow++;
            endRow--;
            startColum--;
            endColum++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
                spiralMatrix(arr);
    }
}
