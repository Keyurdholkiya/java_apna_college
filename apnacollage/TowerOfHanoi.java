public class TowerOfHanoi {
    public static void tower(int disk,String s , String d , String h){
        if (disk == 1){
            System.out.println(disk+" trasfer to "+s+" to "+d);
            return;
        }
        tower(disk-1,s,h,d);
        System.out.println(disk+" trasfer to "+s+" to "+d);
        tower(disk-1,h,d,s);
    }

    public static void main(String[] args) {
        int disk = 10;
        tower(disk,"s","d","h");
    }
}
