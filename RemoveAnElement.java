package nguyenphutuan_1006;

import java.util.ArrayList;
import java.util.Random;

public class RemoveAnElement {
    public static void main(String[] args){
            ArrayList<Integer> number = new ArrayList<>();
            Random random = new Random();
            for(int i=0;i<10;i++){
                int randomNumber = random.nextInt(100) + 1;
                number.add(randomNumber);
            }
            System.out.println(number);
            number.remove(3);
            System.out.println("Next number:" + number + " ");
    }
}
