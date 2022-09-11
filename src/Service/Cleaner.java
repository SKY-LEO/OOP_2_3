package Service;

import java.io.Serializable;

public class Cleaner extends Service implements Serializable {
    public Cleaner(String description, int price) {
        super(description, price);
    }

    @Override
    public String toString() {
        return "Уборщик";
    }
}
