package com.cookiehook.armorexpansion;

import com.cookiehook.armorexpansion.help.Reference;
import com.cookiehook.armorexpansion.init.ModItems;
import com.cookiehook.armorexpansion.tabs.ArmourTab;
import com.cookiehook.armorexpansion.tabs.ToolsTab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, useMetadata = true)
public class Main {

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.addRecipes();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}