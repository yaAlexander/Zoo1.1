package Food;

public enum Food {

    FISH("рыбу", 1),
    FLOW("дичь", 1),
    FRUIT("фрукты", 2),
    GRASS("траву", 2);

    public String food;
    public int idOfFood;

     Food(String food, int idOfFood) {
        this.food = food;
        this.idOfFood = idOfFood;
    }

}
