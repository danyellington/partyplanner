import models.Party;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartyTest {

//    @Test
//    public void howManyGuests_enterNumber_getNumber() throws Exception {
//        Party testParty = new Party();
//        Integer expected = 100;
//    }

    @Test
    public void howManyGuests_enterNumber_getNumber() throws Exception {
        Party testParty = new Party(12, 12, 12, true, "no");
    }

    @Test
    public void
}