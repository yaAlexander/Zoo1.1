package animals;

import food.Food;

//класс травоядных животных
public abstract class Herbivore extends Animal {

    public void eat(Food food) throws Exception {
        try {
            if (food.idOfFood == 2) {
                System.out.println(name + " ест " + food.food);
            } else
                throw new Exception();
        } catch (Exception ex) {
            System.err.println(name + " не ест " + food.food);
        }
    }
}

