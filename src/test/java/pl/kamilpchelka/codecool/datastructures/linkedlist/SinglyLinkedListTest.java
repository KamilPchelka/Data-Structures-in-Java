package pl.kamilpchelka.codecool.datastructures.linkedlist;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SinglyLinkedListTest {

    List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    private SinglyLinkedList<Integer> singlyLinkedList;

    @Before
    public void setup() {
        this.singlyLinkedList = new SinglyLinkedList<>();
    }

    @Test
    public void append_testIfMethodAddOnlyOneElementToList() {
        Integer data = 5;

        singlyLinkedList.append(data);

        assertThat(singlyLinkedList.toString(), is(equalTo("5")));
    }

    @Test
    public void append_testIfMethodAddMultipleElementsToList() {

        data.forEach(singlyLinkedList::append);

        assertThat(singlyLinkedList.toString(), is(equalTo("1,2,3,4,5")));
    }

    @Test
    public void prepend_testIfPrependingWorksWhenListIsEmpty() {
        singlyLinkedList.prepend(5);

        assertThat(singlyLinkedList.toString(), is(equalTo("5")));

    }


    @Test
    public void prepend_testIfPrependingWorksWhenListHasManyElements() {

        data.forEach(singlyLinkedList::append);
        singlyLinkedList.prepend(9);

        assertThat(singlyLinkedList.toString().charAt(0), is(equalTo('9')));

    }

    @Test
    public void delete_testIfDeletingWorksWithOneElementInTheList() {

        int value = 5;

        singlyLinkedList.append(value);
        singlyLinkedList.delete(value);

        assertThat(singlyLinkedList.toString(), is(equalTo("")));
    }

    @Test
    public void delete_testIfDeletingWorksWithManyElementsInTheList() {


        data.forEach(singlyLinkedList::append);
        singlyLinkedList.delete(5);
        singlyLinkedList.delete(4);


        assertThat(singlyLinkedList.toString(), is(equalTo("1,2,3")));
    }

    @Test
    public void getLast_returnsNullIfListIsEmpty() {

        assertThat(singlyLinkedList.getLast(), is(nullValue()));
    }

    @Test
    public void getLast_returnsHeadWhenListContainsOneelement() {

        int value = 5;

        singlyLinkedList.append(value);

        assertThat(singlyLinkedList.getLast(), is(value));
    }

    @Test
    public void getLast_returnsLastElementAfterAppending() {
        int value = 6;

        data.forEach(singlyLinkedList::append);
        singlyLinkedList.append(value);

        assertThat(singlyLinkedList.getLast(), is(value));
    }

    @Test
    public void map_affectsAllEmenetsInTheList() {
        data.forEach(singlyLinkedList::append);

        singlyLinkedList.map(integer -> ++integer);
        assertThat(singlyLinkedList.toString(), is(equalTo("2,3,4,5,6")));
    }

}