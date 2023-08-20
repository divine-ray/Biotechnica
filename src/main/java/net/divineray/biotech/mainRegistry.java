package net.divineray.biotech;

import net.divineray.biotech.Items.ItemRegistry;
import net.divineray.biotech.creativetabs.TestTab;
import net.minecraft.creativetab.CreativeTabs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.7.10]")
public class mainRegistry {

    public static final Logger LOG = LogManager.getLogger(Tags.MODID);

    @SidedProxy(clientSide = "net.divineray.biotech.ClientProxy", serverSide = "net.divineray.biotech.commonProxy")
    public static commonProxy proxy;

    // Creative Tabs
    public static CreativeTabs testTab = new TestTab(CreativeTabs.getNextID(), "tabTest");

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc., and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        mainRegistry.LOG.info("FML PreInit started...");

        proxy.preInit(event);

        // BlockRegistry.mainRegistry();
        ItemRegistry.mainRegistry();

        mainRegistry.LOG.info("FML PreInit finished!");
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        mainRegistry.LOG.info("FML Initialisation started...");
        proxy.init(event);
        mainRegistry.LOG.info("FML Initialisation finished!");
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        mainRegistry.LOG.info("FML PostInit started...");
        proxy.postInit(event);
        mainRegistry.LOG.info("FML PostInit finished!");
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
