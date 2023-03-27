package GeoWithResearch;

import java.util.ArrayList;

public class Research {
    private ArrayList<String> result;
    private GenealogicalTree geoTree;

    public Research(GenealogicalTree geoTree) {
        this.geoTree = geoTree;
    }


    public ArrayList<String> spend(Person p, Relationship re) {
        return geoTree.getRelationships(p, re);
    }

}