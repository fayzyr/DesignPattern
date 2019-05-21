package builder.meal;


public class ClientTest {
    /**
     * 建造者模式
     *
     * @param args
     */
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal1 = builder.buildHotMeal();
        meal1.showAllFoods();
        float p1 = meal1.payCost();
        Meal meal2 = builder.buildDiscountMeal();
        meal2.showAllFoods();
        float p2 =  meal2.payCost();
        System.out.println("本次消费共"+(p1+p2)+"元");

    }
}
