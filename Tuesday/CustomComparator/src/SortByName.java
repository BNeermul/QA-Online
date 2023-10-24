import java.util.Comparator;

public class SortByName implements Comparator<Animal> {
    public int compare(Animal a, Animal b) {
        return a.getName().compareTo(b.getName());
    }
}
