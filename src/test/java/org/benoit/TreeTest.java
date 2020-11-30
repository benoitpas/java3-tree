package org.benoit;

public class TreeTest
{
    // This test is an anachronism:
    //
    // Annotations were added in Java 1.5 and junit first released in 2002
    // (https://en.wikipedia.org/wiki/JUnit) while Java 1.3 was released in 2000
    //@Test
    public void shouldAnswerWithTrue() {
        Node expected = new Node(new Indexed(4, "a"),
                new Node(new Indexed(0, "b"), App.l, App.l),
                new Node(new Indexed(3, "c"),
                        new Node(new Indexed(1, "d"), App.l, App.l),
                        new Node(new Indexed(2, "e"), App.l, App.l)));
        org.junit.Assert.assertEquals(expected, App.na.addId());
    }
}
