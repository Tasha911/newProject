public class BonusMilesService {
    public int calculate(int price) {
        int result;
        int oneBonusMilleCost = 20;
        if (price >= oneBonusMilleCost) {
            result = price / oneBonusMilleCost;
        } else {
            result = 0;
        }
        return result;
    }
}
