import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // create HashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // add key value pairs
        capitalCities.put("France", "Paris");
        capitalCities.put("Mauritius", "Port Louis");
        capitalCities.put("Jamaica", "Kingston");
        capitalCities.put("Ghana", "Accra");
        capitalCities.put("England", "London");

        // print HashMap and size
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        // get values from HashMap
        System.out.println(capitalCities.get("Jamaica"));

        // remove item from HashMap
        capitalCities.remove("England");

        // print HashMap and size
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        // loop through HashMap keys
        for (String key: capitalCities.keySet()) {
            System.out.println(key);
        }

        // loop through HashMap values
        for (String val: capitalCities.values()) {
            System.out.println(val);
        }

        // loop through HashMap keys and values
        for (String key: capitalCities.keySet()) {
            System.out.println(key + " has capital city " + capitalCities.get(key));
        }

        // clear HashMap
        capitalCities.clear();

        // print HashMap and size
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

    }
}