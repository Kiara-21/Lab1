using System;
using System.Collections.Generic;

namespace RestaurantManagementCSharp
{
    public class Order
    {
        private int orderID;
        private string date;
        private string time;
        private int tableNumber;
        private string status;

        public void MarkAsCompleted()
        {
            status = "Completed";
        }

        public string GetOrderDetails()
        {
            return $"Order ID: {orderID}, Status: {status}";
        }

        public List<Order> GetCompletedOrders()
        {
            return new List<Order>(); // Placeholder for completed orders
        }

        public List<Order> GetOrderByTable(int tableNumber)
        {
            return new List<Order>(); // Placeholder for orders by table
        }

        private List<Employee> assignedEmployees;
        private List<Menu> orderedDishes;
        private List<Product> includedProducts;
    }
}

