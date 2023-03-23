import java.util.ArrayList;


public class GeoTree {
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

    public ArrayList<String> spend(Person person, Relationship rel) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.getP1().getFullName().equals(person.getFullName()) && t.getRe() == rel) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }

    public ArrayList<String> getParents(Person person) {
        return spend(person, Relationship.parent);
    }

    public ArrayList<String> getChildren(Person person) {
        return spend(person, Relationship.child);
    }

    public ArrayList<String> getGrandparents(Person person) {
        return spend(person, Relationship.grandparent);
    }

    public ArrayList<String> getGreatChildren(Person person) {
        return spend(person, Relationship.grandchild);
    }

    public ArrayList<String> getNiece_nephew(Person person) {
        return spend(person, Relationship.niece_nephew);
    }

    public ArrayList<String> getAunt_uncle(Person person) { return spend(person, Relationship.aunt_uncle);
    }




}

