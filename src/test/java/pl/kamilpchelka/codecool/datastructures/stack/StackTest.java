package pl.kamilpchelka.codecool.datastructures.stack;

import org.junit.Before;
import org.junit.Test;
import pl.kamilpchelka.codecool.datastructures.exceptions.StackOverflow;
import pl.kamilpchelka.codecool.datastructures.exceptions.StackUnderflow;

import java.util.stream.IntStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class StackTest {


    private final int STACK_TEST_SIZE = 10;

    Stack<Integer> stack;

    @Before
    public void setup() {
        this.stack = new StackImpl<>(STACK_TEST_SIZE);
    }

    @Test
    public void getMaximumCapacity_returnsCorrectCapacity() {
        initializeStackWithElements(STACK_TEST_SIZE);
        assertThat(stack.getMaximumCapacity(), is(equalTo(STACK_TEST_SIZE)));
    }

    @Test
    public void leftSpace_returnsCorrectCapacity() {
        assertThat(stack.leftSpace(), is(equalTo(STACK_TEST_SIZE)));
    }

    @Test(expected = StackOverflow.class)
    public void push_shouldThrowExceptionWhenAddingToFullStack() throws StackOverflow {
        initializeStackWithElements(STACK_TEST_SIZE);
        stack.push(1);
    }

    @Test(expected = StackUnderflow.class)
    public void pop_shouldThrowExceptionWhenPopingFromEmptyStack() throws StackUnderflow {
        stack.pop();
    }

    @Test(expected = StackUnderflow.class)
    public void peek_shouldThrowExceptionWhenPeekingFromEmptyStack() throws StackUnderflow {
        stack.peek();
    }

    @Test
    public void pop_removingItemsCorrectly() throws StackUnderflow {
        initializeStackWithElements(10);
        stack.pop();
        stack.pop();
        stack.pop();

        assertThat(stack.leftSpace(), is(equalTo(3)));
        assertThat(stack.peek(), is(equalTo(7)));
    }


    private void initializeStackWithElements(int amount) {
        IntStream.rangeClosed(1, amount).forEach(value -> {
            try {
                stack.push(value);
            } catch (StackOverflow stackOverflow) {
                stackOverflow.printStackTrace();
            }
        });
    }

}