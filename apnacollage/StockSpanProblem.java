import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int []stocks = {100,80,60,70,60,85,100};
        int []span = new int[stocks.length];
        stockSpan(stocks,span);
    }
    private static void stockSpan(int []stocks , int []span) {
        Stack<Integer> sc = new Stack<>();
        span[0] = 1;
        sc.push(0);
        for (int i = 1 ; i < stocks.length ; i++){
            int currStocksPrince = stocks[i];
            while (!sc.isEmpty() && currStocksPrince > stocks[sc.peek()]){
                sc.pop();
            }
            if (sc.isEmpty()){
                span[i] = i+1;
            }else {
                int prev = sc.peek();
                span[i] = i - prev;
            }
            sc.push(i);
        }
        for (int i = 0 ; i < span.length ; i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
}
