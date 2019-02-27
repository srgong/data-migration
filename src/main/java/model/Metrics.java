package model;

import java.util.List;

/**
 * Created by Sharon on 2/26/19.
 */
public class Metrics {
    List<Metric> m = null;

    public Metrics() {}

    /**
     *
     * @param m
     */
    public Metrics(List<Metric> m) {
        super();
        this.m = m;
    }

    public List<Metric> getMetrics() {
        return m;
    }

    public void setMetrics(List<Metric> m) {
        this.m = m;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Metric metric : m) {
            sb.append("("+metric.toString()+")\n");
        }
        return sb.toString();
    }


}
