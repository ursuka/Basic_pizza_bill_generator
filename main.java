public class main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraTopping();
        basePizza.takeAway();
        basePizza.getBill();
    }
}
