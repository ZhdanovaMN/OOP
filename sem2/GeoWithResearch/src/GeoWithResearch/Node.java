package GeoWithResearch;

public class Node {
    public Person p1;
    public Relationship re;
    public Person p2;

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    public Person getP1() {
        return p1;
    }
    public Relationship getRe() {
        return re;
    }
    public Person getP2() {
        return p2;
    }


    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

//    @Override
    public int hashCode() {
        StringBuilder hash = new StringBuilder();
        hash.append(this.p1.getFullName().hashCode());
        hash.append(this.p2.getFullName().hashCode());
        hash.append(this.re.hashCode());
        return super.hashCode();
    }
}

