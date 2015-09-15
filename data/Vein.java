package data;/*
 * Created by bloodwi11 on 3/9/2015.
 */

public enum Vein {
    COPPER(Constants.VeinData.VEIN_NAME[0],Constants.VeinData.VEIN_ITEM[0], Constants.VeinData.VEIN_LEVEL[0], Constants.VeinData.VEIN_COLOR[0], Constants.VeinData.VEIN_LOCATIONS[0]),
    TIN(Constants.VeinData.VEIN_NAME[1],Constants.VeinData.VEIN_ITEM[1], Constants.VeinData.VEIN_LEVEL[1], Constants.VeinData.VEIN_COLOR[1], Constants.VeinData.VEIN_LOCATIONS[1]),
    CLAY(Constants.VeinData.VEIN_NAME[2],Constants.VeinData.VEIN_ITEM[2], Constants.VeinData.VEIN_LEVEL[2], Constants.VeinData.VEIN_COLOR[2], Constants.VeinData.VEIN_LOCATIONS[2]),
    IRON(Constants.VeinData.VEIN_NAME[3],Constants.VeinData.VEIN_ITEM[3], Constants.VeinData.VEIN_LEVEL[3], Constants.VeinData.VEIN_COLOR[3], Constants.VeinData.VEIN_LOCATIONS[3]),
    SILVER(Constants.VeinData.VEIN_NAME[4],Constants.VeinData.VEIN_ITEM[4], Constants.VeinData.VEIN_LEVEL[4], Constants.VeinData.VEIN_COLOR[4], Constants.VeinData.VEIN_LOCATIONS[4]),
    COAL(Constants.VeinData.VEIN_NAME[5],Constants.VeinData.VEIN_ITEM[5], Constants.VeinData.VEIN_LEVEL[5], Constants.VeinData.VEIN_COLOR[5], Constants.VeinData.VEIN_LOCATIONS[5]),
    GOLD(Constants.VeinData.VEIN_NAME[6],Constants.VeinData.VEIN_ITEM[6], Constants.VeinData.VEIN_LEVEL[6], Constants.VeinData.VEIN_COLOR[6], Constants.VeinData.VEIN_LOCATIONS[6]),
    MITHRIL(Constants.VeinData.VEIN_NAME[7],Constants.VeinData.VEIN_ITEM[7], Constants.VeinData.VEIN_LEVEL[7], Constants.VeinData.VEIN_COLOR[7], Constants.VeinData.VEIN_LOCATIONS[7]),
    ADAMANTITE(Constants.VeinData.VEIN_NAME[8],Constants.VeinData.VEIN_ITEM[8], Constants.VeinData.VEIN_LEVEL[8], Constants.VeinData.VEIN_COLOR[8], Constants.VeinData.VEIN_LOCATIONS[8]);

    private String name;
    private String item;
    private int level;
    private short[] color;
    private int[] locations;

    Vein (String name, String item, int level, short[] color, int[] locations) {
        this.name = name;
        this.item = item;
        this.level = level;
        this.color = color;
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public String getVeinItem() {
        return item;
    }

    public int getVeinLevel() {
        return level;
    }

    public short[] getVeinColor() {
        return color;
    }

    public int[] getVeinLocations() {
        return locations;
    }
}
