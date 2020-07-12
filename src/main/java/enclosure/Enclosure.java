package enclosure;

import animals.Animal;

public interface Enclosure {
    Animal getIndex(int index);
    int getSize();

    int getCounter();

    void addAnimal(Animal animal);


}
