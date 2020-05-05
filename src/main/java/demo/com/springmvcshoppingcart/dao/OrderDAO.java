package demo.com.springmvcshoppingcart.dao;

import java.util.List;

import demo.com.springmvcshoppingcart.model.CartInfo;
import demo.com.springmvcshoppingcart.model.OrderDetailInfo;
import demo.com.springmvcshoppingcart.model.OrderInfo;
import demo.com.springmvcshoppingcart.model.PaginationResult;

public interface OrderDAO {
	 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}