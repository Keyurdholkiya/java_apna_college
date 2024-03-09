public class NQueens {
    public static boolean isSafe(char [][]arr , int row , int col){
        //vertical
        for (int i = row-1 ; i >=0 ; i--){
            if (arr[i][col]=='q'){
                return false;
            }
        }
        //dai left
        for (int i=row-1 , j=col-1 ; i>=0&&j>=0 ; i--,j--){
            if (arr[i][j]=='q'){
                return false;
            }
        }
        //dai right
        for (int i=row-1,j=col+1;i>=0&&j< arr.length;i--,j++){
            if (arr[i][j]=='q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char [][]arr , int row ){

        if (row == arr.length){
            arrDisplay(arr);
            return;
        }
        for (int j = 0 ; j < arr.length ; j++){
            if (isSafe(arr,row,j)){
                arr[row][j]='q';
                nQueen(arr,row+1);
                arr[row][j]='.';
            }
        }
    }
    public static void arrDisplay(char [][]arr){
        System.out.println("--------------------");
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int n = 5;
        char [][]arr = new char[n][n];
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '.';
            }
        }
        nQueen(arr,0);

    }
}
