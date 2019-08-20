public class WoodlandParkingApp {
    static ParkingLot parkingLot = new ParkingLot();

    public static void main(String[] args){
        // park vehicle

        parkVehicle(VehicleType.SMALL);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.LARGE);
        parkVehicle(VehicleType.SMALL);

    }

    private static void parkVehicle( VehicleType vehileType){

        if(parkingLot.hasSpot()){
            Spot spot =  parkingLot.getSpot(vehileType);

            if(spot != null){
                spot.setAvailable(false);
                System.out.println("Parked " + vehileType.name() + " vehicle in " + spot.getType().toString() );
            }else {
                System.out.println("No space available!");
            }

        }else{
            System.out.println("Lot is full!");
        }
    }
}
