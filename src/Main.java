import java.util.*;

public class Main {
    public static void main(String[] args) {
        for (Zilele_Saptamanii day : Zilele_Saptamanii.values()) {
            System.out.println(day);
        }

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            list.add(random.nextInt(1000));
        }
        System.out.println(list);


        Set<String> textSet = new HashSet<>();
        textSet.add("TEST1");
        textSet.add("TEST2");
        System.out.println(textSet);
    }

}