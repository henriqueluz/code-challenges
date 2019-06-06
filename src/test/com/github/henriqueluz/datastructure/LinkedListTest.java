package com.github.henriqueluz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {


    @Test
    public void shouldAddElementToNewList() {
        LinkedList<String> list = new LinkedList<>();
        String value = "Value 1";
        String value2 = "Value 2";
        String value3 = "Value 3";
        list.add(value);
        list.add(value2);
        list.add(value3);

        Assert.assertTrue(list.contains(value));
        Assert.assertTrue(list.contains(value2));
        Assert.assertTrue(list.contains(value3));
    }

    @Test
    public void shouldReturnLinkedListAsNodeValuesSeparatedByComma() {
        LinkedList<String> list = new LinkedList<>();
        String value = "Value 1";
        String value2 = "Value 2";
        String value3 = "Value 3";
        String value4 = "Value 4";

        list.add(value);
        list.add(value2);
        list.add(value3);
        list.add(value4);

        String expected = value + "," + value2 + "," + value3 + "," + value4 + ",";

        Assert.assertEquals(expected, list.toString());
    }

}