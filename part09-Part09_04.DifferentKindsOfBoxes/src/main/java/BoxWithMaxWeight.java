
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity=capacity;
        this.items=new ArrayList<>();
    }
    
    public void add(Item item) {
        if ((this.capacity-item.getWeight())>=0) {
            items.add(item);
            this.capacity-=item.getWeight();
        }
    }
    //weight issue?
    public void add(ArrayList<Item> items) {
        this.add(items);
    }
    
    @Override
    public boolean isInBox(Item item) {
       if (items.contains(item)){
           return true;
       }
       return false;
    }
}
