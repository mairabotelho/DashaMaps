public class DashMapOne implements HashMapX{

    Node[] bucket;

    public DashMapOne(){
        bucket = HashMapX.initializeBuckets();
    }

    private String HashFunctionOne(String input) {

        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }

        return null;
    }

    private void appendTo(Node head, Node newNode){
        while (head.getNext() != null){
            head = head.getNext();
        }

        head.setNext(newNode);
    }

    private Node findFirst(String key){
        Node head;
        try {
            char letter = HashFunctionOne(key).charAt(0);
            head = bucket[(letter - 'a') % 26];
        } catch (NullPointerException e){
            head = null;
        }
        return head;
    }

    public void set(String key, String value) {
        Node head = findFirst(key);
        Node newVal = new Node(key, Integer.valueOf(value));
        appendTo(head, newVal);
    }

    public String delete(String key) {
        Node head = findFirst(key);

        while (head.getNext() != null){
            if (head.getNext().getKey().equals(key)){
                head.setNext(head.getNext().getNext());

                return "Deleted";
            }
            head = head.getNext();
        }
        return "Not found";
    }

    public Integer get(String key) {
        Node head = findFirst(key);

        while (head.getNext() != null){
            head = head.getNext();
            if (head.getKey().equals(key)){
                return head.getValue();
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long size() {
        long size = 0;
        for (Node n : this.bucket){
            while (n.getNext() != null){
                n = n.getNext();
                size++;
            }
        }
        return size;
    }

    public boolean bucketSize(String key) {
        Node head = findFirst(key);
        return head.getNext() == null;
    }

    public void printMap(){
        for (Node n : this.bucket){
            while (n.getNext() != null){
                n = n.getNext();
                System.out.println(n.toString());
            }
        }
    }
}
