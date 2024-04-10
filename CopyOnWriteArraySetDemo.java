import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args){
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        ArrayList<String> list = new ArrayList<>();

        list.add("Basics");
        list.add("Basics");
        list.add("Strong");
        list.add("Strong");

        CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<>(list);

        System.out.println(list);
        //[Basics, Basics, Strong, Strong]
        System.out.println(set1);
//        [Basics, Strong]


    }
}
