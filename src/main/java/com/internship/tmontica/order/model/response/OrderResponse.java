package com.internship.tmontica.order.model.response;

import com.internship.tmontica.order.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {

    private int orderId;
    private String payment;
    private String status;
    private int totalPrice;
    private int realPrice;
    private int usedPoint;
    private Date orderDate;
    private List<OrderMenusResponse> menus;

    public OrderResponse(int orderId, Order order, List<OrderMenusResponse> menus) {
        this.orderId = orderId;
        this.payment = order.getPayment();
        this.status = order.getStatus();
        this.totalPrice = order.getTotalPrice();
        this.realPrice = order.getRealPrice();
        this.usedPoint = order.getUsedPoint();
        this.orderDate = order.getOrderDate();
        this.menus = menus;
    }
}
