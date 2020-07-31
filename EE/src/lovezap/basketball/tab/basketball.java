package lovezap.basketball.tab;

/**
 * Created by lenovo on 2020/7/20.
 */
public class basketball {
    private Integer id;
    private String name;
    private String play;
    private String happy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getHappy() {
        return happy;
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }

    @Override
    public String toString() {
        return "basketball{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basketball='" + play + '\'' +
                ", happy='" + happy + '\'' +
                '}';
    }
}
