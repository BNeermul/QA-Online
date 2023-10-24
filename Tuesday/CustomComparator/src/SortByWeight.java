import java.util.Comparator;

public class SortByWeight implements Comparator<Animal> {
    public int compare(Animal a, Animal b) {
        return a.getWeight() - b.getWeight();
    }
}
