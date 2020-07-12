package animals;

public class Duck extends Carnivore {
    protected static int counter;

    public Duck() {
        counter++;
        name = "Утка номер " + counter + " -";
    }

    @Override
    public String getName() {

        return name;
    }
}
