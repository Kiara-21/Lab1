using System;

namespace RestaurantManagementCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee employee = new Employee();
            Console.WriteLine(employee.GetEmployeeInfo());

            Menu menu = new Menu();
            Console.WriteLine(menu.GetDishInfo());

            Order order = new Order();
            Console.WriteLine(order.GetOrderDetails());
        }
    }
}

