package vn.edu.iuh.fit.observerpartern;

public class Investor implements Observer {
    private String name;
    private Stock stock;

    public Investor(String name, Stock stock) {
        this.name = name;
        this.stock = stock;
        this.stock.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Investor " + name + " notified. New stock price: " + stock.getPrice());
    }
}
