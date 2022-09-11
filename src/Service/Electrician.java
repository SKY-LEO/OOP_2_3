package Service;

import java.io.Serializable;
import java.util.List;

public class Electrician extends Service implements Serializable {
    public Electrician(String description, int price) {
        super(description, price);
    }

    @Override
    public String toString() {
        return "Электрик";
    }
}
