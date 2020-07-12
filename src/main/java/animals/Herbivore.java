package animals;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import food.Food;

//класс травоядных животных
public abstract class Herbivore extends Animal {
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
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

