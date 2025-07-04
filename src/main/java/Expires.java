import java.time.LocalDate;

public class Expires implements Expirable {
    private LocalDate expirationDate;
    @Override
    public boolean isExpired() {
        return expirationDate.isBefore(LocalDate.now());
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}

