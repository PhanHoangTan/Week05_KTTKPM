package vn.edu.iuh.fit.observerpartern;

public class Stock extends Subject{
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
        notifyObservers();
    }

}
