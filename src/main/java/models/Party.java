package models;

public class Party {
    public int guest;
    public int meal;
    public int drink;
    public String entertainment;
    public String coupon;


//
//    public Integer price = guest * 10;
//        return price;



    public Party(int guest, int meal, int drink, String entertainment, String coupon) {
        this.guest = guest;
        this.meal = meal;
        this.drink = drink;
        this.entertainment = entertainment;
        this.coupon = coupon;

    }

}
