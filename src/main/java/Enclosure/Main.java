package Enclosure;

import Animals.*;
import Food.Food;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static final Logger logConsole = LogManager.getLogger("console output");
        //public static final Logger loggerFile = LogManager.getLogger("file output");

        public static void main(String[] args) throws Exception {


            EnclosureHerbivore firstEnclosureHerbivore = new EnclosureHerbivore(2);
            EnclosureHerbivore secondEnclosureHerbivore = new EnclosureHerbivore(3);
            EnclosureCarnivorous firstEnclosureCarnivorous = new EnclosureCarnivorous(2);
            EnclosureCarnivorous secondEnclosureCarnivorous = new EnclosureCarnivorous(3);
            Food[] foods = {Food.FISH, Food.FLOW, Food.FRUIT, Food.GRASS};

            //Вольеры заполняются животными
            logConsole.info("Заполняем вольер № 1 животными");
            //loggerFile.info("Заполняем вольер № 1 животными");
            for (int i = 0; i < 2; i++) {
                int j = (int) (Math.random() * 3 + 1);
                if (j == 1) firstEnclosureHerbivore.addAnimal(new Deer());
                if (j == 2) firstEnclosureHerbivore.addAnimal(new Antelope());
                if (j == 3) firstEnclosureHerbivore.addAnimal(new Elephant());
            }
            logConsole.info("Заполняем вольер № 2 животными");
            //log.info("Заполняем вольер № 2 животными");
            for (int i = 0; i < 3; i++) {
                int j = (int) (Math.random() * 3 + 1);
                if (j == 1) secondEnclosureHerbivore.addAnimal(new Deer());
                if (j == 2) secondEnclosureHerbivore.addAnimal(new Antelope());
                if (j == 3) secondEnclosureHerbivore.addAnimal(new Elephant());
            }
            logConsole.info("Заполняем вольер № 3 животными");
            //loggerFile.info("Заполняем вольер № 3 животными");
            for (int i = 0; i < 2; i++) {
                int j = (int) (Math.random() * 3 + 1);
                if (j == 1) firstEnclosureCarnivorous.addAnimal(new Tiger());
                if (j == 2) firstEnclosureCarnivorous.addAnimal(new Lion());
                if (j == 3) firstEnclosureCarnivorous.addAnimal(new Leopard());
            }
            logConsole.info("Заполняем вольер № 4 животными");
            //loggerFile.info("Заполняем вольер № 4 животными");
            for (int i = 0; i < 3; i++) {
                int j = (int) (Math.random() * 3 + 1);
                if (j == 1) secondEnclosureCarnivorous.addAnimal(new Tiger());
                if (j == 2) secondEnclosureCarnivorous.addAnimal(new Lion());
                if (j == 3) secondEnclosureCarnivorous.addAnimal(new Leopard());
            }

            List<Enclosure> enclosures = new ArrayList<Enclosure>();
            enclosures.add(firstEnclosureHerbivore);
            enclosures.add(secondEnclosureHerbivore);
            enclosures.add(firstEnclosureCarnivorous);
            enclosures.add(secondEnclosureCarnivorous);
            //кормим зверей
            logConsole.info("Кормим зверей");
            //loggerFile.info("Кормим зверей");
            for (Enclosure enclosure : enclosures) {
                for (int i = 0; i < enclosure.getCounter(); i++) {
                    int ac = (int) (Math.random() * foods.length);
                    Food food = foods[ac];
                    Animal animal = enclosure.getIndex(i);
                    animal.eat(food);
                }
            }
        }
    }



