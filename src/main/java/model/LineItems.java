package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sharon on 2/26/19.
 */
public class LineItems {
    private List<LineItem> li = null;

    public LineItems() {}

    /**
     *
     * @param li
     */
    public LineItems(List<LineItem> li) {
        super();
        this.li = li;
    }

    public List<LineItem> getLineItems() {
        return li;
    }

    public List<LineItem> getLineItems(long orderId) {
        List<LineItem> lli = new ArrayList<>();
        for(LineItem l : li) {
            if(l.getOrderId() == orderId) {
                lli.add(l);
            }
        }
        return li;
    }

    public void setLineItems(List<LineItem> li) {
        this.li = li;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(LineItem l : li) {
            sb.append("("+l.toString()+")\n");
        }
        return sb.toString();
    }

}
