import java.util.Arrays;
import java.util.List;

public class ParkingLot {


    private List<Level> levels;

    public ParkingLot(){

        Level level1 = new Level();
        Level level2 = new Level();
        levels = Arrays.asList(level1, level2);
    }

    public boolean hasSpot(){
         boolean flag = false;
         for (Level level : levels){
             for (Spot spot: level.getSpots()) {
                 if(spot.isAvailable()){
                     flag = true;
                     break;
                 }
             }
         }
        return flag;
    }

    public Spot getSpot(String vechile){

        Spot rval = null;

        for (Level level : levels){
            for (Spot spot: level.getSpots()) {
                if(spot.isAvailable()){
                    if(spot.getType().equals(SpotType.REGULAR) && vechile == "large"){
                        rval = spot;
                        break;
                    }
                    if( vechile == "small"){
                        rval = spot;
                        break;
                    }
                }
            }

        }
        return rval;
    }

}
