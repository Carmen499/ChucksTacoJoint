package academy.learnprogramming;

public class Taco {
    private String tacoShell;
    private String lettuce;
    private String meat;
    private double basePrice;

    private boolean tomato;
    private double tomatoPrice;

    private boolean onions;
    private double onionPrice;

    private boolean sourCream;
    private double sourCreamPrice;

    private boolean extraServingOfMeat;
    private double extraServingOfMeatPrice;


    public Taco(String tacoShell, String lettuce, String meat, double basePrice, boolean tomato,
                boolean onions, boolean sourCream, boolean extraServingOfMeat) {
        this.tacoShell = tacoShell;
        this.lettuce = lettuce;
        this.meat = meat;
        this.basePrice = basePrice;

        this.tomato = tomato;
        this.tomatoPrice = .75;

        this.onions = onions;
        this.onionPrice = .50;

        this.sourCream = sourCream;
        this.sourCreamPrice = .25;

        this.extraServingOfMeat = extraServingOfMeat;
        this.extraServingOfMeatPrice = 1.50;
    }



    public double ItemizedListAddOns(){
        double tacoPrice = basePrice;
        System.out.println("The price of a " +tacoShell+ " Taco is $" + tacoPrice+ "0." +"\n" +"It comes with with " + meat + " and " + lettuce + " lettuce.");
        if(this.tomato){
            tacoPrice += tomatoPrice;
            System.out.println("You added tomato for $.75, the total of your order is now $" + tacoPrice);
        }
        if(this.onions){
            tacoPrice += onionPrice;
            System.out.println("You added onion for $0.50, the total of your order is now $" + tacoPrice);
        }
        if(this.sourCream){
            tacoPrice += sourCreamPrice;
            System.out.println("You added sour cream for $0.25, the total of your order is now $" + tacoPrice +"0");
        }
        if(this.extraServingOfMeat){
            tacoPrice += extraServingOfMeatPrice;
            System.out.println("You added an extra serving of meat for $2.00, the total of your order is now $" + tacoPrice );
        }

        return tacoPrice;
    }


}