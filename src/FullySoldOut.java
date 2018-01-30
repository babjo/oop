public class FullySoldOut extends RefundCondition {
    public FullySoldOut(FullPaymentRefundRule fullPaymentRefundRule) {
        super(fullPaymentRefundRule);
    }

    @Override
    boolean check(Order order, Money deposit) {
        return true;
    }
}