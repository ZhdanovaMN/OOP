package GeoWithResearch;

import java.util.ArrayList;

public interface GenealogicalTree {
    public void addRelationship(Person person1, Person person2, Relationship relationship);

    ArrayList<String> allRelationships(Person p);
    ArrayList<String> spend(Person person, Relationship rel);
    ArrayList<String> getRelationships(Person p, Relationship re);


}
