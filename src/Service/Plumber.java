package Service;

import java.io.Serializable;
import java.util.List;

public class Plumber extends Service implements Serializable {
    public Plumber(String description, int price) {
        super(description, price);
    }

    @Override
    public String toString() {
        return "Водопроводчик";
    }
}
