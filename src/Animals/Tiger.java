package Animals;

public class Tiger extends Carnivore {
    protected static int counter;

    public Tiger() {
        counter++;
        name = "Тигр номер " + counter + " -";
    }
    @Override
    public String getName() {

        return name;
    }
}
