package org.benoit;

// With jdk1.3 (no generics)
public abstract class Tree {

    Tree addId() {
        return (Tree) addId(0).getValue();
    }
    protected abstract Indexed addId(int start);
}