public class Pizza {
    private int price;
    private int basePizzaPrice ;
    private int extraCheesePrice = 100;
    private int addExtraToppings = 150;
    private int packPrice = 20;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedTakeAway = false;


    public Pizza(Boolean veg) {
        boolean veg1 = veg;
        if(veg1){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraTopping(){
        isExtraToppingsAdded = true;
        this.price += addExtraToppings;
    }

    public void takeAway(){
        isOptedTakeAway = true;
        this.price += packPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded){
            bill += "Extra Cheese added: " + extraCheesePrice + "\n";
        }if (isExtraToppingsAdded){
            bill += "Extra Toppings added: " + addExtraToppings + "\n";
        }if (isOptedTakeAway){
            bill += "Take Away : " + packPrice + "\n";
        }
        bill += "Bill: "+ this.price + "\n";
        System.out.println(bill);
    }
}
