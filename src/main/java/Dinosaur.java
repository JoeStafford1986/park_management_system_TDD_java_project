import Enums.DietType;
import Interfaces.IEadable;

import java.util.ArrayList;

public class Dinosaur {
    private DietType diet;
    private ArrayList<IEadable> stomach;

    public Dinosaur(DietType diet) {
        this.diet = diet;
        this.stomach = new ArrayList<>();
    }


    public DietType getDiet() {
        return this.diet;
    }

    public int getStomachCount() {
        return this.stomach.size();
    }

    public void eat(IEadable feed) {
        if ((this.getDiet() == DietType.CARNIVORE && feed.checkPlantBased() == true) || (this.getDiet() == DietType.HERBIVORE && feed.checkPlantBased() == false)) {
            return;
        }
        this.stomach.add(feed);
    }
}