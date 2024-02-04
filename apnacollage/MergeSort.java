public class MergeSort {
    public static void sortArray(int []arr , int st , int en ){
        if (st >=en){
            return;
        }
        int mid = st+(en-st)/2;
        //left
        sortArray(arr,st,mid);
        //right
        sortArray(arr,mid+1,en);

        merge(arr,mid,st,en);
    }
    public static void merge(int []arr,int mid,int st,int ed){
        int []temp = new int[ed-st+1];
        int i = st;
        int j = mid+1;
        int tempI=0;
        while (i <= mid && j <= ed){
            if (arr[i] < arr[j]){
                temp[tempI] = arr[i];
                i++;
            }else {
                temp[tempI] = arr[j];
                j++;
            }
            tempI++;
        }
        //left
        while (i <= mid){
            //temp[tempI++] = arr[i++];
            temp[tempI] = arr[i];
            i++;
            tempI++;
        }
        //right
        while (j <= ed){
            //temp[tempI++] = arr[j++];
            temp[tempI] = arr[j];
            j++;
            tempI++;
        }
        for (tempI =0 ;tempI<temp.length;tempI++){
            arr[tempI+st] = temp[tempI];
            //System.out.print(temp[k]);
        }
    }
    public static void printArray(int []arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {6,3,9,5,2,8};
        sortArray(arr,0,arr.length-1);
        printArray(arr);
        int []temp = new int[arr.length];
        int i = 0;
        int j = 0;
        for ( i=0, j=0;i<arr.length;i++,j++){
            temp[j] = arr[i];
        }
        System.out.println("i am arr array");
        for (int l : arr){
            System.out.print(l+" ");
        }
        System.out.println();
        System.out.println("i am temp array ");
        //System.out.println();
        for(int k : temp){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
