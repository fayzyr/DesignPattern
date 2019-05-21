package builder.meal;

public abstract class Hamburg implements IFoodItem {
    @Override
    public abstract String getName();

    @Override
    public abstract float getPrice();

    @Override
    public  IPackage getPackage(){
        return new BoxPackage();
    }
}
