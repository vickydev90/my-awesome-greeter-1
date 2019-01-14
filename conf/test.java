public class Product {
  
   private String title;
   private double price;
   private String description;

   public Product( String title, double price, string description ) {
            this.title = title;
            this.price  = price;
            this.description = description;
      }

   public double retprice() {
        return price;
      }

   public String rettitle() {
        return title;
      }

   public String retdescription() {
        return description;
      }
}

public class Book extends Product {

   private String publisher;

   public Book( String title, double price, string description, String publisher) {

        super( title, price, description);
        this.publisher = publisher;
}
   public String retpublisher() {
        return publisher;
      }
}

public static void main(String args[]){
   Book detail = new Book("test",10,"reciepe book","stephen");
   System.out.println( "title is - " + detail.rettitle() );
}
}