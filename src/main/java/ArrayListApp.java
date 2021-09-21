

import java.util.ArrayList;

public class ArrayListApp {
    private ArrayList<Cat> shelter;

    public ArrayListApp() {
        this.shelter = new ArrayList<Cat>();
    }

    public ArrayList<Cat> shelterList(){
        return shelter;
    }
    public void addCat(Cat cat){
        shelter.add(cat);
    }
    public ArrayList<Cat> getCats(){
        return shelter;
    }

}
