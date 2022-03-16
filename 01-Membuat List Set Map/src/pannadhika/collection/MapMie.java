package pannadhika.collection;

import java.util.HashMap;
import java.util.Map;

public class MapMie {
        public static void main(String[] args) {
            Map<String, Mie> mies = new HashMap();
            mies.put("key-1", new Mie("Lemonilo Ayam Soto", 10_000));
            mies.put("key-2",new Mie("Mie Sedap Original", 5_000));

            System.out.println("Keterangan Mobil: (size = "+ mies.size() +")");
            for (String key : mies.keySet()) {
                System.out.println("\t " + key + " : " + mies.get(key));
            }
        }
}


