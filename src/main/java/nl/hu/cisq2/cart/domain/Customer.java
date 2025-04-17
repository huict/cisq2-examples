package nl.hu.cisq2.cart.domain;

public class Customer {

    private final boolean recentlyJoined;
    private final boolean premium;
    private final Region region;

    public Customer(boolean recentlyJoined, boolean premium, Region region) {
        this.recentlyJoined = recentlyJoined;
        this.premium = premium;
        this.region = region;
    }

    public boolean hasRecentlyJoined() {
        return recentlyJoined;
    }

    public boolean hasPremiumAccount() {
        return premium;
    }

    public boolean livesInTheNetherlands() {
        return region.equals(Region.NETHERLANDS);
    }

    public boolean livesOutsideEurope() {
        return region.equals(Region.INTERNATIONAL);
    }

    public Region getRegion() {
        return region;
    }
}
