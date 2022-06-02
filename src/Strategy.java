import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public interface Strategy<K, V> {
    public HashMap<K, V> getRoute(K x, V y);
}
