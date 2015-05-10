package net.shadowfacts.zombierain;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * @author shadowfacts
 */
public class Config {
//	Configurable values
	public static boolean disableOtherMobSpawns;
	public static boolean teleportZombies;
	public static int teleportHeight;


	public static Configuration configuration;

	public static void load(FMLPreInitializationEvent event) {
		configuration = new Configuration(new File(event.getModConfigurationDirectory().getAbsolutePath() + "/shadow/ZombieRain.cfg"));
		configuration.load();

		disableOtherMobSpawns = configuration.getBoolean("disableOtherMobSpawns", "general", true, "Disable all mob spawns except zombies.");
		teleportZombies = configuration.getBoolean("teleportZombies", "general", true, "Teleport zombies up so the spawn in mid-air");
		teleportHeight = configuration.getInt("teleportHeight", "general", 16, 0, 256, "How high in the air to teleport zombies.");

		configuration.save();
	}

}
