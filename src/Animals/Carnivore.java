package Animals;

import Food.*;
//класс плотоядных животных
public abstract class Carnivore extends Animal {

    public void eat(Food food) throws Exception {
        try {
            if (food.idOfFood == 1) {
                System.out.println(name + " ест " + food.food);
            } else
                throw new Exception();
        } catch (Exception ex) {
            System.err.println(name + " не ест " + food.food);
        }
    }
}