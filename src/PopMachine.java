public class PopMachine {        
    private double amountofMoney;
    private int numberOfCans;
    private double pricePerCans;

    public PopMachine(double amountofMoney, int numberOfCans, double pricePerCans) {
        this.amountofMoney = amountofMoney;
        this.numberOfCans = numberOfCans;
        this.pricePerCans = pricePerCans;
    }

    private boolean disperseCan() {
        if (numberOfCans > 0) {
            numberOfCans--;
            System.out.println("One can dispersed, remaining cans: " + numberOfCans);
            return true;
        } else {
            System.out.println("Action rejected: Not enough cans to disperse");
            return false;
        }
    }

    private boolean coinSlot(double money) {
        if (money < pricePerCans) {
            System.out.println("Action rejected: Not enough money");
            return false;
        }
        amountofMoney += money;
        giveChange(money);
        boolean dispersed = disperseCan();
        if (!dispersed) {
            System.out.println("An Error has occured, your refund is $" + refund(dispersed));
            return false;
        }
        return true;
    }

    private void giveChange(double money) {
        if (money > pricePerCans) {
            System.out.println("You change is $" + (money - pricePerCans));
        }

    }
    private double refund(boolean dispersed) {
        amountofMoney -= pricePerCans; 
        if (dispersed) {
            numberOfCans++;
        }
        return pricePerCans;
    }

    public static void main(String[] args) {
        // Ask the user for the n value
        double money = 200;
        PopMachine popMachine = new PopMachine(10.0, 100, 1.5);
        while (money > 0) {
            
            boolean dispersed = popMachine.coinSlot(1.5);
            money -= 1.5;
            System.out.println(money);
        }
    }
}


