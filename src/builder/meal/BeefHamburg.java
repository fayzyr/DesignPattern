package builder.meal;

public class BeefHamburg extends Hamburg{
    @Override
    public String getName() {
        return "牛肉汉堡";
    }

    @Override
    public float getPrice() {
        return 16.5f;
    }
}
