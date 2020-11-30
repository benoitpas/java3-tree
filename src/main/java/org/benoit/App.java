package org.benoit;

public class App {
    static Leaf l = Leaf.get();
    static Node nd = new Node("d", l, l);
    static Node ne = new Node("e", l, l);
    static Node nc = new Node("c",nd, ne);
    static Node nb = new Node("b", l, l);
    public static Node na = new Node("a", nb, nc);

    public static void main( String[] args ) {

        System.out.println(na);
        System.out.println(na.addId());
    }
}
