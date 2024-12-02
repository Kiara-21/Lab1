using System;
using System.Collections.Generic;

namespace RestaurantManagementCSharp
{
    public class Employee
    {
        private int employeeID;
        private string fullName;
        private string birthDate;
        private string gender;
        private string address;
        private string phone;
        private string passport;

        public string GetEmployeeInfo()
        {
            return $"ID: {employeeID}, Name: {fullName}";
        }

        public List<Order> GetAssignedOrders()
        {
            return new List<Order>(); // Placeholder for assigned orders
        }

        public List<Employee> GetRestaurantStaff()
        {
            return new List<Employee>(); // Placeholder for restaurant staff
        }

        private Position position;

        private List<Order> assignedOrders;
    }
}

