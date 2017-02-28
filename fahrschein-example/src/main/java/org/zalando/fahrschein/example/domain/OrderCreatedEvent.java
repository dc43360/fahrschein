package org.zalando.fahrschein.example.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by akukuljac on 27/02/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderCreatedEvent {

    private String orderNumber;

    private String customerNumber;

    private Integer grandTotal;

    @JsonCreator
    public OrderCreatedEvent(@JsonProperty("orderNumber") String orderNumber,
                             @JsonProperty("grandTotal") Integer grandTotal,
                             @JsonProperty("customerNumber") String customerNumber) {
        this.orderNumber = orderNumber;
        this.grandTotal = grandTotal;
        this.customerNumber = customerNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Integer getGrandTotal() {
        return grandTotal;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

}
