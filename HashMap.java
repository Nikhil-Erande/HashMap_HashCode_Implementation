import java.util.ArrayList;
import java.util.Objects;

class Entry<K, V> {
    int hash;
    K key;
    V value;

    Entry(int hash, K key, V value) {
        this.hash = hash;
        this.key = key;
        this.value = value;
    }
}

public class HashMap<K, V> {
    private ArrayList<Entry<K, V>> data;

    public HashMap() {
        data = new ArrayList<>();
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key.hashCode(), key, value);
        data.add(entry);
    }

    public V get(K key) {
        for (Entry<K, V> entry : data) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        for (Entry<K, V> entry : data) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public void remove(K key) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).key.equals(key)) {
                data.remove(i);
                break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashMap<?, ?> hashMap = (HashMap<?, ?>) o;
        return Objects.equals(data, hashMap.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}