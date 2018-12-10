////////////////////////////////////////////////////////////////////
// Simone Dal Pont 1143262
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class ConcreteRestaurantBill implements RestaurantBill {

	@Override
	public double getOrderPrice(List<MenuItem> itemsOrdered) throws RestaurantBillException {
		double result = 0;
		int countPizze = 0;
		double minPizza = 0;
		if (itemsOrdered.size() <= 20 && !(itemsOrdered.isEmpty())) {
			for (int i = 0; i < itemsOrdered.size(); i++) {
				result = +itemsOrdered.get(i).getPrice();
				if (itemsOrdered.get(i).getItemType().equals(MenuItem.itemType.Pizze)) {
					countPizze++;
					if (minPizza == 0)
						minPizza = itemsOrdered.get(i).getPrice();
					else {
						if (itemsOrdered.get(i).getPrice() < minPizza)
							minPizza = itemsOrdered.get(i).getPrice();
					}
				}
			}
			if (countPizze > 10)
				result -= minPizza;
			if (result > 100)
				result -= result * 0.05;
		} else
			throw new RestaurantBillException("Ordine oltre il limite di 20");
		return result;
	}

}
