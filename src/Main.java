public class Main {
    public static void main(String[] args) {
        BonusMilesService ctrvise = new BonusMilesService();
        int price = 20_000;
        int miles = ctrvise.calculate(price);
        System.out.println(miles);
    }
}