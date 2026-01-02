public class Stack_04 {
    private int[] elementData;
    private int size;
    private int top;

    public Stack_04(final int capacity) {
        this.elementData = new int[capacity];
        this.size = 0;
        this.top = -1;
    }

    //inEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // isFull
    public boolean isFull() {
        return size == elementData.length;
    }

    // size
    public int size() {
        return size;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        return elementData[top];
    }

    // clear
    public void clear() {
        top = -1;
        size = 0;
    }

    // push
    public void push(int data) {
        if (isFull()) {
            grow();
        }
        elementData[++top] = data;
        size++;
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        size--;
        return elementData[top--];
    }
    // printStack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return;
        }
        System.out.print("[ ");
        for (int i = 0; i <= top; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b ]");
    }

    ////////////////////////////////////////////////

    // grow
    private void grow() {
        System.out.println("Stack size increased");

        int[] newElementData = new int[elementData.length * 2];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }
}
