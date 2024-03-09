import java.util.ArrayList;

public class ContainMostWater {
    public static int containWater(ArrayList<Integer> water){
        int max = 0 ;
        for (int i = 0 ; i < water.size() ; i++){
            for (int j = i+1 ; j < water.size() ; j++){
                int height = Math.min(water.get(i),water.get(j));
                int width = j-i;
                int total = height * width;
                max = Math.max(max,total);
            }
        }
        return max;
    }
    public static void main(String []args){
        ArrayList<Integer> water = new ArrayList<>();
        water.add(1);
        water.add(8);
        water.add(6);
        water.add(2);
        water.add(5);
        water.add(4);
        water.add(8);
        water.add(3);
        water.add(7);
        System.out.println(containWater(water));
    }
}
