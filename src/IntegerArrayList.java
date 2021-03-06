/**
 * An ordered collection (a.k.a. sequence) of integers that allows the user to append new elements and access elements by their index.
 * Based on the Java Util List API: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * Implemented using a standard Java array.
 */
public class IntegerArrayList {
    
    private int size;
    private int[] data;

    public IntegerArrayList() {
        this.size = 0;
        this.data = new int[10];
    }

    /**
     * Returns the number of elements in this list. 
     * @return the number of elements in this list
     */
    public int size() {
        return this.size;
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     */
    public int get(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return this.data[index];
    }

    private void increaseLengthData() {
        int[] temp = this.data;
        this.data = new int[this.data.length*2];
        for (int i = 0; i < temp.length; i++) {
            this.data[i] = temp[i];
        }
    }

    /**
     * Appends the specified element to the end of this list.
     * @param value - element to be appended to this list
     */
    public void add(int value) {
        if (this.size == this.data.length) {
            increaseLengthData();
        }
        this.data[this.size] = value;
        this.size += 1;
    }
}
