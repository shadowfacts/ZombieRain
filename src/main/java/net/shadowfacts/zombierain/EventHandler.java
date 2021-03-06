package net.shadowfacts.zombierain;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;

/**
 * @author shadowfacts
 */
public class EventHandler {

	@SubscribeEvent
	public void spawnEvent(LivingSpawnEvent.CheckSpawn event) {
		if (event.entity instanceof EntityZombie) {

			boolean canceled = false;

			if (Configuration.teleportZombies) {
				int blockX = (int) Math.floor(event.x);
				int blockY = (int) Math.floor(event.y);
				int blockZ = (int) Math.floor(event.z);
				if (event.world.canBlockSeeTheSky(blockX, blockY, blockZ)) {
					event.entity.setPosition(event.entity.posX, event.entity.posY + Configuration.teleportHeight, event.entity.posZ);
				}
				if (event.world.getFullBlockLightValue(blockX, blockY, blockZ) >= 7) {
					canceled = true;
				}
			}

			if (!canceled) event.setResult(Event.Result.ALLOW);

		} else {
			if (Configuration.disableOtherMobSpawns) {
				event.setResult(Event.Result.DENY);
			}
		}
	}

}
