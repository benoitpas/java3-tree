package org.benoit;

public class Indexed {
    private final int index;
    private final Object v;
    int getIndex() {
        return index;
    }

    Object getValue() {
        return v;
    }

    public Indexed(int index, Object v) {
        this.index = index;
        this.v = v;
    }

    public String toString() {
        return "[" + index + "," + v + ']';
    }
}
