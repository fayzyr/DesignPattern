package proxy.dynicproxy.rent;

public class HouseOwner implements IHouseOwner {

    @Override
    public boolean rent() {
        System.out.println("--出租房屋--");
        return true;
    }
}
