package builder.meal;

public abstract class ColdDrink implements IFoodItem {
    @Override
    public abstract String getName();

    @Override
    public abstract float getPrice();

    @Override
    public IPackage getPackage() {
        return new BottlePackage();
    }
}
