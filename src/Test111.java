import java.util.Arrays;

public class Test111 {
    int[] array = new int[3];
    int size = 0;
    // public Test111(){
    //   array= new int [3];
    //}

    public void add(int b) {
        if (size == array.length) {
            increaseArray();
        }
        array[size] = b;
        size++;
        System.out.println(b);

    }

    public void add(int index, int element) {
        if (size == array.length) {
            increaseArray();
        }
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }


    public void increaseArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    public static void main(String[] args) {
        Test111 test = new Test111();

        test.add(2);
        test.add(4);
        test.add(1, 10);
        test.get(1);

        System.out.println(Arrays.toString(test.array));


    }
}
