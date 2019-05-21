package builder.meal;

public class ChickenHamburg extends Hamburg{
    @Override
    public String getName() {
        return "鸡肉汉堡";
    }

    @Override
    public float getPrice() {
        return 12.5f;
    }

}
