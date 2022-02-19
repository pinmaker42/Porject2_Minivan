package edu.vt.cs5044;

// Template for Spring 2022

public class MinivanSlidingDoor {

    private boolean locked = false;
    private boolean open = false;
    private boolean childSafe = false;
    private Gear gear;
    public Result result;

    public MinivanSlidingDoor() {
        setGear(Gear.PARK);
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isChildSafe() {
        return childSafe;
    }

    public Gear getGear() {
        return this.gear;
    }

    public Result setGear(Gear requestedGear) {
        return Result.GEAR_PARKED;
        //return null; // TODO: Replace this placeholder
    }

    public Result setChildSafe(boolean requestedEngage) {
        // TODO: Your implementation goes here
        return null; // TODO: Replace this placeholder
    }

    public Result pushLockButton() {
        // TODO: Your implementation goes here
        return null; // TODO: Replace this placeholder
    }

    public Result pushUnlockButton() {
        // TODO: Your implementation goes here
        return null; // TODO: Replace this placeholder
    }

    public Result pushDashboardButton(Direction direction) {
        // TODO: Your implementation goes here
        return null; // TODO: Replace this placeholder
    }

    public Result pushInsideHandle(Direction direction) {
        // TODO: Your implementation goes here
        return null; // TODO: Replace this placeholder
    }

    public Result pushOutsideHandle(Direction direction) {
        // TODO: Your implementation goes here
        return null; // TODO: Replace this placeholder
    }
}
