////////////////////////////////////////////////////////////////////
// Simone Dal Pont 1143262
////////////////////////////////////////////////////////////////////

package it.unipd.tos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import it.unipd.tos.model.MenuItem;

public class MenuItemTest {

    @Test
    public void testReturnedValuegetItemType() {
        MenuItem piatto = new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0);
        assertEquals(MenuItem.itemType.Pizze, piatto.getItemType());
    }

    @Test
    public void testReturnedValuegetName() {
        MenuItem piatto = new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0);
        assertEquals("Margherita", piatto.getName());
    }

    @Test
    public void testReturnedValuegetPrice() {
        MenuItem piatto = new MenuItem(MenuItem.itemType.Pizze, "Margherita", 4.0);
        assertEquals(4.0, piatto.getPrice(), 0.0);
    }
}
