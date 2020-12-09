





import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse {
 //   private double balance;
    private ChangeHistory history = new ChangeHistory();
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.balance=initialBalance;
        history.add(initialBalance);
        
    }
    
    public String history() {
        return history.toString();
    }
    
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;            
        } else {
            this.balance = getCapacity();  //will it error here????
        }
        history.add(this.balance);/////
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            history.add(this.balance);/////
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        history.add(this.balance);/////
        return amount;
    }
    
    public void printAnalysis() {
        System.out.println("Product: "+getName());
        System.out.println("History: "+history);
        System.out.println("Largest amount of product: "+history.maxValue());
        System.out.println("Smallest amount of product: "+history.minValue());
        System.out.println("Average: "+history.average());
    }
    
}
