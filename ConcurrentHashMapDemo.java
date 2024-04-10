import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args){
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<Integer,String>();

        map.put(0,"Basics");
        map.put(1,"Strong");
        map.put(0,"Tech");

        //map.remove(1); //{0=Tech}

        System.out.println(map);
        //{0=Tech, 1=Strong}

        map.putIfAbsent(0,"Hello");
        System.out.println(map);
        //{0=Tech, 1=Strong}

        map.remove(1,"Hello");
        System.out.println(map);
        //{0=Tech, 1=Strong}

        map.remove(1,"Strong");
        System.out.println(map);
        //{0=Tech}

//        map.replace(0,"Tech","Know");
        map.replace(0,"Wrong","Know");
        System.out.println(map);
        //{0=Know}
        //{0=Tech}


        System.out.println(map.replace(3,"BasicsString")); //Tech //null
        //{0=BasicsString}
    }
}
