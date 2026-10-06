package DAY4;

import java.util.Scanner;

class Movie{
    String CustomerName;
    String MovieName;
    double Price;
    int Quantity;
    double Total;

    Movie(String CustomerName, String MovieName, double Price, int Quantity){
        this.CustomerName = CustomerName;
        this.MovieName = MovieName;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    void calculateAmount(){
        Total = (double) Price * Quantity;
    }

    void display(){
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Movie Name: " + MovieName);
        System.out.println("Price: " + Price);
        System.out.println("Quantity: " + Quantity);
        System.out.println("Total Amount: " + Total);
    }
}
public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie m = new Movie(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextInt());
        m.calculateAmount();
        m.display();
    }


}
