package Enclosure;

import Animals.Animal;

public interface Enclosure {
    Animal getIndex(int index);
    int getSize();

    int getCounter();

    void addAnimal(Animal animal);


}
