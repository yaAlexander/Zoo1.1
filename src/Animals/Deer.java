package Animals;

public class Deer extends Herbivore{
    protected static int counter;
    public Deer() {
        counter++;
        name = "Олень номер " + counter + " -";
    }
    @Override
    public String getName() {

        return name;
    }
}
