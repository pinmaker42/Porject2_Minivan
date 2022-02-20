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
        //Park, neutral, reverse, drive
        //Logic If park -> park -> gear released
        /**
         * Gear was any gear other than park; is now in park.
         */
//        //GEAR_PARKED,
//
//                /**
//                 * Gear was in park; is now in any other gear.
//                 */
//                GEAR_RELEASED,
//
//                /**
//                 * Gear was any gear other than park; is now in a different non-park gear.
//                 * For example, this applies to shifting from neutral to drive.
//                 */
//                GEAR_CHANGED,
        //If gear started in park and ended in park
        if(requestedGear == this.gear) {
            return  result.NO_ACTION;
        }

        //If gear was in park and now moving to another gear
        if(this.gear == Gear.PARK)
        {
            if(requestedGear != gear.PARK)
            {
                return result.GEAR_RELEASED;
            }

        }

        else {
            return result.GEAR_PARKED;
        }
        return result.NO_ACTION;
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
