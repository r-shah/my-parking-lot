public class WoodlandParkingApp {
    static ParkingLot parkingLot = new ParkingLot();

    public static void main(String[] args){
        // park vehicle

        parkVehicle("small");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");
        parkVehicle("large");


    }

    private static void parkVehicle( String vehile){

        if(parkingLot.hasSpot()){
            Spot spot =  parkingLot.getSpot(vehile);

            if(spot != null){
                spot.setAvailable(false);
                System.out.println("Parked " + vehile + " vechile in " + spot.getType().toString() );
            }else {
                System.out.println("No space available!");
            }

        }else{
            System.out.println("Lot is full!");
        }
    }
}
