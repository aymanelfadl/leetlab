class LinkedList {

    private int val;
    private LinkedList next;

    public LinkedList() {
        this.val = 0;
        this.next = null;
    }

    public int get(int index) {
        if (index < 0)
            return -1;

        LinkedList tmp = this.next;
        int steps = 0;

        while (tmp != null && steps < index) {
            tmp = tmp.next;
            steps++;
        }

        return tmp != null ? tmp.val : -1;
    }

    public void insertHead(int val) {
        LinkedList newNode = new LinkedList();
        newNode.val = val;
        newNode.next = this.next;
        this.next = newNode;
    }

    public void insertTail(int val) {
        LinkedList tmp = this;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        LinkedList newNode = new LinkedList();
        newNode.val = val;
        tmp.next = newNode;
    }

    public boolean remove(int index) {
        if (index < 0)
            return false;

        LinkedList tmp = this;

        for (int i = 0; i < index; i++) {
            if (tmp.next == null)
                return false;
            tmp = tmp.next;
        }

        if (tmp.next == null)
            return false;

        tmp.next = tmp.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();

        LinkedList tmp = this.next;

        while (tmp != null) {
            result.add(tmp.val);
            tmp = tmp.next;
        }

        return result;
    }
}
