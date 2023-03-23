import java.util.ArrayList;

public interface Research {
    ArrayList<String> getParents(Person person);
    ArrayList<String> getChildren(Person person);
    ArrayList<String> getAunt_uncle(Person person);

    //    ArrayList<String> getBrotherSister(Person person);
//    ArrayList<String> getPartners(Person person);
    ArrayList<String> spend(Person person, Relationship rel);
}
