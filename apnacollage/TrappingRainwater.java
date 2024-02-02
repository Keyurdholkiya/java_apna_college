public class TrappingRainwater {
    public static void trappingRainwater(int []height){
        //left max
        int []left = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i  < height.length ; i++){
            left[i] = Math.max(height[i] , left[i-1]);
        }
        //right max
        int []right = new int[height.length];
        right[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >= 0 ; i--){
            right[i] = Math.max(height[i] , right[i+1]);
        }
        int trappedWater=0;
        for (int i = 0 ; i < height.length ; i++){
            int waterLevel = Math.min(left[i] , right[i]);
            trappedWater += waterLevel - height[i];
        }
        System.out.println(trappedWater);
    }
    public static void main(String []args){
        int []height = {4,2,0,6,3,2,5};
        trappingRainwater(height);
    }
}
