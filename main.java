public class main {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraTopping();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxPizza deluxPizza = new DeluxPizza(false);
        deluxPizza.addExtraTopping();
        deluxPizza.addExtraCheese();
        deluxPizza.takeAway();
        deluxPizza.getBill();

    }
}
