package data;

/*
 * Created by bloodwi11 on 3/9/2015.
 */

import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.map.Tile;

public class Constants {

    public static final class SmeltingData {
        public static final Tile FURNACE_LOCATIONS[] = {
                new Tile(3227,3255,0), //Lumbridge
                new Tile(2975,3369,0) //Faldor
        };
    }

    public static final class NPCdata {
        public static final Tile NPC_SHOP_LOCATIONS[] = {
                new Tile(3035,9846,0), //Drogo (Dwarven Mine)
        };
        public static final String NPC_SHOP_NAMES[] = {
                "Drogo dwarf",
        };
        public static final String NPC_SHOP_FORMATTED_NAMES[] = {
                "Drogo (Dwarven Mine)"
        };
    }

    public static final class BankData {
        public static final Area BANK_LOCATIONS[] = {
                //TODO
                //Get proper Bank Locations
                new Area(0,0,0,0,0), //Lumbridge
                new Area(0,0,0,0,0), //Draynor
                new Area(0,0,0,0,0), //Falador East (Has Deposit Box)
                new Area(0,0,0,0,0), //Falador West (Has Deposit Box)
                new Area(0,0,0,0,0), //Edgeville
                new Area(0,0,0,0,0), //Varrock East
                new Area(0,0,0,0,0), //Varrock West
                new Area(0,0,0,0,0), //Al Kharid
        };
        public static final String BANK_LOCATION_FORMATTED_NAMES[] = {
                "Lumbridge",
                "Draynor",
                "Falador East",
                "Falador West",
                "Edgeville",
                "Varrock East",
                "Varrock West",
                "Al Kharid",
        };
        //TODO
        //Change This to a tile.
        public static final Area DEPOSIT_BOX_LOCATIONS[] = {
                new Area(3044,3235,3046,3234, 0), //Port Sarim 3045, 3234
        };
        public static final String DEPOSIT_BOX_FORMATTED_NAMES[] = {
                "Port Sarim",
        };
    }

    public static final class MiningSiteData {
        public static final Area MINING_SITES[] = {
                new Area(3221, 3144, 3231, 3149, 0), //Lumbridge Swamp East
                new Area(3143, 3144, 3149, 3154, 0), //Lumbridge Swamp West
                new Area(3290, 3361, 3281, 3370, 0), //Varrock South East
                new Area(3172, 3365, 3184, 3379, 0), //Varrock South West
                new Area(3078, 3417, 3084, 3423, 0), //Barbarian Village
                new Area(2967, 3232, 2988, 3249, 0), //Rimmington Mine
                new Area(3020, 9759, 3057, 9829, 0), //Dwarven Mine
        };
        public static final String MINING_SITE_FORMATTED_NAMES[] = {
                "Lumbridge Swamp East",
                "Lumbridge Swamp West",
                "Varrock East",
                "Varrock West",
                "Barbarian Village",
                "Rimmington Mine",
                "Dwarven Mine",
        };
    }

    public static final class VeinData {
        public static final short[] VEIN_COLOR[] = {
                new short[]{4645, 3776}, //Copper
                new short[]{53, 57}, //Tin
                new short[]{6705, 6589}, //Clay
                new short[]{2576}, //Iron
                new short[]{7366}, //Silver
                new short[]{10508}, //Coal
                new short[]{6040, 8128}, //Gold
                new short[]{-22239}, //Mithril
                new short[]{21662}  //Adamantite
        };
        public static final String VEIN_NAME[] = {
                "Copper",
                "Tin",
                "Clay",
                "Iron",
                "Silver",
                "Coal",
                "Gold",
                "Mithril",
                "Adamantite"
        };
        public static final String VEIN_ITEM[] = {
                "Copper ore",
                "Tin ore",
                "Clay",
                "Iron ore",
                "Silver ore",
                "Coal",
                "Gold ore",
                "Mithril ore",
                "Adamantite ore"
        };
        public static final int VEIN_LEVEL[] = {
                1, //Copper
                1, //Tin
                1, //Clay
                15, //Iron
                20, //Silver
                30, //Coal
                40, //Gold
                55, //Mithril
                70 //Adamantite
        };
        public static final int[] VEIN_LOCATIONS[] = {
                new int[]{0,2,5,6}, //COPPER
                new int[]{0,2,3,5,6}, //TIN
                new int[]{3,5,6}, //CLAY
                new int[]{2,3,5,6}, //IRON
                new int[]{3}, //SILVER
                new int[]{1,4,6}, //COAL
                new int[]{5,6}, //GOLD
                new int[]{1,6}, //MITHRIL
                new int[]{1,6}, //ADAMANTITE
        };
    }

    public static final class Tools {
        public static final String PICKAXE_NAMES[] = {
                "Bronze pickaxe",
                "Iron pickaxe",
                "Steel pickaxe",
                "Black pickaxe",
                "Mithril pickaxe",
                "Adamant pickaxe",
                "Rune pickaxe",
                "Dragon pickaxe"
        };
        public static final String AXE_NAMES[] = {
                "Bronze axe",
                "Iron axe",
                "Steel axe",
                "Black axe",
                "Mithril axe",
                "Adamant axe",
                "Rune axe",
                "Dragon axe",
        };
        public static final int TOOL_WIELD_LEVEL[] = {
                1,
                1,
                1,
                10,
                20,
                30,
                40,
                60,
        };
        public static final int TOOL_USE_LEVEL[] = {
                1,
                1,
                1,
                11,
                21,
                31,
                41,
                61,
        };
    }

    public enum Jobs {

        MINING("Mining", "Mine Rocks", new int[]{0}),
        QUEST("Quest", "Unused", new int[]{}),
        CRAFT("Craft", "Unused", new int[]{}),
        SMELT("Smelt", "Unused", new int[]{}),
        WOODCUTTING("Woodcutting", "Unused", new int[]{}),
        EXPLORE("Exploration Mode", "Unused", new int[]{});

        private String label;
        private String interact;
        private int[] shops;

        Jobs (String label,String interact, int[] shops) {
            this.label = label;
            this.interact = interact;
            this.shops = shops;
        }

        public String getJobLabel() {
            return label;
        }

        public String getInteract() {
            return interact;
        }

        public int[] getShops() {
            return shops;
        }
    }

    public enum ItemDisposal {
        BANK("Bank Items"),
        DEPOSIT("Deposit Items"),
        SELL("Sell Items"),
        DROP("Drop Items");
        private String label;
        ItemDisposal (String label) {
            this.label = label;
        }
        public String getDisposalLabel() {
            return label;
        }
    }

    public enum DropOptions {
        FULL("When Inventory is Full"),
        ALWAYS("On Pickup");
        private String label;
        DropOptions (String label) {
            this.label = label;
        }
        public String getDropLabel() {
            return label;
        }
    }

    public enum Goal {
        QUOTA("Quota"),
        LEVEL("Level"),
        TIME("Time");
        private String label;
        Goal (String label) {
            this.label = label;
        }
        public String getGoalLabel() {
            return label;
        }
    }

    public enum PaintLevel {
        HIGH("High"),
        MEDIUM("Medium"),
        LOW("Low");
        private String label;
        PaintLevel (String label) {
            this.label = label;
        }
        public String getLabel() {
            return label;
        }
    }
}
