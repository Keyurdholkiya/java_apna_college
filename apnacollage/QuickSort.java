public class QuickSort {
    public static void quickSort(int []arr,int st,int ed){
        if (st >= ed){
            return;
        }
        int index = partition(arr,st,ed);
        //left
        quickSort(arr,st,index-1);
        //right
        quickSort(arr,index+1,ed);
    }
    public static int partition(int []arr,int st,int ed){
        int pit = arr[ed];
        int i = st-1;
        for (int j = st ; j < ed ; j++){
            if (arr[j] <= pit){
                //space
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //make space to place pit
        i++;
        int tem = pit;
        arr[ed] = arr[i];
        arr[i] = tem;
        return i;
    }

    public static void printArray(int []arr){

    }
    public static void main(String []args){
        int []arr = {6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        for (int i = 0 ; i <arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
