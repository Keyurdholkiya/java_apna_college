public class NQueensPractice {
    public static void nQueen(char [][]ches , int row){
        if (row == ches.length){
            arrPrint(ches);
            return;
        }
        for (int i = 0 ; i < ches.length ; i++){
            ches[row][i] = 'Q';
            nQueen(ches,row+1);
            ches[row][i] = '.';
        }
    }
    public static void arrPrint(char [][]ches){
        System.out.println("--------------------");
        for (int i = 0 ; i <ches.length ; i++){
            for (int  j = 0 ; j < ches.length ; j++){
                System.out.print(ches[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int n = 2;
        char [][]ches = new char[n][n];
        for (int i = 0 ; i < ches.length ; i++){
            for (int j = 0 ; j < ches.length ; j++){
                ches[i][j] = '.';
            }
        }
        nQueen(ches,0);
    }
}
