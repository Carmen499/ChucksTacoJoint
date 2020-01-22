package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Taco taco = new Taco("soft", "Shredded","beef",2.00,true,
                true, false,false);
        Chalupa chalupa = new Chalupa(true,false,true);

        Burrito burrito = new Burrito(true,true,true);

        TacoDeluxeMeal tacoDeluxeMeal = new TacoDeluxeMeal(true, true,false,true);

        //System.out.println("The final price of your meal will be $" + taco.ItemizedListAddOns());
       // System.out.println("The final price of your meal will be $" + chalupa.ItemizedListAddOns());
        //System.out.println("The final price of your meal will be $" + burrito.ItemizedListAddOns());
        System.out.println("The final price of your Taco Deluxe Meal will be $" + tacoDeluxeMeal.ItemizedListAddOns());
    }
}
