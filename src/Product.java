public enum Product {
    PASTA(120,30),
    COCA_COLA(70,0),
    FANTA(70,10),
    PEPSI(75,0.25),
    BREAD(20,0),
    RICE(130,40),
    STILL_WATER(40,10),
    CAKE(600,20),
    MILK(100,0),
    BANANA(250,10),
    APPLE(100,0.0),
    KIWI(300,0),
    SANDWICH(80,0);

    private int price;
    private double sale;

    Product(int price, double sale) {
        this.price = price;
        this.sale = sale;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}

