package nguyenphutuan_1006;

import java.util.ArrayList;

public class CheckForAnElement {
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Da Nang");
        cities.add("Tp HCM");
        cities.add("Ha Noi");
        cities.add("Tokyo");
        cities.add("London");
        boolean containsLondon = cities.contains("London");
        if(containsLondon){
            System.out.println("has London city");
        }else{
            System.out.println("no city of London");
        }
        System.out.println(cities);
    }
}
