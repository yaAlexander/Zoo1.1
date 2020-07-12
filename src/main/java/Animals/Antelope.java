package Animals;

public class Antelope extends Herbivore {
    protected static int counter;

    public Antelope() {
        counter++;
        name = "Антилопа номер " + counter + " -";
    }

    @Override
    public String getName() {

        return name;
    }
}
