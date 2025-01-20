package nguyenphutuan_1006;
import java.util.ArrayList;
public class UpdateAnElement {
    public static void main(String[] args){
        ArrayList<String> color= new ArrayList<>();
        color.add("red");
        color.add("white");
        color.add("blue");
        color.add("orange");
        color.add("black");
        color.set(1, "yellow");
        System.out.println(color);
    }
}
