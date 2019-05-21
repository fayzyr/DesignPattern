package builder.meal;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<IFoodItem> foods = new ArrayList<>();
    public  void addFood(IFoodItem iFoodItem){
        foods.add(iFoodItem);
    }
    public void showAllFoods(){
        if(0==foods.size())
            System.out.println("您还没有选择套餐呢。");
        System.out.println("套餐包括:");
        for (IFoodItem iFoodItem:foods){
            if(iFoodItem==null)continue;
            System.out.println("\t菜名："+iFoodItem.getName()+"\t包装："+(iFoodItem.getPackage().getPackName())+"\t单价："+iFoodItem.getPrice()+"元");
        }

    }
    public float payCost(){
        if(0==foods.size())return 0;
        float cost = 0;
        for (IFoodItem iFoodItem:foods){
            if(iFoodItem==null)continue;
            cost = cost+iFoodItem.getPrice();
        }
        System.out.println("套餐计:"+cost+"元。");
        return cost;
    }

}
