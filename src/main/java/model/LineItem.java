package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by Sharon on 2/26/19.
 */

public class LineItem {

    @JsonProperty("id")
    private long id;
    @JsonProperty("variant_id")
    private long variantId;
    @JsonProperty("quantity")
    private long quantity;
    @JsonProperty("product_id")
    private long productId;

    private long orderId;

    public LineItem() {}
    /**
     *
     * @param id
     * @param quantity
     * @param variantId
     * @param productId
     */
    public LineItem(long id, long variantId, long quantity, long productId) {
        super();
        this.id = id;
        this.variantId = variantId;
        this.quantity = quantity;
        this.productId = productId;
    }


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("variant_id")
    public long getVariantId() {
        return variantId;
    }

    @JsonProperty("variant_id")
    public void setVariantId(long variantId) {
        this.variantId = variantId;
    }

    @JsonProperty("quantity")
    public long getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("product_id")
    public long getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("quantity",quantity).append(",").append("productId",productId).toString();
//        return "\nquantity: " + quantity+ "\nproductId: " + productId;
    }
}