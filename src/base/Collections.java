package base;
import java.util.*;



public class Collections {

    public static void main(String[] args) {
        //listtest();

        mapTest();
    }

    private static void mapTest() {
        TreeMap<Integer,String> mapOfString = new TreeMap<>();
        //create entries (add)

        mapOfString.put(2,"second");
        mapOfString.put(3,"third");
        mapOfString.put(1,"first");

        //modify entry by key
        mapOfString.put(1,"newFirst");

        Set<Integer> keys = mapOfString.keySet();
        System.out.println("keys:" + keys());
        Collection<String> integers = mapOfString.values();
        System.out.println("Value:" + mapOfString.values());

        Object println;

        for (int key : keys)
        {
            System.out.println(key + ":" + mapOfString.get(key));
        }
        keys.forEach(System.out ::println);
    }

    private static String keys() {
        return null;
    }

    private static void listtest() {
        ArrayList<String> listOfStrigs = new ArrayList<>();
        listOfStrigs.add("first");
        listOfStrigs.add("second");
        listOfStrigs.add("third");

        for(int i=0; i < listOfStrigs.size();i++){
            System.out.println(listOfStrigs.get(i));
        }
    }
}
