import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingLot {

    private List<Level> levels;

    public ParkingLot() {

        Level level1 = new Level();
        Level level2 = new Level();
        levels = Arrays.asList(level1, level2);
    }

    public boolean hasSpot() {

        return levels.stream().filter(level -> level.getSpots()
                .stream().filter(s -> s.isAvailable())
                .findFirst().isPresent())
                .anyMatch(l -> l.getSpots().size() > 0);
    }

    public Spot getSpot(VehicleType vehicleType) {
        final Spot rval;

        List<Spot> spots = levels.stream()
                .flatMap(level -> level.getSpots().stream()
                        .filter(spot -> spot.isAvailable()))
                .collect(Collectors.toList());

        rval = vehicleType.equals(VehicleType.LARGE) ?
                spots.stream()
                        .filter(spot -> spot.getType().equals(SpotType.REGULAR))
                        .findFirst().orElse(null)
                : spots.stream()
                .findFirst().orElse(null);

        return rval;
    }

}
