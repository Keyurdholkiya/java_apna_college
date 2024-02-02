public class FriendsPairingProblem {
    public static int friendPairing(int friend){
        if (friend == 1 || friend == 2){
            return friend;
        }
        //single
        int single = friendPairing(friend-1);
        //pair
        int pair = friendPairing(friend-2);
        //pairWays
        int pairWays = (friend-1)*pair;
        int total = single+pairWays;
        return total;
    }
    public static void main (String []args){
        int friends = 3;
        System.out.println(friendPairing(friends));
    }
}
