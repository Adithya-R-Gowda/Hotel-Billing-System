package HotelBillingSystem;

public class Bill {
    int itemId;
    int itemPrice;
    String itemName;
    int quantity;
    int subTotal;

    public Bill(int itemId, int itemPrice, String itemName, int quantity, int subTotal) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return itemId+"        "+itemName+"        "+itemPrice+"        "+quantity+"        "+subTotal;
    }
}
