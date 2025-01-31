public class math {
    private double totalMoneyUSD = 6644.57;
    private double weeklyBudgetUSD = 450.00;
    private double weeklyFoodUSD = 220.00;
    private double weeklyAlcUSD = 80;
    private double weeklyTravelUSD = 150;
    private double currentTotalSpending = 0.0;
    private double currentFoodSpending = 0.0;
    private double currentAlcSpending = 0.0;
    private double currentTravelSpending = 0.0;
    

    public boolean isOnBudget() {
        if (!(alcCheck() && travelCheck() && foodCheck())){
            return true;
        }

        return false;
    }
    public boolean alcCheck() {
        if (getCurrentAlcSpending() > weeklyAlcUSD) {
            return true;
        }
        return false;
    }
    public boolean travelCheck() {
        if (getCurrentTravelSpending() > weeklyTravelUSD) {
            return true;
        }
        return false;
    }
    public boolean foodCheck() {
        if (getCurrentFoodSpending() > weeklyFoodUSD) {
            return true;
        }
        return false;
    }
    public double setTotalWeeklySpent() {
        return (getCurrentAlcSpending() + getCurrentFoodSpending() + getCurrentTravelSpending());
    }
    public double getTotalMoneyUSD() {
        return totalMoneyUSD;
    }

    public double getWeeklyBudgetUSD() {
        return weeklyBudgetUSD;
    }

    public double getWeeklyFoodUSD() {
        return weeklyFoodUSD;
    }

    public double getWeeklyAlcUSD() {
        return weeklyAlcUSD;
    }

    public double getWeeklyTravelUSD() {
        return weeklyTravelUSD;
    }

    public double getCurrentTotalSpending() {
        return currentTotalSpending;
    }

    public double getCurrentFoodSpending() {
        return currentFoodSpending;
    }

    public double getCurrentAlcSpending() {
        return currentAlcSpending;
    }

    public double getCurrentTravelSpending() {
        return currentTravelSpending;
    }

}
