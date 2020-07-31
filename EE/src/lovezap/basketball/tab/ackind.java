package lovezap.basketball.tab;

/**
 * Created by lenovo on 2020/7/23.
 */
public class ackind {
    private String activity;
    private int times ;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "ackind{" +
                "activity='" + activity + '\'' +
                ", times=" + times +
                '}';
    }
}
