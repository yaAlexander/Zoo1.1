package animals;

public class Lion extends Carnivore {
    protected static int counter;
    public Lion() {
        counter++;
        name = "Лев номер " + counter + " -";
    }
    public String getName() {
        return name;
    }
}
