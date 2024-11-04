package net.runelite.client.plugins.microbot.zerozero.tormenteddemons;

import net.runelite.client.config.*;

@ConfigInformation("")
@ConfigGroup("tormenteddemon")
public interface TormentedDemonConfig extends Config {

    @ConfigSection(
            name = "General Settings",
            description = "Full Auto or Combat only",
            position = 0
    )
    String generalSettings = "generalSettings";

    @ConfigItem(
            keyName = "fullAuto",
            name = "Full Auto",
            description = "Enable full auto mode (banking, traveling, fighting, and restocking)",
            section = generalSettings,
            position = 0
    )
    default boolean fullAuto() {
        return true;
    }

    @ConfigItem(
            keyName = "combatOnly",
            name = "Combat Only",
            description = "Only fight Tormented Demons, without banking or traveling",
            section = generalSettings,
            position = 1
    )
    default boolean combatOnly() {
        return false;
    }

    @ConfigSection(
            name = "Tormented Demon Settings",
            description = "Settings for Tormented Demon boss helper",
            position = 1
    )
    String tormentedDemonSection = "tormentedDemon";

    @ConfigItem(
            keyName = "autoPrayerSwitch",
            name = "Enable Defensive Prayer",
            description = "Automatically switch prayers for Tormented Demon.",
            section = tormentedDemonSection,
            position = 2
    )
    default boolean enableDefensivePrayer() {
        return true;
    }

    @ConfigItem(
            keyName = "enableOffensivePrayer",
            name = "Enable Offensive Prayer",
            description = "Toggle to enable or disable offensive prayer during combat",
            section = tormentedDemonSection,
            position = 3
    )
    default boolean enableOffensivePrayer() {
        return false;
    }

    @ConfigItem(
            keyName = "autoGearSwitch",
            name = "Auto Gear Switch",
            description = "Automatically switch gear for Tormented Demon.",
            section = tormentedDemonSection,
            position = 4
    )
    default boolean autoGearSwitch() {
        return true;
    }

    @ConfigItem(
            keyName = "copyGear",
            name = "Copy Gear Setup",
            description = "Specify a setup name to copy gear from your other configurations",
            section = tormentedDemonSection,
            position = 5
    )
    default boolean copyGear() {
        return false;
    }

    @ConfigSection(
            name = "Looting",
            description = "Settings for item looting",
            position = 2
    )
    String lootingSection = "looting";

    @ConfigItem(
            keyName = "lootItems",
            name = "Loot Items",
            description = "Comma-separated list of item names to loot regardless of value",
            section = lootingSection,
            position = 0
    )
    default String lootItems() {
        return "";
    }

    @ConfigItem(
            keyName = "lootValueThreshold",
            name = "Loot Value Threshold",
            description = "Minimum value of items to loot if not specified in the loot list",
            section = lootingSection,
            position = 1
    )
    default int lootValueThreshold() {
        return 1000;
    }


    @ConfigSection(
            name = "Food and Prayer",
            description = "Settings for banking and required supplies",
            position = 3
    )
    String bankingAndSuppliesSection = "bankingAndSupplies";

    @ConfigItem(
            keyName = "minEatPercent",
            name = "Minimum Health Percent",
            description = "Percentage of health below which the bot will eat food",
            section = bankingAndSuppliesSection,
            position = 0
    )
    default int minEatPercent() {
        return 50;
    }

    @ConfigItem(
            keyName = "minPrayerPercent",
            name = "Minimum Prayer Percent",
            description = "Percentage of prayer points below which the bot will drink a prayer potion",
            section = bankingAndSuppliesSection,
            position = 1
    )
    default int minPrayerPercent() {
        return 20;
    }

    @ConfigItem(
            keyName = "healthThreshold",
            name = "Health Threshold to Exit",
            description = "Minimum health percentage to stay and fight",
            section = bankingAndSuppliesSection,
            position = 2
    )
    default int healthThreshold() {
        return 30;
    }

    @ConfigSection(
            name = "Gear Settings",
            description = "Specify gear sets and combat styles for switching",
            position = 4,
            closedByDefault = true
    )
    String gearSettingsSection = "gearSettings";

    @ConfigItem(
            keyName = "useRangeStyle",
            name = "Use Range Style",
            description = "Toggle to use range gear and style",
            section = gearSettingsSection,
            position = 1
    )
    default boolean useRangeStyle() {
        return true;
    }

    @ConfigItem(
            keyName = "rangeGear",
            name = "Range Gear",
            description = "List of items to equip for range attacks (comma separated)",
            section = gearSettingsSection,
            position = 2
    )
    default String rangeGear() {
        return " ";
    }

    @ConfigItem(
            keyName = "useMagicStyle",
            name = "Use Magic Style",
            description = "Toggle to use magic gear and style",
            section = gearSettingsSection,
            position = 3
    )
    default boolean useMagicStyle() {
        return true;
    }

    @ConfigItem(
            keyName = "magicGear",
            name = "Magic Gear",
            description = "List of items to equip for magic attacks (comma separated)",
            section = gearSettingsSection,
            position = 4
    )
    default String magicGear() {
        return " ";
    }

    @ConfigItem(
            keyName = "useMeleeStyle",
            name = "Use Melee Style",
            description = "Toggle to use melee gear and style",
            section = gearSettingsSection,
            position = 5
    )
    default boolean useMeleeStyle() {
        return true;
    }

    @ConfigItem(
            keyName = "meleeGear",
            name = "Melee Gear",
            description = "List of items to equip for melee attacks (comma separated)",
            section = gearSettingsSection,
            position = 6
    )
    default String meleeGear() {
        return " ";
    }
}
