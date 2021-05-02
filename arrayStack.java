public class arrayStack {
    private String[] s;
    private int N = 0;

    public arrayStack(int capacity) {
        //Note the use of "capacity" as a parameter
        s = new String[capacity];
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public void push(String item) {
        //use to inded into array; then increment N
        s[N++] = item;
    }
    public String pop() {
        //Decrement N; then use to index into array
        return s[--N];
    }
}
