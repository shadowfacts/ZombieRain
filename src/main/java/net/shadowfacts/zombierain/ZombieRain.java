package net.shadowfacts.zombierain;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.common.MinecraftForge;
import net.shadowfacts.shadowapi.command.CommandHandler;
import net.shadowfacts.shadowapi.config.Config;
import net.shadowfacts.shadowapi.config.ConfigManager;

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
		ConfigManager.instance.configDirPath = event.getModConfigurationDirectory().getAbsolutePath();
		ConfigManager.instance.register("ZombieRain", Configuration.class);

		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}

//	@Mod.EventHandler
//	public void serverLoad(FMLServerStartingEvent event) {
//		CommandHandler.initCommands(event);
//	}

}
