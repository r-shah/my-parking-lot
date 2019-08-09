
public class Spot {

    private boolean available;
    private SpotType type;


    public Spot(){
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public SpotType getType() {
        return type;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setType(SpotType type) {
        this.type = type;
    }




}
