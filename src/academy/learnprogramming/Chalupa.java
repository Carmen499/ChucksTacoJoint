package academy.learnprogramming;

public class Chalupa extends Taco {

    private boolean threeCheeseBlend;
    private double threeCheeseBlendPrice;

    private boolean chorizo;
    private double chorizoPrice;

    private boolean specialSalsa;
    private double specialSalsaPrice;

    public Chalupa( boolean threeCheeseBlend, boolean chorizo, boolean specialSalsa) {
        super("Chalupa", "shredded extra", "premium steak", 3.00, true  , true, false, false);

        this.threeCheeseBlend = threeCheeseBlend;
        this.threeCheeseBlendPrice =1.00;

        this.chorizo = chorizo;
        this.chorizoPrice = .50;

        this.specialSalsa = specialSalsa;
        this.specialSalsaPrice = .50;

    }

    @Override
    public double ItemizedListAddOns() {           // override method from taco class to include addons in the Chalupa class
        double tacoPrice = super.ItemizedListAddOns();
        if(threeCheeseBlend){
            tacoPrice += threeCheeseBlendPrice;
            System.out.println("You added three cheese blend for $1.00, the total of your order is now $" + tacoPrice);
        }
        if (chorizo){
            tacoPrice +=  chorizoPrice;
            System.out.println("You added chorizo for $0.50, the total of your order is now $" + tacoPrice);
        }
        if(specialSalsa){
            tacoPrice += specialSalsaPrice;
            System.out.println("You added special sauce for $0.50, the total of your order is now $" + tacoPrice);
        }
        return tacoPrice;

    }
}
