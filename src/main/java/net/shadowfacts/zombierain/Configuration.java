package net.shadowfacts.zombierain;

import net.shadowfacts.shadowapi.config.Config;
import net.shadowfacts.shadowapi.config.ConfigProperty;

/**
 * @author shadowfacts
 */
@Config(name = "ZombieRain")
public class Configuration {

	@ConfigProperty(comment = "Disable all mob spawns except zombies.")
	public static boolean disableOtherMobSpawns = true;

	@ConfigProperty(comment = "Teleport zombies up so the spawn in mid-air")
	public static boolean teleportZombies = true;

	@ConfigProperty(comment = "How high in the air to teleport zombies.", intMin = 0, intMax = 256)
	public static int teleportHeight = 16;

}
