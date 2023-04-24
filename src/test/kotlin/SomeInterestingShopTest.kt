import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import payment.PaymentProcessor
import payment.SomeInterestingShop

/**
 * Test scenario for the payment processor.
 */
class SomeInterestingShopTest {
    @Test
    fun `process payment and return true`() {
        // Arrange
        val mockPaymentProcessor = mockk<PaymentProcessor>()
        every { mockPaymentProcessor.processPaymentTransaction(any(), any()) } returns true

        val onlineStore = SomeInterestingShop(mockPaymentProcessor)

        // Act
        val result = onlineStore.checkoutCart(100.0, "RSD")

        // Assert
        verify { mockPaymentProcessor.processPaymentTransaction(100.0, "RSD") }
        assertTrue(result, "Payment was successful.")
    }
}