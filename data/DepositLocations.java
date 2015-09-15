package data;/*
 * Created by bloodwi11 on 3/9/2015.
 */

import org.dreambot.api.methods.map.Area;

public enum DepositLocations {
    PORT_SARIM(Constants.BankData.DEPOSIT_BOX_LOCATIONS[0],Constants.BankData.DEPOSIT_BOX_FORMATTED_NAMES[0]);

    private Area depositLocation;
    private String locationName;

    DepositLocations (Area depositLocation, String locationName) {
        this.depositLocation = depositLocation;
        this.locationName = locationName;
    }

    public Area getDepositLocation() {
        return depositLocation;
    }
    public String getLocationName() {
        return locationName;
    }
}
