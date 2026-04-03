import java.util.*;

class MyCircularDeque {

    private int[] v;
    private int front, back, size, capacity;

    public MyCircularDeque(int k) {
        v = new int[k];
        front = 0;
        back = 0;
        size = 0;
        capacity = k;
    }

    public boolean insertFront(int value) {
        if (isFull())
            return false;

        front = (front - 1 + capacity) % capacity;
        v[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull())
            return false;

        v[back] = value;
        back = (back + 1) % capacity;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty())
            return false;

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty())
            return false;

        back = (back - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty())
            return -1;
        return v[front];
    }

    public int getRear() {
        if (isEmpty())
            return -1;
        return v[(back - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}