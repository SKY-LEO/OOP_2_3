package Service;

import java.io.Serializable;

public class GarbageCollection extends Service implements Serializable {
    public GarbageCollection(String description, int price) {
        super(description, price);
    }

    @Override
    public String toString() {
        return "Утилизация";
    }
}
