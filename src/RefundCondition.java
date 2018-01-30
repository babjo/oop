public abstract class RefundCondition {
    private RefundRule refundRule;
    public RefundCondition(RefundRule refundRule) {
        this.refundRule = refundRule;
    }

    void refund(Order order, Money deposit) {
        refundRule.refund(order, deposit);
    }

    abstract boolean check(Order order, Money deposit);
}