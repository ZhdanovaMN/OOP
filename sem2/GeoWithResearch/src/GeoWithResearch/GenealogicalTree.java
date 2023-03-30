package GeoWithResearch;

import java.util.ArrayList;

public interface GenealogicalTree {
    public void addRelationship(Person person1, Person person2, Relationship relationship);

    ArrayList<String> allRelationships(Person p);

    ArrayList<String> getRelationships(Person p, Relationship re);

    ArrayList<String> removeRelationship(Person p);


}
