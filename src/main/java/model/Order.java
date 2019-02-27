package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sharon on 2/26/19.
 */

public class Order {
    @JsonProperty("id")
    private long id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("closed_at")
    private Object closedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("number")
    private long number;
    @JsonProperty("note")
    private Object note;
    @JsonProperty("token")
    private String token;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("test")
    private boolean test;
    @JsonProperty("total_price")
    private String totalPrice;
    @JsonProperty("subtotal_price")
    private String subtotalPrice;
    @JsonProperty("total_weight")
    private long totalWeight;
    @JsonProperty("total_tax")
    private String totalTax;
    @JsonProperty("taxes_included")
    private boolean taxesIncluded;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("financial_status")
    private String financialStatus;
    @JsonProperty("confirmed")
    private boolean confirmed;
    @JsonProperty("total_discounts")
    private String totalDiscounts;
    @JsonProperty("total_line_items_price")
    private String totalLineItemsPrice;
    @JsonProperty("cart_token")
    private String cartToken;
    @JsonProperty("buyer_accepts_marketing")
    private boolean buyerAcceptsMarketing;
    @JsonProperty("name")
    private String name;
    @JsonProperty("referring_site")
    private Object referringSite;
    @JsonProperty("landing_site")
    private Object landingSite;
    @JsonProperty("cancelled_at")
    private Object cancelledAt;
    @JsonProperty("cancel_reason")
    private Object cancelReason;
    @JsonProperty("total_price_usd")
    private String totalPriceUsd;
    @JsonProperty("checkout_token")
    private String checkoutToken;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("user_id")
    private long userId;
    @JsonProperty("location_id")
    private long locationId;
    @JsonProperty("source_identifier")
    private String sourceIdentifier;
    @JsonProperty("source_url")
    private Object sourceUrl;
    @JsonProperty("processed_at")
    private String processedAt;
    @JsonProperty("device_id")
    private long deviceId;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("customer_locale")
    private Object customerLocale;
    @JsonProperty("app_id")
    private long appId;
    @JsonProperty("browser_ip")
    private String browserIp;
    @JsonProperty("landing_site_ref")
    private Object landingSiteRef;
    @JsonProperty("order_number")
    private long orderNumber;
    @JsonProperty("processing_method")
    private String processingMethod;
    @JsonProperty("checkout_id")
    private Object checkoutId;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("fulfillment_status")
    private String fulfillmentStatus;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("contact_email")
    private String contactEmail;
    @JsonProperty("order_status_url")
    private String orderStatusUrl;
    @JsonProperty("line_items")
    private List<LineItem> lineItems = null;
    @JsonProperty("total_discount")
    private Object totalDiscount;

    public Order() {
    }

    public Order(long id, String email, Object closedAt, String createdAt, String updatedAt, long number, Object note, String token, String gateway, boolean test, String totalPrice, String subtotalPrice, long totalWeight, String totalTax, boolean taxesIncluded, String currency, String financialStatus, boolean confirmed, String totalDiscounts, String totalLineItemsPrice, String cartToken, boolean buyerAcceptsMarketing, String name, Object referringSite, Object landingSite, Object cancelledAt, Object cancelReason, String totalPriceUsd, String checkoutToken, String reference, long userId, long locationId, String sourceIdentifier, Object sourceUrl, String processedAt, long deviceId, String phone, Object customerLocale, long appId, String browserIp, Object landingSiteRef, long orderNumber, String processingMethod, Object checkoutId, String sourceName, String fulfillmentStatus, String tags, String contactEmail, String orderStatusUrl, List<LineItem> lineItems, Object totalDiscount) {
        super();
        this.id = id;
        this.email = email;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.number = number;
        this.note = note;
        this.token = token;
        this.gateway = gateway;
        this.test = test;
        this.totalPrice = totalPrice;
        this.subtotalPrice = subtotalPrice;
        this.totalWeight = totalWeight;
        this.totalTax = totalTax;
        this.taxesIncluded = taxesIncluded;
        this.currency = currency;
        this.financialStatus = financialStatus;
        this.confirmed = confirmed;
        this.totalDiscounts = totalDiscounts;
        this.totalLineItemsPrice = totalLineItemsPrice;
        this.cartToken = cartToken;
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
        this.name = name;
        this.referringSite = referringSite;
        this.landingSite = landingSite;
        this.cancelledAt = cancelledAt;
        this.cancelReason = cancelReason;
        this.totalPriceUsd = totalPriceUsd;
        this.checkoutToken = checkoutToken;
        this.reference = reference;
        this.userId = userId;
        this.locationId = locationId;
        this.sourceIdentifier = sourceIdentifier;
        this.sourceUrl = sourceUrl;
        this.processedAt = processedAt;
        this.deviceId = deviceId;
        this.phone = phone;
        this.customerLocale = customerLocale;
        this.appId = appId;
        this.browserIp = browserIp;
        this.landingSiteRef = landingSiteRef;
        this.orderNumber = orderNumber;
        this.processingMethod = processingMethod;
        this.checkoutId = checkoutId;
        this.sourceName = sourceName;
        this.fulfillmentStatus = fulfillmentStatus;
        this.tags = tags;
        this.contactEmail = contactEmail;
        this.orderStatusUrl = orderStatusUrl;
        this.lineItems = lineItems;
        this.totalDiscount = totalDiscount;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("number")
    public long getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(long number) {
        this.number = number;
    }

    @JsonProperty("note")
    public Object getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(Object note) {
        this.note = note;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("gateway")
    public String getGateway() {
        return gateway;
    }

    @JsonProperty("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    @JsonProperty("test")
    public boolean isTest() {
        return test;
    }

    @JsonProperty("test")
    public void setTest(boolean test) {
        this.test = test;
    }

    @JsonProperty("total_price")
    public String getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("total_price")
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("subtotal_price")
    public String getSubtotalPrice() {
        return subtotalPrice;
    }

    @JsonProperty("subtotal_price")
    public void setSubtotalPrice(String subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    @JsonProperty("total_weight")
    public long getTotalWeight() {
        return totalWeight;
    }

    @JsonProperty("total_weight")
    public void setTotalWeight(long totalWeight) {
        this.totalWeight = totalWeight;
    }

    @JsonProperty("total_tax")
    public String getTotalTax() {
        return totalTax;
    }

    @JsonProperty("total_tax")
    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    @JsonProperty("taxes_included")
    public boolean isTaxesIncluded() {
        return taxesIncluded;
    }

    @JsonProperty("taxes_included")
    public void setTaxesIncluded(boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("financial_status")
    public String getFinancialStatus() {
        return financialStatus;
    }

    @JsonProperty("financial_status")
    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    @JsonProperty("confirmed")
    public boolean isConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("total_discounts")
    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    @JsonProperty("total_discounts")
    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    @JsonProperty("total_line_items_price")
    public String getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    @JsonProperty("total_line_items_price")
    public void setTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    @JsonProperty("cart_token")
    public String getCartToken() {
        return cartToken;
    }

    @JsonProperty("cart_token")
    public void setCartToken(String cartToken) {
        this.cartToken = cartToken;
    }

    @JsonProperty("buyer_accepts_marketing")
    public boolean isBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    @JsonProperty("buyer_accepts_marketing")
    public void setBuyerAcceptsMarketing(boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("referring_site")
    public Object getReferringSite() {
        return referringSite;
    }

    @JsonProperty("referring_site")
    public void setReferringSite(Object referringSite) {
        this.referringSite = referringSite;
    }

    @JsonProperty("landing_site")
    public Object getLandingSite() {
        return landingSite;
    }

    @JsonProperty("landing_site")
    public void setLandingSite(Object landingSite) {
        this.landingSite = landingSite;
    }

    @JsonProperty("cancelled_at")
    public Object getCancelledAt() {
        return cancelledAt;
    }

    @JsonProperty("cancelled_at")
    public void setCancelledAt(Object cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    @JsonProperty("cancel_reason")
    public Object getCancelReason() {
        return cancelReason;
    }

    @JsonProperty("cancel_reason")
    public void setCancelReason(Object cancelReason) {
        this.cancelReason = cancelReason;
    }

    @JsonProperty("total_price_usd")
    public String getTotalPriceUsd() {
        return totalPriceUsd;
    }

    @JsonProperty("total_price_usd")
    public void setTotalPriceUsd(String totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    @JsonProperty("checkout_token")
    public String getCheckoutToken() {
        return checkoutToken;
    }

    @JsonProperty("checkout_token")
    public void setCheckoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    @JsonProperty("user_id")
    public long getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(long userId) {
        this.userId = userId;
    }

    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }

    @JsonProperty("location_id")
    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("source_identifier")
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    @JsonProperty("source_identifier")
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    @JsonProperty("source_url")
    public Object getSourceUrl() {
        return sourceUrl;
    }

    @JsonProperty("source_url")
    public void setSourceUrl(Object sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    @JsonProperty("processed_at")
    public String getProcessedAt() {
        return processedAt;
    }

    @JsonProperty("processed_at")
    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }

    @JsonProperty("device_id")
    public long getDeviceId() {
        return deviceId;
    }

    @JsonProperty("device_id")
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("customer_locale")
    public Object getCustomerLocale() {
        return customerLocale;
    }

    @JsonProperty("customer_locale")
    public void setCustomerLocale(Object customerLocale) {
        this.customerLocale = customerLocale;
    }

    @JsonProperty("app_id")
    public long getAppId() {
        return appId;
    }

    @JsonProperty("app_id")
    public void setAppId(long appId) {
        this.appId = appId;
    }

    @JsonProperty("browser_ip")
    public String getBrowserIp() {
        return browserIp;
    }

    @JsonProperty("browser_ip")
    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    @JsonProperty("landing_site_ref")
    public Object getLandingSiteRef() {
        return landingSiteRef;
    }

    @JsonProperty("landing_site_ref")
    public void setLandingSiteRef(Object landingSiteRef) {
        this.landingSiteRef = landingSiteRef;
    }

    @JsonProperty("order_number")
    public long getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("order_number")
    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonProperty("processing_method")
    public String getProcessingMethod() {
        return processingMethod;
    }

    @JsonProperty("processing_method")
    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
    }

    @JsonProperty("checkout_id")
    public Object getCheckoutId() {
        return checkoutId;
    }

    @JsonProperty("checkout_id")
    public void setCheckoutId(Object checkoutId) {
        this.checkoutId = checkoutId;
    }

    @JsonProperty("source_name")
    public String getSourceName() {
        return sourceName;
    }

    @JsonProperty("source_name")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @JsonProperty("fulfillment_status")
    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    @JsonProperty("fulfillment_status")
    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    @JsonProperty("contact_email")
    public String getContactEmail() {
        return contactEmail;
    }

    @JsonProperty("contact_email")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @JsonProperty("order_status_url")
    public String getOrderStatusUrl() {
        return orderStatusUrl;
    }

    @JsonProperty("order_status_url")
    public void setOrderStatusUrl(String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    @JsonProperty("line_items")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("line_items")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonProperty("total_discount")
    public Object getTotalDiscount() {
        return totalDiscount;
    }

    @JsonProperty("total_discount")
    public void setTotalDiscount(Object totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append(",").append("email", email).append(",").append("closedAt", closedAt).append(",").append("createdAt", createdAt).append(",").append("updatedAt", updatedAt).append(",").append("number", number).append(",").append("note", note).append(",").append("token", token).append(",").append("gateway", gateway).append(",").append("test", test).append(",").append("totalPrice", totalPrice).append(",").append("subtotalPrice", subtotalPrice).append(",").append("totalWeight", totalWeight).append(",").append("totalTax", totalTax).append(",").append("taxesIncluded", taxesIncluded).append(",").append("currency", currency).append(",").append("financialStatus", financialStatus).append(",").append("confirmed", confirmed).append(",").append("totalDiscounts", totalDiscounts).append(",").append("totalLineItemsPrice", totalLineItemsPrice).append(",").append("cartToken", cartToken).append(",").append("buyerAcceptsMarketing", buyerAcceptsMarketing).append(",").append("name", name).append(",").append("referringSite", referringSite).append(",").append("landingSite", landingSite).append(",").append("cancelledAt", cancelledAt).append(",").append("cancelReason", cancelReason).append(",").append("totalPriceUsd", totalPriceUsd).append(",").append("checkoutToken", checkoutToken).append(",").append("reference", reference).append(",").append("userId", userId).append(",").append("locationId", locationId).append(",").append("sourceIdentifier", sourceIdentifier).append(",").append("sourceUrl", sourceUrl).append(",").append("processedAt", processedAt).append(",").append("deviceId", deviceId).append(",").append("phone", phone).append(",").append("customerLocale", customerLocale).append(",").append("appId", appId).append(",").append("browserIp", browserIp).append(",").append("landingSiteRef", landingSiteRef).append(",").append("orderNumber", orderNumber).append(",").append("processingMethod", processingMethod).append(",").append("checkoutId", checkoutId).append(",").append("sourceName", sourceName).append(",").append("fulfillmentStatus", fulfillmentStatus).append(",").append("tags", tags).append(",").append("contactEmail", contactEmail).append(",").append("orderStatusUrl", orderStatusUrl).append(",").append("lineItems", lineItems).append(",").append("totalDiscount", totalDiscount).toString();
    }

//        @Override
//        public String toString() {
////            return "id: " + id + "\nemail: " + email +"\ncreated_at: " + createdAt+ "\ntotal_price: " + totalPrice + "\nitems: " + lineItems;
//            return id +","+ email + ","+ createdAt + "," + totalPrice + "," + lineItems;
//        }

}
