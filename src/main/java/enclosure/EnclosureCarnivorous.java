package enclosure;

import animals.Animal;
import animals.Carnivore;

import java.util.ArrayList;

public class EnclosureCarnivorous implements Enclosure {
    private ArrayList<Carnivore> animals = new ArrayList<>();
    private int size;
    private int counter;

    public EnclosureCarnivorous(int size) {
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
        if (size > animals.size() && animal instanceof Carnivore) {
            animals.add((Carnivore) animal);
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
