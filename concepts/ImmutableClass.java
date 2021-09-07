package concepts;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {

    private final String name;
    private final int id;
    private final Map<String, String> metaData;

    public ImmutableClass(String name, int id, Map<String, String> metaData) {

        this.name = name;
        this.id = id;
        Map<String, String> temp = new HashMap<>();
        for(Map.Entry<String, String> entry : metaData.entrySet()) {
            temp.put(entry.getKey(), entry.getValue());
        }
        this.metaData = temp;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, String> getMetaData() {

        Map<String, String> temp = new HashMap<>();
        for(Map.Entry<String, String> entry : this.metaData.entrySet()) {
            temp.put(entry.getKey(), entry.getValue());
        }

        return temp;
    }


}
