import java.util.Objects;

public class FinalValueOfVariable {
    public static int calculate(String []operations){
        int x = 0;
        for (int i=0;i<operations.length;i++){
            String name = operations[i];
            if (Objects.equals(name, "x++") || Objects.equals(name, "++x")){
                x++;
            }else {
                x--;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        String []operations = {"--x","x++","x++"};
        int result = FinalValueOfVariable.calculate(operations);
        System.out.println(result);
    }
}
