import models.Party;
import org.junit.Test;
import static org.junit.Assert.*;



public class PartyTest {


    @Test
    public void createParty_party_getParty() throws Exception {
        Party testParty = new Party(10,10,10, true, "finish");
        assertEquals(true, testParty instanceof Party);
    }

    @Test
    public void guestTotal_TotalGuest_getGuest() throws Exception {
        Party testParty = new Party(10,10,10, true, "finish");
        assertEquals(10, testParty.getGuest());
    }

    @Test
    public void mealCost_TotalMealCost_getPrice() throws Exception {
        Party testParty = new Party(10,10,10, true, "finish");
        assertEquals(250, testParty.calculateMealPrice());
    }

    @Test
    public void drinkCost_TotalDrinkCost_getPrice() throws Exception {
        Party testParty = new Party(10, 10, 10, true, "finish");
        assertEquals(50, testParty.calculateDrinkPrice());
    }

    @Test
    public void entertainmentCost_TotalEntertainmentCostTrue_getPrice() throws Exception {
        Party testParty = new Party(10, 10, 10, true, "finish");
        assertEquals(300, testParty.calculateEntertainmentPrice());
    }

    @Test
    public void entertainmentCost_TotalEntertainmentCostFalse_getPrice() throws Exception {
        Party testParty = new Party(10, 10, 10, false, "finish");
        assertEquals(0, testParty.calculateEntertainmentPrice());
    }


    @Test
    public void totalPrice_TotalCost_getTotal() throws Exception {
        Party testParty = new Party(10, 10, 10, true, "finish");
        assertEquals(600, testParty.calculateFullPrice());
    }

    @Test
    public void couponDiscount_NoCouponDiscount_getDiscount() throws Exception {
        Party testParty = new Party(10, 10, 10, true, "finish");
        assertEquals(0, testParty.calculateCouponDiscount());
    }

    @Test
    public void couponDiscount_TotalCouponDiscount_get50for100Discount() throws Exception {
        Party testParty = new Party(60, 10, 10, true, "50for100");
        assertEquals(500 , testParty.calculateFullPrice());
    }

    @Test
    public void couponDiscount_TotalCouponDiscount_get$50offDiscount() throws Exception {
        Party testParty = new Party(60, 10, 10, true, "$50off");
        assertEquals(550 , testParty.calculateFullPrice());
    }


}


