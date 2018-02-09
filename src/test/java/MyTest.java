import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void noMethod_alwaysSucceed_success() {
        assertTrue(true);
    }

    @Test
    public void noMethod_alwaysFail_success() {
        fail("Deliberately fail.");
    }
}
