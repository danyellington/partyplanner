package models;

import java.util.Arrays;

public class Party {
    private int guest;
    private int meal;
    private int drink;
    private boolean entertainment;
    private String coupon;
    private int totalPrice;


//
//    public Integer price = guest * 10;
//        return price;



    public Party(int guest, int meal, int drink, boolean entertainment, String coupon) {
        this.guest = guest;
        this.meal = meal;
        this.drink = drink;
        this.entertainment = entertainment;
        this.coupon = coupon;
        this.totalPrice = 0;
    }

    public int getGuest() {
        return this.guest;
    }

    public int getMeal() {
        return this.meal;
    }

    public int getDrink() {
        return this.drink;
    }

    public boolean getEntertainment() {
        return this.entertainment;
    }

    public String getCoupon() {
        return this.coupon;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }


    public int calculateMealPrice() {
        int mealPrice = getMeal();
        return mealPrice *= 25;
    }

    public int calculateDrinkPrice() {
        int drinkPrice = getDrink();
        return drinkPrice *= 5;
    }

    public int calculateEntertainmentPrice() {
        boolean entertainment = getEntertainment();
        if (entertainment) {
            return 300;
        } else {
            return 0;
        }
    }

    public int calculateCouponDiscount() {
        int discount = 0;
        String[] coupons = getCoupon().split(" ");
        if(entertainment && getGuest() > 50 && Arrays.asList(coupons).contains("50for100")){
            discount -= 100;
        }
        if (Arrays.asList(coupons).contains("$50off")) {
            discount -= 50;
        }
        return discount;
    }

    public int calculateFullPrice(){
        return calculateCouponDiscount() + calculateDrinkPrice() + calculateEntertainmentPrice() + calculateMealPrice();
    }

}
