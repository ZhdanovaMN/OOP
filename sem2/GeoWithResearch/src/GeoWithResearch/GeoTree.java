package GeoWithResearch;

import java.util.ArrayList;
import java.util.Iterator;


public class GeoTree implements GenealogicalTree{
    private ArrayList<Node> tree = new ArrayList<>();


    public ArrayList<Node> getTree() {
        return tree;
    }

    public void addRelationship(Person person1, Person person2, Relationship relationship) {
        Node node1 = new Node(person1, relationship, person2);
        Node node2 = new Node(person2, relationship.getOppositeRelationship(), person1);
        tree.add(node1);
        tree.add(node2);
    }


    public ArrayList<String> allRelationships(Person p) {
        ArrayList<String> result = new ArrayList<>();
        result.add("Все отношения " + p.getFullName());
        for (Node t : tree) {
            if (t.p1.getFullName().equals(p.getFullName())) {
                result.add(t.re + ": " + t.p2.getFullName());
            }
        }
        return result;
    }


    @Override
    public ArrayList<String> getRelationships(Person p, Relationship re) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.getP1().getFullName().equals(p.getFullName()) && t.getRe() == re) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }


        public ArrayList<String> removeRelationship (Person p) {

        ArrayList<String> res = new ArrayList<>();
        res.add("Все отношения " + p.getFullName() + " с родственниками женского пола: ");
        Iterator<Node> iterator = tree.iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.p1.getFullName().equals(p.getFullName()) && node.p2.getGender().equals(Gender.female)){
                iterator.remove();
                res.add(node.re + ": " + node.getP2().getFullName());
            }
        }
        return res;
    }


}


