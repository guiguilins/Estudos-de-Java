package Enum.EnumStatus.application;

import java.util.Locale;
import java.util.Scanner;

import java.util.Date;

import Enum.EnumStatus.entities.Order;
import Enum.EnumStatus.entitiesenum.OrderStatus;

public class Program {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Order order = new Order(1080, OrderStatus.PENDING_PAYMENT, new Date());

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);

        System.out.println(order);
        sc.close();
        }
}
