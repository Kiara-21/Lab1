using System;
using System.Collections.Generic;

namespace RestaurantManagementCSharp
{
    public class Menu
    {
        private int menuID;
        private string dishName;
        private string description;
        private double price;
        private int preparationTime;

        public string GetDishInfo()
        {
            return $"{dishName}: {description}";
        }

        public bool IsDishPrepared()
        {
            return false; // Placeholder implementation
        }

        public List<Menu> GetPendingDishes()
        {
            return new List<Menu>(); // Placeholder for pending dishes
        }

        private List<Product> usedInDishes;

        private List<Order> orderedDishes;
    }
}

