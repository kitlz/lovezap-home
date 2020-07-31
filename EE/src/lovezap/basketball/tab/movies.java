package lovezap.basketball.tab;

/**
 * Created by lenovo on 2020/7/22.
 */
public class movies {
    private Integer id;
    private String movie;
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "movies{" +
                "id=" + id +
                ", movie='" + movie + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
