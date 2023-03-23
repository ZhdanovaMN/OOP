public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", Gender.female);
        Person vasya = new Person("Вася", Gender.male);
        Person masha = new Person("Маша", Gender.female);
        Person jane = new Person("Женя", Gender.male);
        Person ivan = new Person("Ваня", Gender.male);

        Person nikita = new Person("Никита", Gender.male);
//        Person anna = new Person("Анна");
        Person vera = new Person("Вера", Gender.female);
        Person dima = new Person("Дима", Gender.male);
//        Person polina = new Person("Полина");

        GeoTree gt = new GeoTree();

        gt.addRelationship(irina, vasya, Relationship.child);
        gt.addRelationship(irina, masha, Relationship.child);
        gt.addRelationship(vasya, jane, Relationship.child);
        gt.addRelationship(vasya, ivan, Relationship.child);
        gt.addRelationship(vasya, nikita, Relationship.child);
        gt.addRelationship(nikita, vera, Relationship.child);
        gt.addRelationship(nikita, dima, Relationship.child);

        gt.addRelationship(ivan, masha, Relationship.aunt_uncle);
        gt.addRelationship(ivan, vasya, Relationship.aunt_uncle);
        gt.addRelationship(ivan, vera, Relationship.niece_nephew);
        gt.addRelationship(ivan, dima, Relationship.niece_nephew);
        gt.addRelationship(jane, vera, Relationship.niece_nephew);
        gt.addRelationship(jane, dima, Relationship.niece_nephew);

        gt.addRelationship(irina, jane, Relationship.grandchild);
        gt.addRelationship(irina, ivan, Relationship.grandchild);
        gt.addRelationship(irina, nikita, Relationship.grandchild);
        gt.addRelationship(vasya, vera, Relationship.grandchild);
        gt.addRelationship(vasya, dima, Relationship.grandchild);


        System.out.println();
        System.out.println(gt.allRelationships(irina));

        System.out.println(gt.getChildren(irina));
        System.out.println(gt.getParents(vasya));
        System.out.println(gt.getGrandparents(ivan));
        System.out.println(gt.getGreatChildren(irina));
        System.out.println(gt.getNiece_nephew(ivan));
        System.out.println(gt.getAunt_uncle(ivan));







    }

}
