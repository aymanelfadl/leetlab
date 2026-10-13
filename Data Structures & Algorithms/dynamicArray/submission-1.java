class DynamicArray {
    private int cap;
    private int size;
    private int arr[];

    public DynamicArray(int capacity) {
        this.cap = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.cap)
            this.resize();
        this.arr[this.size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        int val = this.arr[this.size];
        this.arr[this.size] = 0;
        return val;
    }

    private void resize() {
        int[] newArr = new int[this.cap * 2];
        for(int i = 0; i < this.size; i++)
            newArr[i] = this.arr[i];
        
        this.arr = newArr;
        this.cap *= 2; 
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.cap;
    }
}
