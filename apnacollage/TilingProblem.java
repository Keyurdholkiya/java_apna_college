public class TilingProblem {
    public static int tilingProblem(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        //vertical count
        int vertical = tilingProblem(num-1);
        //horizontal count
        int horizontal = tilingProblem(num-2);
        int total = vertical+horizontal;
        return total;
    }
    public static void main(String[] args) {
        int  num = 2;
        System.out.println(tilingProblem(2*num));
    }
}
