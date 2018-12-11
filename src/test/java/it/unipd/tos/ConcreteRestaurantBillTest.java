////////////////////////////////////////////////////////////////////
// Simone Dal Pont 1143262
////////////////////////////////////////////////////////////////////

package it.unipd.tos;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import it.unipd.tos.business.ConcreteRestaurantBill;
import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class ConcreteRestaurantBillTest {

    @Test
    public void getOrderPriceDefault() {
        try {
            List<MenuItem> ordine = new ArrayList<MenuItem>();
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Carbonara", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Risotto allo zenzero", 7.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Arrabbiata", 5.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "4 Stagioni", 4.5));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Risotto ai funghi", 6.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Verdure", 6.5));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Puttanesca", 7.0));
            ConcreteRestaurantBill bill = new ConcreteRestaurantBill();

            assertEquals(53, bill.getOrderPrice(ordine), 0.0);

        } catch (RestaurantBillException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void getOrderPriceOltre10Pizze() {
        try {
            List<MenuItem> ordine = new ArrayList<MenuItem>();
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "4 Stagioni", 4.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Verdure", 6.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Marinara", 3.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Diavola", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Viennese", 5.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Bufalina", 5.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Diavola", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ConcreteRestaurantBill bill = new ConcreteRestaurantBill();

            assertEquals(63.5, bill.getOrderPrice(ordine), 0.0);

        } catch (RestaurantBillException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void getOrderPriceOltre100Euro() {
        try {
            List<MenuItem> ordine = new ArrayList<MenuItem>();
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Carbonara", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Risotto allo zenzero", 7.0));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Arrabbiata", 5.5));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Risotto ai funghi", 6.5));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Puttanesca", 7.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Carbonara", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Risotto allo zenzero", 7.0));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Arrabbiata", 5.5));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Risotto ai funghi", 6.5));
            ordine.add(new MenuItem(MenuItem.itemType.Primi, "Puttanesca", 7.0));
            ConcreteRestaurantBill bill = new ConcreteRestaurantBill();

            assertEquals(98.8, bill.getOrderPrice(ordine), 0.0);

        } catch (RestaurantBillException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void getOrderPriceOltre10PizzeOltre100Euro() {
        try {
            List<MenuItem> ordine = new ArrayList<MenuItem>();
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "4 Stagioni", 4.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Verdure", 6.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Marinara", 3.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Diavola", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Viennese", 5.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Bufalina", 5.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Diavola", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ConcreteRestaurantBill bill = new ConcreteRestaurantBill();

            assertEquals(98.325, bill.getOrderPrice(ordine), 0.0);

        } catch (RestaurantBillException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    
    @Test
    public void getOrderPriceThrowsException(){
        try {
            List<MenuItem> ordine = new ArrayList<MenuItem>();
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "4 Stagioni", 4.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Verdure", 6.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Marinara", 3.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Diavola", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Viennese", 5.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Bufalina", 5.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Diavola", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "4 Stagioni", 4.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Verdure", 6.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Peperoni, salamino e olio di Tartufo", 10.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Marinara", 3.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Diavola", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Viennese", 5.5));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Bufalina", 5.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Diavola", 6.0));
            ordine.add(new MenuItem(MenuItem.itemType.Pizze, "Prosciutto", 6.0));
            ConcreteRestaurantBill bill = new ConcreteRestaurantBill();
            double totale = bill.getOrderPrice(ordine);
            
            exception.expect(RestaurantBillException.class);
            exception.expectMessage("Ordine oltre il limite di 20 elementi");

        } catch (RestaurantBillException e) {
            System.out.println(e.getMessage());
        }
    }

}
