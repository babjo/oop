public class NullCancelationRule extends CancelationRule {
    @Override
    void cancel(Order order) {
        return;
    }
}
