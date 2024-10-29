/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuong.dev.util;

import cuong.dev.data.model.OrderItem;
import java.util.List;

/**
 *
 * @author BAP VN
 */
public class Helper {
    public static double total(List<OrderItem> orderItemList) {
        double total = 0;
        for (int i = 0; i < orderItemList.size(); i++) {
                OrderItem ord = orderItemList.get(0);
                total += ord.getPrice() * ord.getQuantity();
        }
        return total;
    }
}
