import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMapDemo extends Thread {
//    static HashMap<Integer,String> map = new HashMap<>();
static ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
    public static void main(String[] args){
        ConHashMapDemo tChild = new ConHashMapDemo();
        map.put(1,"John");
        map.put(2,"Rohn");
        map.put(3,"Tom");
        map.put(4,"Shiva");
        tChild.start();

        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = "+entry.getKey() + " Value = "+entry.getValue());
            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void run(){
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put(5,"Ganesha");
    }
}
