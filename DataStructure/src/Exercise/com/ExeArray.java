package Exercise.com;

public class ExeArray {
    private int[] items;
    private int count;
    public ExeArray(int length) {
        items = new int[length];
    }
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
