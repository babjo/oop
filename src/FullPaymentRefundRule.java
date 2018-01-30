public class FullPaymentRefundRule extends RefundRule {
    public FullPaymentRefundRule(NullCancelationRule nullCancelationRule) {
        super(nullCancelationRule);
    }

    @Override
    void refund(Order order, Money deposit) {
    }
}
