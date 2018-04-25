package pl.kamilpchelka.codecool.datastructures;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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


    @Test
    public void prepend_testIfPrependingWorksWhenListHasManyElements() {

        data.forEach(mySinglyLinkedList::append);
        mySinglyLinkedList.prepend(9);

        assertThat(mySinglyLinkedList.toString().charAt(0), is(equalTo('9')));

    }

    @Test
    public void delete_testIfDeletingWorksWithOneElementInTheList() {

        int value = 5;

        mySinglyLinkedList.append(value);
        mySinglyLinkedList.delete(value);

        assertThat(mySinglyLinkedList.toString(), is(equalTo("")));
    }

    @Test
    public void delete_testIfDeletingWorksWithManyElementsInTheList() {


        data.forEach(mySinglyLinkedList::append);
        mySinglyLinkedList.delete(5);
        mySinglyLinkedList.delete(4);


        assertThat(mySinglyLinkedList.toString(), is(equalTo("1,2,3")));
    }

    @Test
    public void getLast_returnsNullIfListIsEmpty() {

        assertThat(mySinglyLinkedList.getLast(), is(nullValue()));
    }

    @Test
    public void getLast_returnsHeadWhenListContainsOneelement() {

        int value = 5;

        mySinglyLinkedList.append(value);

        assertThat(mySinglyLinkedList.getLast(), is(value));
    }

    @Test
    public void getLast_returnsLastElementAfterAppending() {
        int value = 6;

        data.forEach(mySinglyLinkedList::append);
        mySinglyLinkedList.append(value);

        assertThat(mySinglyLinkedList.getLast(), is(value));
    }

    @Test
    public void map_affectsAllEmenetsInTheList() {
        data.forEach(mySinglyLinkedList::append);

        mySinglyLinkedList.map(integer -> ++integer);
        assertThat(mySinglyLinkedList.toString(), is(equalTo("2,3,4,5,6")));
    }

}