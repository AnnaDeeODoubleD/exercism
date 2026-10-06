public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double speedOneProductionRatePerHour = 221.0;

    if(speed <= 4) {
        double productionPerHour = speedOneProductionRatePerHour * speed;
        return productionPerHour;

    }else if(speed <=8) {
        double speedFiveToEight = speedOneProductionRatePerHour * speed * 0.9;
        return speedFiveToEight;

    }else if(speed == 9) {
        double speedNine = speedOneProductionRatePerHour * speed * 0.8;
        return speedNine;

    }else if(speed == 10) {
        double speedTen = speedOneProductionRatePerHour * speed * 0.77;
        return speedTen;
    } else {
        return 0.0;
    }
    }

    public int workingItemsPerMinute(int speed) {
           int productionPerMinute = (int) (productionRatePerHour(speed) / 60);
           return productionPerMinute;
    }
}
