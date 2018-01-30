public abstract class RefundRule {
    private CancelationRule cancelationRule;
    public RefundRule(CancelationRule cancelationRule) {
        this.cancelationRule = cancelationRule;
    }



    abstract void refund(Order order, Money deposit);
}