package sql;

import model.Orders;

/**
 * Created by Sharon on 2/21/19.
 */
public class Query {

    public static String insert(Orders o) {
        return "INSERT INTO mytable(id,email,closed_at,created_at,updated_at,number,note,token,gateway,test,total_price,subtotal_price,total_weight,total_tax,taxes_included,currency,financial_status,confirmed,total_discounts,total_line_items_price,cart_token,buyer_accepts_marketing,name,referring_site,landing_site,cancelled_at,cancel_reason,total_price_usd,checkout_token,reference,user_id,location_id,source_identifier,source_url,processed_at,device_id,phone,customer_locale,app_id,browser_ip,landing_site_ref,order_number,processing_method,checkout_id,source_name,fulfillment_status,tags,contact_email,order_status_url,total_discount) VALUES\n" +
                o.getOrders().toString();
    }

    public static String createTable() {
        return "CREATE TABLE mytable(\n" +
                "   id                      INTEGER  NOT NULL PRIMARY KEY \n" +
                "  ,email                   VARCHAR(21) NOT NULL\n" +
                "  ,closed_at               VARCHAR(30)\n" +
                "  ,created_at              VARCHAR(25) NOT NULL\n" +
                "  ,updated_at              VARCHAR(25) NOT NULL\n" +
                "  ,number                  INTEGER  NOT NULL\n" +
                "  ,note                    VARCHAR(30)\n" +
                "  ,token                   VARCHAR(8) NOT NULL\n" +
                "  ,gateway                 VARCHAR(4) NOT NULL\n" +
                "  ,test                    VARCHAR(5) NOT NULL\n" +
                "  ,total_price             NUMERIC(18,14) NOT NULL\n" +
                "  ,subtotal_price          NUMERIC(5,1) NOT NULL\n" +
                "  ,total_weight            INTEGER  NOT NULL\n" +
                "  ,total_tax               NUMERIC(18,15) NOT NULL\n" +
                "  ,taxes_included          VARCHAR(5) NOT NULL\n" +
                "  ,currency                VARCHAR(3) NOT NULL\n" +
                "  ,financial_status        VARCHAR(4) NOT NULL\n" +
                "  ,confirmed               VARCHAR(4) NOT NULL\n" +
                "  ,total_discounts         NUMERIC(4,2) NOT NULL\n" +
                "  ,total_line_items_price  NUMERIC(5,1) NOT NULL\n" +
                "  ,cart_token              VARCHAR(8) NOT NULL\n" +
                "  ,buyer_accepts_marketing VARCHAR(5) NOT NULL\n" +
                "  ,name                    VARCHAR(16) NOT NULL\n" +
                "  ,referring_site          VARCHAR(30)\n" +
                "  ,landing_site            VARCHAR(30)\n" +
                "  ,cancelled_at            VARCHAR(30)\n" +
                "  ,cancel_reason           VARCHAR(30)\n" +
                "  ,total_price_usd         NUMERIC(18,14) NOT NULL\n" +
                "  ,checkout_token          VARCHAR(8) NOT NULL\n" +
                "  ,reference               VARCHAR(36) NOT NULL\n" +
                "  ,user_id                 INTEGER  NOT NULL\n" +
                "  ,location_id             INTEGER  NOT NULL\n" +
                "  ,source_identifier       VARCHAR(15) NOT NULL\n" +
                "  ,source_url              VARCHAR(30)\n" +
                "  ,processed_at            VARCHAR(25) NOT NULL\n" +
                "  ,device_id               INTEGER  NOT NULL\n" +
                "  ,phone                   VARCHAR(12) NOT NULL\n" +
                "  ,customer_locale         VARCHAR(30)\n" +
                "  ,app_id                  INTEGER  NOT NULL\n" +
                "  ,browser_ip              VARCHAR(9) NOT NULL\n" +
                "  ,landing_site_ref        VARCHAR(30)\n" +
                "  ,order_number            INTEGER  NOT NULL\n" +
                "  ,processing_method       VARCHAR(30)\n" +
                "  ,checkout_id             VARCHAR(30)\n" +
                "  ,source_name             VARCHAR(3) NOT NULL\n" +
                "  ,fulfillment_status      VARCHAR(9) NOT NULL\n" +
                "  ,tags                    VARCHAR(30)\n" +
                "  ,contact_email           VARCHAR(21) NOT NULL\n" +
                "  ,order_status_url        VARCHAR(37) NOT NULL\n" +
                "  ,total_discount          VARCHAR(30)\n" +
                ");";
    }
}
