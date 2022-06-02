import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public class AutoCarStrategy<K, V> implements Strategy<K, V>{

    @Override
    public HashMap<K,V> getRoute(K x, V y) {
        var map = new HashMap<K,V>();
        map.put(x,y);

        return map;

    }
}
