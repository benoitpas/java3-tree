package org.benoit;

// to avoid using null pointer
public class Leaf extends Tree {
    private Leaf() {}

    static  Leaf leaf = new Leaf();

    public static Leaf get() {
        return leaf;
    };

    public String toString() {
        return "";
    }

    protected Indexed addId(int start) {
        return new Indexed(start, this);
    }
}
