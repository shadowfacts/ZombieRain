package net.shadowfacts.zombierain;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

/**
 * @author shadowfacts
 */
@Mod(modid = ZombieRain.modId, name = ZombieRain.displayName, version = ZombieRain.version)
public class ZombieRain {
	public static final String modId = "zombierain";
	public static final String displayName = "ZombieRain";
	public static final String version = "@VERSION@";

	@Mod.Instance(ZombieRain.modId)
	public static ZombieRain instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.load(event);
		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
