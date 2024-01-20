public class SortThePeople {
    public static void main(String[] args) {
        String []names = {"mary","john","emma"} ;
        int [] heights = {180,165,170};
        for (int  i = 0 ; i <heights.length ; i++){
            for (int j = i+1 ; j <heights.length; j++){
                if (heights[i] < heights[j]){
                    int temp ;
                    temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    String temp1 ;
                    temp1 = names[i] ;
                    names[i] = names[j];
                    names[j] = temp1;
                }
            }
            System.out.print(heights[i]);
            System.out.println(names[i]);
        }
    }
}
