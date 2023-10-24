import java.util.*;

public class Main {
    public static void main(String[] args) {

        // create animal arrayList
        List<Animal> animalList = new ArrayList<>();

        // adding animals to arrayList
        animalList.add(new Animal("monkey", 20));
        animalList.add(new Animal("lion", 200));
        animalList.add(new Animal("horse", 150));

        // creating iterator object
        Iterator<Animal> animalIter = animalList.iterator();

        // creating new custom comparison object
        CustomComparison c = new CustomComparison();

        // print arrayList before filtering
        for (Animal i : animalList) {
            System.out.println(i.getName());
        }

        // iterate through arrayList and remove under-weight animals
        while (animalIter.hasNext()) {
            Animal a = animalIter.next();
            if (c.compareTo(a) < 0) {
                animalIter.remove(); // removes animals under 100kg
            }
        }

        // print arrayList before filtering
        for (Animal i : animalList) {
            System.out.println(i.getName());
        }
    }
}