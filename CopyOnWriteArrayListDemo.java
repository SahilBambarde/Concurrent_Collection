import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
//    static ArrayList<String> list = new ArrayList<String>();
static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
    public static void main(String[] args){
        list.add("John");
        list.add("Rohn");
        list.add("Harry");
        list.add("Potter");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            String name = (String) itr.next();
            if(name.equals("Harry")){
                itr.remove();
            }

        }
        System.out.println(list);
        //Exception in thread "main" java.lang.UnsupportedOperationException
        //	at java.base/java.util.concurrent.CopyOnWriteArrayList$COWIterator.remove(CopyOnWriteArrayList.java:1124)
    }
}
