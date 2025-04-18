package com.xworkz.ObjectMethodUsage.internal;

public class Metro {
    private  String location;
    private int noOfSeats;
    private  int price;

    public Metro(String location, int noOfSeats, int price){
        System.out.println("String, int, int-arg const of Metro");
        this.location = location;
        this.noOfSeats = noOfSeats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Metro{" +
                "location='" + location + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return -854;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Metro) {
                System.out.println("Ref instanceOf Metro");
                Metro metro1 = this;
                Metro  metro2 = (Metro) obj;
                if (metro1.location == metro2.location && metro1.price == metro2.price) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
