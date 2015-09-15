package data;/*
 * Created by bloodwi11 on 3/9/2015.
 */

import org.dreambot.api.methods.map.Area;

public enum MineLocations {
    LUMBRIDGE_SWAMP_WEST(Constants.MiningSiteData.MINING_SITE_FORMATTED_NAMES[0],Constants.MiningSiteData.MINING_SITES[0]),
    LUMBRIDGE_SWAMP_EAST(Constants.MiningSiteData.MINING_SITE_FORMATTED_NAMES[1],Constants.MiningSiteData.MINING_SITES[1]),
    VARROCK_EAST(Constants.MiningSiteData.MINING_SITE_FORMATTED_NAMES[2],Constants.MiningSiteData.MINING_SITES[2]),
    VARROCK_WEST(Constants.MiningSiteData.MINING_SITE_FORMATTED_NAMES[3],Constants.MiningSiteData.MINING_SITES[3]),
    BARBARIAN_VILLAGE(Constants.MiningSiteData.MINING_SITE_FORMATTED_NAMES[4],Constants.MiningSiteData.MINING_SITES[4]),
    RIMMINGTON_MINE(Constants.MiningSiteData.MINING_SITE_FORMATTED_NAMES[5],Constants.MiningSiteData.MINING_SITES[5]),
    DWARVEN_MINE(Constants.MiningSiteData.MINING_SITE_FORMATTED_NAMES[6],Constants.MiningSiteData.MINING_SITES[6]);

    private Area workZone;
    private String locationName;

    MineLocations (String locationName, Area workZone) {
        this.locationName = locationName;
        this.workZone = workZone;
    }

    public String getLocationName() {
        return locationName;
    }

    public Area getWorkZone() {
        return workZone;
    }
}
