import java.util.*;

public class Main {
    public static void main(String[] args) {

        // create animal arrayList
        ArrayList<Animal> animalList = new ArrayList<>();

        // adding animals to arrayList
        animalList.add(new Animal("cow", 465));
        animalList.add(new Animal("goat", 28));
        animalList.add(new Animal("donkey", 187));
        animalList.add(new Animal("horse", 521));
        animalList.add(new Animal("giraffe", 529));
        animalList.add(new Animal("elephant", 6654));
        animalList.add(new Animal("kangaroo", 35));
        animalList.add(new Animal("hamster", 1));

        // creating iterator object
        Iterator<Animal> animalIter = animalList.iterator();

        // display message on console for better readability
        System.out.println("\nUnsorted\n");

        // print unsorted arrayList
        // loop through arrayList using iterator
        while (animalIter.hasNext()) {
            System.out.println(animalIter.next());
        }

        // sort by animal name
        Collections.sort(animalList, new SortByName());

        // reset pointer to beginning of the arrayList
        animalIter = animalList.iterator();

        // display message on console for better readability
        System.out.println("\nSorted by name\n");

        // print sorted arrayList by name
        // loop through arrayList using iterator
        while (animalIter.hasNext()) {
            System.out.println(animalIter.next());
        }

        // sort by animal weight
        Collections.sort(animalList, new SortByWeight());

        // reset pointer to beginning of the arrayList
        animalIter = animalList.iterator();

        // display message on console for better readability
        System.out.println("\nSorted by weight\n");

        // print sorted arrayList by weight
        // loop through arrayList using iterator
        while (animalIter.hasNext()) {
            System.out.println(animalIter.next());
        }

    }
}