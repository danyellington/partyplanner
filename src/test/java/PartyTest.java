import models.Party;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartyTest {




    @Test
    public void howManyGuests_enterNumber_getNumber() throws Exception {
        Party testParty = new Party(10,10,10, true, "finish");
        assertEquals(true, testParty instanceof Party);
    }

    @Test
    public void mealCost_TotalMealCost_getPrice() throws Exception {
        Party testParty = new Party(10,10,10, true, "finish");
        assertEquals(250, testParty.calculateMealPrice());
    }

}


