
import java.util.Arrays;
import java.util.List;

public class Level {
    public List<Spot> getSpots() {
        return spots;
    }

    private List<Spot> spots;

    public Level(){
        Spot compact1 = new Spot();
        compact1.setType(SpotType.COMPACT);
        Spot compact2 = new Spot();
        compact2.setType(SpotType.COMPACT);
        Spot compact3 = new Spot();
        compact3.setType(SpotType.COMPACT);

        Spot regular1 = new Spot();
        regular1.setType(SpotType.REGULAR);
        Spot regular2 = new Spot();
        regular2.setType(SpotType.REGULAR);
        Spot regular3 = new Spot();
        regular3.setType(SpotType.REGULAR);
        Spot regular4 = new Spot();
        regular4.setType(SpotType.REGULAR);
        Spot regular5 = new Spot();
        regular5.setType(SpotType.REGULAR);


        spots = Arrays.asList( compact1, compact2, compact3, regular1, regular2, regular3, regular4, regular5);
    }
}
