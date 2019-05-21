package builder.meal;

public class Coke extends ColdDrink{
    @Override
    public String getName() {
        return "可口可乐";
    }

    @Override
    public float getPrice() {
        return 8;
    }
}
