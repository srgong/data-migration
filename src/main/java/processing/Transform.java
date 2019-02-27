package processing;

import model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sharon on 2/26/19.
 */
public class Transform {
    public static LineItems extractLineItems(List<Order> orders) {
        List<LineItem> li = new ArrayList<>();
        for(Order order : orders) {
            li = order.getLineItems();
            for(LineItem l : li) {
                l.setOrderId(order.getId());
                li.add(l);
            }
        }
        LineItems lineItems = new LineItems(li);
        return lineItems;
    }

    public static Metrics getMetrics(Orders orders, LineItems li) {
        List<Metric> metrics = new ArrayList<>();
        List<LineItem> l;
        for(Order o : orders.getOrders()) {
            l = li.getLineItems(o.getId());
            for(LineItem lineItem : l) {
                metrics.add(new Metric(o.getEmail(), o.getId(), lineItem.getId(), lineItem.getProductId(), lineItem.getQuantity()));
            }
        }

        Metrics m = new Metrics(metrics);
        return m;
    }
}
