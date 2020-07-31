package lovezap.basketball.tab;

/**
 * Created by lenovo on 2020/7/22.
 */
public class activity {
    private String items;
     private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "activity{" +
                "items='" + items + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
