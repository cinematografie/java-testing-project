import junit.CustomerCredit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerCreditTest {

    @Test
    void twoPositiveCustomerPaymentsShouldAddTogetherCorrectly() {
        var credit = new CustomerCredit();
        assertEquals(5, credit.add(2,3));
    }

    @Test
    void oneNegativeAndOnePositiveCustomerPaymentShouldAddTogetherCorrectly(){
        var credit = new CustomerCredit();
        assertEquals(6, credit.add(-11, 17));
    }

    @Test
    void twoNegativeCustomerPaymentsShouldAddTogetherCorrectly() {
        var credit = new CustomerCredit();
        assertEquals(-16, credit.add(-10, -6));
    }

}