import models.Party;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartyTest {


    @Test
<<<<<<< HEAD
    public void newPartyObjectCorrectlyCreated_true() throws Exception {
        Party party = new Party(12, 12, 12, true, "no");
        assertEquals(true, party instanceof Party);
    }
=======
    public void howManyGuests_enterNumber_getNumber() throws Exception {
        Party testParty = new Party(10,10,10, true, "finish");
        assertEquals(true, testParty instanceof Party);
    }

//    @Test
//    public void
>>>>>>> a0e26e25fdb9f768674714db48dee76b0e23404d
}