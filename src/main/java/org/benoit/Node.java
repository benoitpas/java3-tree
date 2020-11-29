package org.benoit;

public class Node extends Tree {
    private final Object value;
    private final Tree left;
    private final Tree right;

    public Object getValue() {
        return value;
    }

    public Node(Object value, Tree left, Tree right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    String addTo(String r, Object v) {
        String s = v.toString();
        if (s != "") {
            r = r + "," + s;
        }
        return r;
    }

    public String toString() {
        String r = new String("(") + value.toString();
        r = addTo(r, left);
        r = addTo(r, right);
        r = r + ")";
        return r;
    }


    protected Indexed addId(int start) {
        Indexed newLeft = left.addId(start);
        Indexed newRight = right.addId(newLeft.getIndex());

        return new Indexed(newRight.getIndex() + 1,
                new Node(new Indexed(newRight.getIndex(), this.getValue()),
                        (Tree) newLeft.getValue(),    // main drawback of using 'Object'
                        (Tree) newRight.getValue())); // casting is needed, possible runtime error
    }
}

