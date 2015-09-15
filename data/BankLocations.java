package data;/*
 * Created by bloodwi11 on 3/9/2015.
 */

import org.dreambot.api.methods.map.Area;

public enum BankLocations {
    LUMBRIDGE(Constants.BankData.BANK_LOCATIONS[0],Constants.BankData.BANK_LOCATION_FORMATTED_NAMES[0]),
    DRAYNOR(Constants.BankData.BANK_LOCATIONS[1],Constants.BankData.BANK_LOCATION_FORMATTED_NAMES[1]),
    FALADOR_EAST(Constants.BankData.BANK_LOCATIONS[2],Constants.BankData.BANK_LOCATION_FORMATTED_NAMES[2]),
    FALADOR_WEST(Constants.BankData.BANK_LOCATIONS[3],Constants.BankData.BANK_LOCATION_FORMATTED_NAMES[3]),
    EDGEVILLE(Constants.BankData.BANK_LOCATIONS[4],Constants.BankData.BANK_LOCATION_FORMATTED_NAMES[4]),
    VARROCK_EAST(Constants.BankData.BANK_LOCATIONS[5],Constants.BankData.BANK_LOCATION_FORMATTED_NAMES[5]),
    VARROCK_WEST(Constants.BankData.BANK_LOCATIONS[6],Constants.BankData.BANK_LOCATION_FORMATTED_NAMES[6]),
    AL_KHARID(Constants.BankData.BANK_LOCATIONS[7],Constants.BankData.BANK_LOCATION_FORMATTED_NAMES[7]);

    private Area bankLocation;
    private String locationName;

    BankLocations (Area bankLocation, String locationName) {
        this.bankLocation = bankLocation;
        this.locationName = locationName;
    }

    public Area getBankLocation() {
        return bankLocation;
    }
    public String getLocationName() {
        return locationName;
    }
}
