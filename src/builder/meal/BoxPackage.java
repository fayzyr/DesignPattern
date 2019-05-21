package builder.meal;

public class BoxPackage implements IPackage{

    @Override
    public void packaging() {
        System.out.println("纸盒包装");
    }

    @Override
    public String getPackName() {
        return "纸盒包装";
    }
}
