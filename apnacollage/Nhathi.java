public class Nhathi {
    public static boolean isSafe(char [][]ches,int row ,int i){
        for (int j = row-1 ; j >=0 ; j--){
            if (ches[j][i] == 'H'){
                return false;
            }
        }
        return true;
    }
    public static void nathi (char [][]ches , int row){
        if (row == ches.length){
            prints(ches);
            return;
        }
        for (int j = 0 ; j < ches.length ; j++){
            if (isSafe(ches,row,j)){
                ches[row][j]='H';
                nathi(ches,row+1);
                ches[row][j]='.';
            }
        }
    }
    public static void prints(char [][]ches){
        System.out.println("------------------------");
        for (int i = 0 ;  i  < ches.length ; i++){
            for (int j = 0 ; j < ches.length ; j++){
                System.out.print(ches[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        int n= 4;
        char [][]ches = new char[n][n];
        for (int i = 0 ; i < ches.length ; i++){
            for (int j= 0 ; j < ches.length ; j++){
                ches[i][j]='.';
            }
        }
        nathi(ches,0);
    }
}
