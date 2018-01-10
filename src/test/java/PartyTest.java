import models.Party;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartyTest {


    @Test
    public void newPartyObjectCorrectlyCreated_true() throws Exception {
        Party party = new Party(12, 12, 12, true, "no");
        assertEquals(true, party instanceof Party);
    }
}