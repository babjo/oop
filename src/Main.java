public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        Money money = new Money();

        RefundCondition fullySoldOut = new FullySoldOut(new FullPaymentRefundRule(new NullCancelationRule()));
        // ????
    }
}
