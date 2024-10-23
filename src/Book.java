public class Book {
    String title, author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getBookInfo(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }

    public double applyDiscount(double discount){
        if(discount > 50){
            System.out.println("big discount.");
            return discount;
        }else {
            price = price - (price * (discount/100));
            return price;
        }


    }
}
