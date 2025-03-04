public class Node {

    private String key;
    private Integer value;
    private Node next;

    public Node(){
        this.key = null;
        this.value = null;
        this.next = null;
    }

    public Node(String key, Integer value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Node(String key, Integer value, Node next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "Node{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", next=" + next +
                '}';
    }

}
