class Refrence{
    String name = "keyur";
}
public class CallByRefrence {
    public static void change_value(Refrence re){
        re.name = "prachi";
    }
    public static void main(String[] args) {
        Refrence re  = new Refrence();
        change_value(re);
        System.out.println(re.name);
    }
}
