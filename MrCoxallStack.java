/*
* The "MrCoxallStack" class
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-22
*/

import java.util.ArrayList;

public class MrCoxallStack {
    /**
    * This is the stack's array.
    */
    private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    /**
    * The Push() function adds integers to the stack.
    * @param pushNumber integer to be added to the stack
    */
    public void push(final int pushNumber) {
        stackAsArray.add(pushNumber);
    }

    /**
    * The pop() function removes integers from the stack.
    */
    public void pop() {
        if (stackAsArray.size() == 0) {
            System.out.println("\nYou cannot pop; the array is empty!");

        } else {
            stackAsArray.remove(stackAsArray.size() - 1);
            System.out.println("\nYou have removed an integer!");
        }
    }

    /**
    * The peek() function shows the user the top integer.
    */
    public void peek() {
        if (stackAsArray.size() == 0) {
            System.out.print("Cannot peek; there is no integers in the ");
            System.out.println(" stack!");

        } else {
            System.out.println("The top integer is "
                + stackAsArray.get(stackAsArray.size() - 1) + "\n");
        }
    }

    /**
    * The clear() function clears the array.
    */
    public void clear() {
        stackAsArray.clear();
    }

    /**
    * The showStack() function shows the user the array.
    */
    public void showStack() {
        System.out.println("All integers in array\n****");
        for (int i : stackAsArray) {
            System.out.println(i);
        }
        System.out.println("****");
    }
}
