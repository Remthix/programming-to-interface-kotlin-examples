package payment

fun main() {
    val stripeProcessor = StripeProcessor()
    val payPalProcessor = PayPalProcessor()

    val storeWithStripe = SomeInterestingShop(stripeProcessor)
    val storeWithPayPal = SomeInterestingShop(payPalProcessor)

    storeWithStripe.checkoutCart(10.0, "EUR") // Prints: Stripe processing: 10.0 EUR
    storeWithPayPal.checkoutCart(7500.0, "RSD") // Prints: PayPal processing: 7500.0 RSD
}

interface PaymentProcessor {
    fun processPaymentTransaction(amount: Double, currency: String): Boolean
}


class StripeProcessor : PaymentProcessor {
    override fun processPaymentTransaction(amount: Double, currency: String): Boolean {
        println("Stripe processing: $amount $currency")
        return true
    }
}

class PayPalProcessor : PaymentProcessor {
    override fun processPaymentTransaction(amount: Double, currency: String): Boolean {
        println("PayPal processing: $amount $currency")
        return true
    }
}

class SomeInterestingShop(private val paymentProcessor: PaymentProcessor) {
    fun checkoutCart(amount: Double, currency: String): Boolean {
        val transactionResult = paymentProcessor.processPaymentTransaction(amount, currency)
        if (transactionResult) {
            println("Payment successful! Thank you for your purchase.")
        } else {
            println("Payment failed! Please try again.")
        }

        return transactionResult;
    }
}