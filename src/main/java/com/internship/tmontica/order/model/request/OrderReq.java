package com.internship.tmontica.order.model.request;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class OrderReq {
    @NotEmpty
    @Valid
    private List<Order_MenusReq> menus;
    private int usedPoint;
    @Min(1000)
    private int totalPrice;
    @NotEmpty
    private String payment;

}
