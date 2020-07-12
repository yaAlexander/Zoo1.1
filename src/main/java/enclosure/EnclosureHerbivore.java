package enclosure;

import animals.Animal;
import animals.Herbivore;

import java.util.ArrayList;

public class EnclosureHerbivore implements Enclosure {
    private ArrayList<Herbivore> animals = new ArrayList<>();
    private int size;
    private int counter;

    public EnclosureHerbivore(int size) {

        this.size = size;
    }

    @Override
    public int getSize() {

        return size;
    }

    @Override
    public int getCounter() {

        return counter;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (size > animals.size() && animal instanceof Herbivore) {
            animals.add((Herbivore) animal);
            counter = animals.size();
        } else {
            System.out.println("В вольере больше нет мест");
        }
    }
    @Override
    public Animal getIndex(int index) {
        if (0 <= index && index < size) {
            return animals.get(index);
        }
        return null;

    }
}
