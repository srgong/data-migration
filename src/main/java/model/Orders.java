package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.List;

/**
 * Created by Sharon on 2/20/19.
 */

public class Orders {

    @JsonProperty("orders")
    private List<Order> orders = null;

    public Orders() {}

    /**
     *
     * @param orders
     */
    public Orders(List<Order> orders) {
        super();
        this.orders = orders;
    }

    @JsonProperty("orders")
    public List<Order> getOrders() {
        return orders;
    }

    @JsonProperty("orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Order o : orders) {
            sb.append("("+o.toString()+")\n");
        }
        return sb.toString();
    }

}



