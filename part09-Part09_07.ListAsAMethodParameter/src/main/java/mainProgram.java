import java.util.List;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        System.out.println(returnSize(names));
    }
    
    public static int returnSize(List list) {
        return list.size();
    }    

                
                
    
    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
}
