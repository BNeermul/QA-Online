public class CustomComparison implements Comparable<Animal> {
    public int compareTo(Animal animal) {
        int weight1 = animal.getWeight();
        if (weight1 == 100) {
            return 0;
        } else if (weight1 > 100) {
            return 1;
        } else {
            return -1;
        }
    }
}
