public class Books {
    private String title;
    private String author;
    private String date;
    private double price;

    public Books(String title, String author, String date, double price) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }
}
