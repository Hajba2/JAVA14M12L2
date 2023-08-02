import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("");

        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();
        cowList.add("");

        ConcurrentHashMap<String, String> cm = new ConcurrentHashMap<>();
        cm.put("", "");


    }

}
