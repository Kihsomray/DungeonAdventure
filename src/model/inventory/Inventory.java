package model.inventory;

import model.inventory.item.Item;

import java.util.Set;

public interface Inventory {

    /**
     * Gets the inventory as a set.
     *
     * @return Inventory as a set.
     */
    Set<Item> getInventory();

    /**
     * Checks if the inventory contains an item.
     *
     * @param theItem Item to check.
     * @return If the inventory contains an item.
     */
    boolean containsItem(final Item theItem);

    /**
     * Add an item to the inventory.
     *
     * @param theItem Item to add to inventory.
     * @throws IndexOutOfBoundsException Inventory is full.
     */
    void addItem(final Item theItem);

}
