import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ParkingLot {


    private List<Level> levels;

    public ParkingLot() {

        Level level1 = new Level();
        Level level2 = new Level();
        levels = Arrays.asList(level1, level2);
    }

    public boolean hasSpot() {

        return levels.stream()
                .filter(level -> level.getSpots().stream()
                    .filter(s -> s.isAvailable())
                    .findFirst().isPresent())
                .anyMatch(l -> l.getSpots().size() > 0);
    }

    public Spot getSpot(String vechile) {

        /*Optional<Level> level;
        if (vechile.equals("large")) {
            level = levels.stream().filter(lev -> {
                return lev.getSpots().stream().filter(Spot::isAvailable).anyMatch(s -> s.getType().equals(SpotType.REGULAR));
            }).findFirst();

        } else {
            level = levels.stream().filter(lev -> lev.getSpots().stream().anyMatch(Spot::isAvailable)).findFirst();
        }

        return    level.isPresent() ? level.get().getSpots().stream().findFirst().get() : null;
        */

        Spot rval = null;

        for (Level level : levels) {
            for (Spot spot : level.getSpots()) {
                if (spot.isAvailable()) {
                    if (spot.getType().equals(SpotType.REGULAR) && vechile == "large") {
                        rval = spot;
                        break;
                    }
                    if (vechile == "small") {
                        rval = spot;
                        break;
                    }
                }
            }
        }
        return rval;
    }

}
