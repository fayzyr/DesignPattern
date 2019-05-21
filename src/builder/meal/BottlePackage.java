package builder.meal;

public class BottlePackage implements IPackage{

    @Override
    public void packaging() {
        System.out.println("瓶子包装");
    }

    @Override
    public String getPackName() {
        return "瓶子包装";
    }
}
