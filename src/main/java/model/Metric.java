package model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by Sharon on 2/26/19.
 */
public class Metric {
    private String email;
    private long order_id;
    private long lineitem_id;
    private long quantity;
    private long productId;

    public Metric(String email, long order_id, long lineitem_id, long quantity, long productId) {
        this.email = email;
        this.order_id = order_id;
        this.lineitem_id = lineitem_id;
        this.quantity =  quantity;
        this.productId = productId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getLineitem_id() {
        return lineitem_id;
    }

    public void setLineitem_id(long lineitem_id) {
        this.lineitem_id = lineitem_id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("email", email).append(",").append("order_id", order_id).append(",").append("lineitem_id", lineitem_id).append(",").append("quantity", quantity).append(",").append("product_id", productId).toString();
    }
}
