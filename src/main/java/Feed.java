import Interfaces.IEadable;

public class Feed implements IEadable {
    private boolean plant_based;

    public Feed(boolean plant_based) {
        this.plant_based = plant_based;
    }

    public boolean checkPlantBased() {
        return this.plant_based;
    }
}