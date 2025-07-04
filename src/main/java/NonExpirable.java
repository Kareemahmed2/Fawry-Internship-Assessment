public class NonExpirable implements Expirable {
    public boolean isExpired() {
        return false;
    }
}
