package academy.learnprogramming;

public class TacoDeluxeMeal extends Taco {

    private double sodaPrice;
    private boolean soda;

    private double chipsAndSalsaPrice;
    private boolean chipsAndSalsa;

    private double chipsAndquesoPrice;
    private boolean chipsAndqueso;

    private double mexicanBrowniesPrice;
    private boolean mexicanBrownies;

    public TacoDeluxeMeal(boolean soda, boolean chipsAndSalsa, boolean chipsAndqueso, boolean mexicanBrownies) {
        super("Double Supreme", "shredded", "chicken, or beef",
                7.00, true, true, true, false);

        this.sodaPrice = 0.00;
        this.soda = soda;
        this.chipsAndSalsaPrice = 0.00;
        this.chipsAndSalsa = chipsAndSalsa;
        this.chipsAndquesoPrice = 3.00;
        this.chipsAndqueso = chipsAndqueso;
        this.mexicanBrowniesPrice = 1.50;
        this.mexicanBrownies = mexicanBrownies;


    }

    @Override
    public double ItemizedListAddOns() {
        double tacoPrice = super.ItemizedListAddOns();
        if(soda){
            tacoPrice+=sodaPrice;
            System.out.println("A soda is included and has been added to your Taco Deluxe Meal, your order is now $" +tacoPrice);
        }
        if(chipsAndSalsa){
            tacoPrice+=chipsAndSalsaPrice;
            System.out.println("Chips and Salsa is included and has been added to your Taco Deluxe Meal, your order is now $" + tacoPrice);
        }
        if(chipsAndqueso){
            tacoPrice+=chipsAndquesoPrice;
            System.out.println("You added Chips and Queso for $3.00, the total of your order is now $" +tacoPrice);
        }
        if(mexicanBrownies){
            tacoPrice+=mexicanBrowniesPrice;
            System.out.println("You added Mexican Brownies for $1.50, the total of your order is now $" + tacoPrice);
        }
        return tacoPrice;
    }
}



