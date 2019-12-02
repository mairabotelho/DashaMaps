public interface HashMapX {

    void set(String key, String value);
    String delete(String key);
    Integer get(String key);
    boolean isEmpty();
    long size();

    boolean bucketSize(String key);

    static Node[] initializeBuckets(){
        Node[] bucket = new Node[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < bucket.length; i++){
            bucket[i] = new Node();
            bucket[i].setKey(String.valueOf(alpha.charAt(i)));
        }

        return bucket;
    }
}
