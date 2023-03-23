public enum Relationship {
    parent {
        public Relationship getOppositeRelationship() { return child;}
    },
    child {
        public Relationship getOppositeRelationship() { return parent; }
    },
    grandparent {
        public Relationship getOppositeRelationship() { return grandchild;}
    },
    grandchild {
        public Relationship getOppositeRelationship() { return grandparent;}
    },
    aunt_uncle {
        public Relationship getOppositeRelationship() { return niece_nephew;}
    },
    niece_nephew {
        public Relationship getOppositeRelationship() { return aunt_uncle;}
    },
    unknown {
        public Relationship getOppositeRelationship() { return unknown;}
    };

    public abstract Relationship getOppositeRelationship();
}
