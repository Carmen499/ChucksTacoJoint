package academy.learnprogramming;

public class Burrito extends Taco {

    private boolean refriedBeans;
    private double refriedBeansPrice;

    private boolean picoDeGallo;
    private double picoDeGalloPrice;

    private boolean spanishRice;
    private double spanishRicePrice;

    public Burrito(boolean refriedBeans, boolean picoDeGallo, boolean spanishRice) {
        super("Burrito", "shredded", "chicken", 3.00, false, true, true, false);

        this.refriedBeans = refriedBeans;
        this.refriedBeansPrice = .25;
        this.picoDeGallo = picoDeGallo;
        this.picoDeGalloPrice = .25;
        this.spanishRice = spanishRice;
        this.spanishRicePrice = .50;
    }


    @Override
    public double ItemizedListAddOns() {      // override method from taco class to include adds on in the Burrito class
        double tacoPrice =super.ItemizedListAddOns();
        if(refriedBeans){
            tacoPrice += refriedBeansPrice;
            System.out.println("You added refried beans for $0.25, the total of your order is now $" + tacoPrice);
        }
        if (picoDeGallo){
            tacoPrice += picoDeGalloPrice;
            System.out.println("You added pico de gallo for $0.25, the total of your order is now $" + tacoPrice);
        }
        if(spanishRice){
            tacoPrice += spanishRicePrice;
            System.out.println("You added spanish rice for $0.50, the total of your order is now $" + tacoPrice);
        }
        return tacoPrice;

    }
}
