package builder.meal;

public class MealBuilder {
    /**
     * 热卖套餐
     */
    public Meal buildHotMeal(){
        Meal meal = new Meal();
        System.out.println("+热卖套餐");
        meal.addFood(new BeefHamburg());
        meal.addFood(new Peishi());
        return meal;
    }
    /**
     * 优惠套餐
     */
    public Meal buildDiscountMeal(){
        Meal meal = new Meal();
        System.out.println("+优惠套餐");
        meal.addFood(new ChickenHamburg());
        meal.addFood(new Coke());
        return meal;
    }


}
