package Animals;

public class Elephant extends Herbivore{
    protected static int counter;
    public Elephant() {
        counter++;
        name = "Слон номер " + counter + " -";
    }
    @Override
    public String getName() {
        return name;
    }
}
