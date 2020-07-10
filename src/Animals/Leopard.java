package Animals;

public class Leopard extends Carnivore {
    protected static int counter;

    public Leopard() {
        counter++;
        name = "Леопард номер " + counter + " -";
    }

    @Override
    public String getName() {

        return name;
    }
}
