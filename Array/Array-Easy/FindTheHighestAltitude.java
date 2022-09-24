import java.util.ArrayList;
import java.util.Collections;
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int current_Altitude = 0;
        
        //to store the derived altitudes.
        ArrayList<Integer> altitude = new ArrayList<>();
        altitude.add(0);
        for(int i = 0; i < gain.length; i++){
            current_Altitude += gain[i];
            altitude.add(current_Altitude);
        }
        
        //arraylist method to find the max value
        return Collections.max(altitude);
    }
}
