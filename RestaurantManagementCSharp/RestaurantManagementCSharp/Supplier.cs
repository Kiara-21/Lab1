using System;
using System.Collections.Generic;

namespace RestaurantManagementCSharp
{
    public class Supplier
    {
        private int supplierID;
        private string name;
        private string contact;
        private string address;

        public string GetSupplierDetails()
        {
            return $"{name} - Contact: {contact}";
        }

        private List<Product> suppliedProducts;
    }
}

