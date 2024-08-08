package Enum.EnumStatus.entities;

import java.util.Date;

import Enum.EnumStatus.entitiesenum.OrderStatus;

public class Order {
   private Integer id;
   private OrderStatus order;
   private Date date;

   public Order(Integer id, OrderStatus order, Date date) {
      this.id = id;
      this.order = order;
      this.date = date;

   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public OrderStatus getOrder() {
      return order;
   }

   public void setOrder(OrderStatus order) {
      this.order = order;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

  

   @Override
   public String toString() {
      return "Order [id=" + id + ", order=" + order + ", date=" + date + "]";
   }

}
  
