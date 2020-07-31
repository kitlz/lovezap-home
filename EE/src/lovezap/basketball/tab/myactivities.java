package lovezap.basketball.tab;

/**
 * Created by lenovo on 2020/7/22.
 */
public class myactivities {
    private String items;
    private String id;
    private String state;
    private String towrite;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTowrite() {
        return towrite;
    }

    public void setTowrite(String towrite) {
        this.towrite = towrite;
    }

    @Override
    public String toString() {
        return "myactivities{" +
                "items='" + items + '\'' +
                ", id='" + id + '\'' +
                ", state='" + state + '\'' +
                ", towrite='" + towrite + '\'' +
                '}';
    }
}
