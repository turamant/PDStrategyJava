import java.util.ArrayList;
import java.util.HashMap;

public class Context<K, V> {

    private Strategy<K, V> strategy;

    public void setStrategy(Strategy<K, V> strategy){
        this.strategy = strategy;
    }
    public HashMap<K, V> executeStrategy(K x, V y){
        return strategy.getRoute(x, y);
    }
}
