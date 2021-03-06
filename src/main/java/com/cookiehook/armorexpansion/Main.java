package com.cookiehook.armorexpansion;

import com.cookiehook.armorexpansion.init.ModItems;
import com.cookiehook.armorexpansion.proxy.CommonProxy;
import com.cookiehook.armorexpansion.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, useMetadata = true)
public class Main {

	@Instance(Reference.MOD_ID)
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.setRepairMaterials();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.addSmeltingRecipes();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
