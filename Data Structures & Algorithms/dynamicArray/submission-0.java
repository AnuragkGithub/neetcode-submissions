
class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;

    // Constructor
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    // Return element at index i
    public int get(int i) {
        return arr[i];
    }

    // Set element at index i
    public void set(int i, int n) {
        arr[i] = n;
    }

    // Add element at the end
    public void pushback(int n) {

        // If array is full, resize it
        if (size == capacity) {
            resize();
        }

        arr[size] = n;
        size++;
    }

    // Remove and return last element
    public int popback() {
        size--;
        return arr[size];
    }

    // Double the capacity
    public void resize() {

        capacity = capacity * 2;

        int[] newArr = new int[capacity];

        // Copy old elements into new array
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // Return number of elements
    public int getSize() {
        return size;
    }

    // Return total capacity
    public int getCapacity() {
        return capacity;
    }
}