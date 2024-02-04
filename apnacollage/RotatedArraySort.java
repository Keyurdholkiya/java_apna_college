public class RotatedArraySort {
    public static int rotatedArray(int []arr,int st,int ed,int tar){
        int mid = st+(ed-st)/2;
        for (int i=st ; i <=mid;i++ ){
            if (arr[i] == tar){
                return i;
            }
        }
        for (int j =  mid+1 ; j <=ed ; j++){
            if (arr[j]==tar){
                return j;
            }
        }
        return -1;
    }
    public static int methodRecursion(int []arr,int st,int ed,int tar){
        if (st>=ed){
            return -1;
        }
        int mid = st+(ed-st)/2;
        if (arr[mid]==tar){
            return mid;
        }        //kam
        if (arr[st] <= arr[mid]){
            if (tar >= arr[st] && tar<=arr[mid]){
                return methodRecursion(arr,st,mid,tar);
            }else {
                return methodRecursion(arr,mid+1,ed,tar);
            }
        }else {
            if (tar>=arr[mid] && tar<= arr[st]){
                return methodRecursion(arr,mid,ed,tar);
            }else {
                return methodRecursion(arr,st,mid-1,tar);
            }
        }
    }
    public static void main(String []args){
        //{0,1,2=pivotPoint,4,5,6,7}
        int []arr = {4,5,6,7,0,1,2};
        System.out.println(methodRecursion(arr,0,arr.length,2));
        //int index = rotatedArray(arr,0,arr.length-1,7);
       // System.out.println(index);
    }
}
