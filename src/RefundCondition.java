public abstract class RefundCondition {
    private RefundRule refundRule;

    public RefundCondition(RefundRule refundRule) {
        this.refundRule = refundRule;
    }

    abstract boolean check(Order order, Money deposit);
}