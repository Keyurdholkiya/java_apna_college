import java.util.Stack;

public class MaxAreaInHistogram {
    public static void maxArea(int []height){
        int max = 0;
        int []nsl = new int[height.length];
        int []nsr = new int[height.length];
        //net smaller right
        Stack<Integer> sc = new Stack<>();
        for (int i= height.length-1; i > 0 ; i--){
            while (!sc.isEmpty() && height[sc.peek()] >= height[i]){
                sc.pop();
            }
            if (sc.isEmpty()){
                nsr[i] = height.length;
            }else {
                nsr[i] = sc.peek();
            }
            sc.push(i);
        }
        //net smaller left
         sc = new Stack<>();
        for (int i= 0; i < height.length ; i++){
            while (!sc.isEmpty() && height[sc.peek()] >= height[i]){
                sc.pop();
            }
            if (sc.isEmpty()){
                nsl[i] = -1;
            }else {
                nsl[i] = sc.peek();
            }
            sc.push(i);
        }
        //find area
        for (int i = 0 ; i < height.length ; i++){
            int currHeight = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = currHeight * width;
            max = Math.max(area,max);
        }
        System.out.println(max);
    }
    public static void main(String []args){
        int []height = {2,4};
        maxArea(height);
    }
}
