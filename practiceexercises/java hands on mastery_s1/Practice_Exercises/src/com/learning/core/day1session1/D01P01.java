package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P01 {
  private String title;
  private double price;
 
  public D01P01(String title, double price) {
    this.title = title;
    this.price = price;
  }
 
  public String getTitle() {
    return title;
  }
 
  public void setTitle(String title) {
    this.title = title;
  }
 
  public double getPrice() {
    return price;
  }
 
  public void setPrice(double price) {
    this.price = price;
  }
 
  @SuppressWarnings("resource")
public void createBook() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter book title: ");
    title = scanner.nextLine();
    System.out.println("Enter book price: ");
    price = scanner.nextDouble();
  }
 
  public void showBook() {
    System.out.println("Book Title: " + title + " AND PRICE :" + price);
  }
 
  public static void main(String[] args) {
    D01P01 book1 = new D01P01("", 0.00);
    book1.createBook();
    book1.showBook();
  }
}