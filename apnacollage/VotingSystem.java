public class VotingSystem {
    public static void votingSystem (int []arr){
        int win = arr[0] , led = 1;
        for (int i = 1 ; i <= arr.length-1 ; i++){
            if (win == arr[i]){
                led++;
            }else if (led>=0){
                led--;
            }else {
                win = arr[i];
                led=1;
            }
        }
        System.out.println(win);
    }
    public static void main(String []args){
        int []arr = {2,3,3,4,5,3,3,7,8,3,3};
        votingSystem(arr);
    }
}
