package pl.training.movies;

public class PriceCalculator {

    double getValueFor(MovieType movieType, long periodInDays) {
        return movieType.getInitialCost() + getValueForPeriod(movieType, periodInDays);
    }

    private double getValueForPeriod(MovieType movieType, long periodInDays) {
        return (periodInDays - movieType.getFreeRentalPeriodInDays()) * movieType.getCostPerDay();
    }

}
