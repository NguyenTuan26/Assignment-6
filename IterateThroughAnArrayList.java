package nguyenphutuan_1006;

import java.util.ArrayList;

public class IterateThroughAnArrayList {
    public static void main(String[] args){
        ArrayList<Double> value = new ArrayList<>();
        value.add(10.5);
        value.add(16.4);
        value.add(7.2);
        value.add(1.45);
        value.add(2.5);
        for(double price:value){
            System.out.println(price);
        }
    }
}
