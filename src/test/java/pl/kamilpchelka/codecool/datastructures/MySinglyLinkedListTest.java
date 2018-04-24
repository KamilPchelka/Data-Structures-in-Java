package pl.kamilpchelka.codecool.datastructures;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class MySinglyLinkedListTest {

    List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    private MySinglyLinkedList<Integer> mySinglyLinkedList;

    @Before
    public void setup() {
        this.mySinglyLinkedList = new MySinglyLinkedList<>();
    }

    @Test
    public void append_testIfMethodAddOnlyOneElementToList() {
        Integer data = 5;

        mySinglyLinkedList.append(data);

        assertThat(mySinglyLinkedList.toString(), is(equalTo("5")));
    }

    @Test
    public void append_testIfMethodAddMultipleElementsToList() {

        data.forEach(mySinglyLinkedList::append);

        assertThat(mySinglyLinkedList.toString(), is(equalTo("1,2,3,4,5")));
    }

    @Test
    public void prepend_testIfPrependingWorksWhenListIsEmpty() {
        mySinglyLinkedList.prepend(5);

        assertThat(mySinglyLinkedList.toString(), is(equalTo("5")));

    }

}