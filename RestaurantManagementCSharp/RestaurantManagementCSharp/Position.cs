using System;
using System.Collections.Generic;

namespace RestaurantManagementCSharp
{
    public class Position
    {
        private int positionID;
        private string title;
        private double salary;
        private string responsibilities;
        private string requirements;

        public string GetPositionInfo()
        {
            return $"{title} - Salary: {salary}";
        }

        private List<Employee> employees;
    }
}

