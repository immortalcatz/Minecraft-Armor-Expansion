package com.cookiehook.armorexpansion.init;

import com.cookiehook.armorexpansion.item.BaseIngot;
import com.cookiehook.armorexpansion.item.ItemEmeraldArmor;
import com.cookiehook.armorexpansion.item.ItemGlowstoneArmor;
import com.cookiehook.armorexpansion.item.ItemLapisArmor;
import com.cookiehook.armorexpansion.item.ItemModAxe;
import com.cookiehook.armorexpansion.item.ItemModHoe;
import com.cookiehook.armorexpansion.item.ItemModPickaxe;
import com.cookiehook.armorexpansion.item.ItemModSpade;
import com.cookiehook.armorexpansion.item.ItemModSword;
import com.cookiehook.armorexpansion.item.ItemQuartzArmor;
import com.cookiehook.armorexpansion.item.ItemRedstoneArmor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	/*
	 * The Ingots, Tools and Armors blocks define a variable of type Item for each item.
	 * These are null (empty) until initialised in the init() method.
	 * 
	 * The Tool Material and Armor Material blocks create a new material to be used by these items.
	 * Materials control properties such as harvest level, damage reduction, enchantibility etc.
	 */
	
	// Ingots
	public static Item lapis_lazuli_ingot;
	public static Item redstone_ingot;
	public static Item quartz_ingot;
	public static Item glowstone_ingot;

	// Tool Materials
	public static ToolMaterial LapisToolMaterial;
	public static ToolMaterial RedstoneToolMaterial;
	public static ToolMaterial QuartzToolMaterial;
	public static ToolMaterial GlowstoneToolMaterial;
	public static ToolMaterial EmeraldToolMaterial;
	
	// Armor Materials
	public static ArmorMaterial LapisArmorMaterial;
	public static ArmorMaterial RedstoneArmorMaterial;
	public static ArmorMaterial QuartzArmorMaterial;
	public static ArmorMaterial GlowstoneArmorMaterial;
	public static ArmorMaterial EmeraldArmorMaterial;
	
	// Tools
	public static Item lapis_sword;
	public static Item lapis_pickaxe;
	public static Item lapis_spade;
	public static Item lapis_axe;
	public static Item lapis_hoe;
	public static Item redstone_sword;
	public static Item redstone_pickaxe;
	public static Item redstone_spade;
	public static Item redstone_axe;
	public static Item redstone_hoe;
	public static Item quartz_sword;
	public static Item quartz_pickaxe;
	public static Item quartz_spade;
	public static Item quartz_axe;
	public static Item quartz_hoe;
	public static Item glowstone_sword;
	public static Item glowstone_pickaxe;
	public static Item glowstone_spade;
	public static Item glowstone_axe;
	public static Item glowstone_hoe;
	public static Item emerald_sword;
	public static Item emerald_pickaxe;
	public static Item emerald_spade;
	public static Item emerald_axe;
	public static Item emerald_hoe;

	// Armors
	public static Item lapis_helmet;
	public static Item lapis_chestplate;
	public static Item lapis_leggings;
	public static Item lapis_boots;
	public static Item redstone_helmet;
	public static Item redstone_chestplate;
	public static Item redstone_leggings;
	public static Item redstone_boots;
	public static Item quartz_helmet;
	public static Item quartz_chestplate;
	public static Item quartz_leggings;
	public static Item quartz_boots;
	public static Item glowstone_helmet;
	public static Item glowstone_chestplate;
	public static Item glowstone_leggings;
	public static Item glowstone_boots;
	public static Item emerald_helmet;
	public static Item emerald_chestplate;
	public static Item emerald_leggings;
	public static Item emerald_boots;

	/**
	 *  Creates an object for each of the empty objects defined in the ModItems class.
	 */
	public static void init() {
		/*
		 * Unlike most modding tutorials, I have used Constructors for each item to automatically set the
		 * unlocalisedName, textureName and creativeTab. This reduces the amount of code needed to add a new item.
		 * The constructor looks like "BaseIngot("lapis_lazuli_ingot")", which takes in different arguments.
		 * When using Eclipse, hover over the constructor to see what each parameter is for.
		 */
		
		// Ingots
		/*
		 * Initialises each ingot item as a new object, setting names in the constructor.
		 */
		lapis_lazuli_ingot = new BaseIngot("lapis_lazuli_ingot");
		redstone_ingot = new BaseIngot("redstone_ingot");
		quartz_ingot = new BaseIngot("quartz_ingot");
		glowstone_ingot = new BaseIngot("glowstone_ingot");

		
		/*
		 * The addToolMaterial takes the following inputs:
		 * String name - The used for the list of tool materials.
		 * int harvestLevel - What level of block it can break.
		 * int maxUses - Durability.
		 * float efficiency - How fast it breaks a block
		 * float damage - How much damage is dealt when used as a weapon.
		 * int enchantability - Chance of getting a high level enchantment.
		 * 
		 * Vanilla values (excluding names) are:
		 * WOOD(0, 59, 2.0F, 0.0F, 15),
		 * STONE(1, 131, 4.0F, 1.0F, 5),
		 * IRON(2, 250, 6.0F, 2.0F, 14),
		 * EMERALD(3, 1561, 8.0F, 3.0F, 10), (Emerald is actually diamond)
		 * GOLD(0, 32, 12.0F, 0.0F, 22);
		 */
		LapisToolMaterial = EnumHelper.addToolMaterial("LapisToolMaterial", 2, 200, 7.0F, 2.0F, 20);
		RedstoneToolMaterial = EnumHelper.addToolMaterial("RedstoneToolMaterial", 2, 200, 7.0F, 2.0F, 20);
		QuartzToolMaterial = EnumHelper.addToolMaterial("QuartzToolMaterial", 2, 200, 7.0F, 2.0F, 20);
		GlowstoneToolMaterial = EnumHelper.addToolMaterial("GlowstoneToolMaterial", 2, 200, 7.0F, 2.0F, 20);
		EmeraldToolMaterial = EnumHelper.addToolMaterial("EmeraldToolMaterial", 4, 2000, 12.0F, 4.0F, 22);
		
		/*
		 * The addArmorMaterial takes the following inputs:
		 * String name - The used for the list of armor materials.
		 * int durability - How much damage the armor can take
		 * int[] reductionAmounts - An array determining how much damage the helmet, chestplate, leggings and boot reduce when hit.
		 * int enchantability - Chance of getting a high level enchantment.
		 * 
		 * Vanilla values (excluding names) are:
		 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), (Cloth is actually leather)
		 * CHAIN(15, new int[]{2, 5, 4, 1}, 12),
		 * IRON(15, new int[]{2, 6, 5, 2}, 9),
		 * GOLD(7, new int[]{2, 5, 3, 1}, 25),
		 * DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
		 */
		LapisArmorMaterial = EnumHelper.addArmorMaterial("LapisArmorMaterial", 10, new int[] { 2, 6, 5, 2 }, 15);
		RedstoneArmorMaterial = EnumHelper.addArmorMaterial("RedstoneArmorMaterial", 10, new int[] { 2, 6, 5, 2 }, 15);
		QuartzArmorMaterial = EnumHelper.addArmorMaterial("QuartzArmorMaterial", 10, new int[] { 2, 6, 5, 2 }, 15);
		GlowstoneArmorMaterial = EnumHelper.addArmorMaterial("GlowstoneArmorMaterial", 10, new int[] { 2, 6, 5, 2 }, 15);
		EmeraldArmorMaterial = EnumHelper.addArmorMaterial("EmeraldArmorMaterial", 40, new int[] { 4, 8, 6, 4 }, 15);

		
		
		// Set repair materials for tools
		/*
		 * This sets the item used to repair a tool material in an anvil.
		 * The setRepairItem constructor requires an ItemStack.
		 * The ItemStack constructor requires an Item.
		 * The result of this is that any tools usng the given armor material can be repaired with the ingot listed below.
		 */
		LapisToolMaterial.setRepairItem(new ItemStack(ModItems.lapis_lazuli_ingot));
		RedstoneToolMaterial.setRepairItem(new ItemStack(ModItems.redstone_ingot));
		QuartzToolMaterial.setRepairItem(new ItemStack(ModItems.quartz_ingot));
		GlowstoneToolMaterial.setRepairItem(new ItemStack(ModItems.glowstone_ingot));
		EmeraldToolMaterial.setRepairItem(new ItemStack(Items.emerald));

		lapis_sword = new ItemModSword(LapisToolMaterial, "lapis_sword");
		lapis_pickaxe = new ItemModPickaxe(LapisToolMaterial, "lapis_pickaxe");
		lapis_spade = new ItemModSpade(LapisToolMaterial, "lapis_spade");
		lapis_axe = new ItemModAxe(LapisToolMaterial, "lapis_axe");
		lapis_hoe = new ItemModHoe(LapisToolMaterial, "lapis_hoe");

		redstone_sword = new ItemModSword(RedstoneToolMaterial, "redstone_sword");
		redstone_pickaxe = new ItemModPickaxe(RedstoneToolMaterial, "redstone_pickaxe");
		redstone_spade = new ItemModSpade(RedstoneToolMaterial, "redstone_spade");
		redstone_axe = new ItemModAxe(RedstoneToolMaterial, "redstone_axe");
		redstone_hoe = new ItemModHoe(RedstoneToolMaterial, "redstone_hoe");

		quartz_sword = new ItemModSword(QuartzToolMaterial, "quartz_sword");
		quartz_pickaxe = new ItemModPickaxe(QuartzToolMaterial, "quartz_pickaxe");
		quartz_spade = new ItemModSpade(QuartzToolMaterial, "quartz_spade");
		quartz_axe = new ItemModAxe(QuartzToolMaterial, "quartz_axe");
		quartz_hoe = new ItemModHoe(QuartzToolMaterial, "quartz_hoe");

		glowstone_sword = new ItemModSword(GlowstoneToolMaterial, "glowstone_sword");
		glowstone_pickaxe = new ItemModPickaxe(GlowstoneToolMaterial, "glowstone_pickaxe");
		glowstone_spade = new ItemModSpade(GlowstoneToolMaterial, "glowstone_spade");
		glowstone_axe = new ItemModAxe(GlowstoneToolMaterial, "glowstone_axe");
		glowstone_hoe = new ItemModHoe(GlowstoneToolMaterial, "glowstone_hoe");

		emerald_sword = new ItemModSword(EmeraldToolMaterial, "emerald_sword");
		emerald_pickaxe = new ItemModPickaxe(EmeraldToolMaterial, "emerald_pickaxe");
		emerald_spade = new ItemModSpade(EmeraldToolMaterial, "emerald_spade");
		emerald_axe = new ItemModAxe(EmeraldToolMaterial, "emerald_axe");
		emerald_hoe = new ItemModHoe(EmeraldToolMaterial, "emerald_hoe");

		// Armor
		lapis_helmet = new ItemLapisArmor(LapisArmorMaterial, 0, 0, "lapis_helmet");
		lapis_chestplate = new ItemLapisArmor(LapisArmorMaterial, 0, 1, "lapis_chestplate");
		lapis_leggings = new ItemLapisArmor(LapisArmorMaterial, 0, 2, "lapis_leggings");
		lapis_boots = new ItemLapisArmor(LapisArmorMaterial, 0, 3, "lapis_boots");

		redstone_helmet = new ItemRedstoneArmor(RedstoneArmorMaterial, 0, 0, "redstone_helmet");
		redstone_chestplate = new ItemRedstoneArmor(RedstoneArmorMaterial, 0, 1, "redstone_chestplate");
		redstone_leggings = new ItemRedstoneArmor(RedstoneArmorMaterial, 0, 2, "redstone_leggings");
		redstone_boots = new ItemRedstoneArmor(RedstoneArmorMaterial, 0, 3, "redstone_boots");

		quartz_helmet = new ItemQuartzArmor(QuartzArmorMaterial, 0, 0, "quartz_helmet");
		quartz_chestplate = new ItemQuartzArmor(QuartzArmorMaterial, 0, 1, "quartz_chestplate");
		quartz_leggings = new ItemQuartzArmor(QuartzArmorMaterial, 0, 2, "quartz_leggings");
		quartz_boots = new ItemQuartzArmor(QuartzArmorMaterial, 0, 3, "quartz_boots");

		glowstone_helmet = new ItemGlowstoneArmor(GlowstoneArmorMaterial, 0, 0, "glowstone_helmet");
		glowstone_chestplate = new ItemGlowstoneArmor(GlowstoneArmorMaterial, 0, 1, "glowstone_chestplate");
		glowstone_leggings = new ItemGlowstoneArmor(GlowstoneArmorMaterial, 0, 2, "glowstone_leggings");
		glowstone_boots = new ItemGlowstoneArmor(GlowstoneArmorMaterial, 0, 3, "glowstone_boots");

		emerald_helmet = new ItemEmeraldArmor(EmeraldArmorMaterial, 0, 0, "emerald_helmet");
		emerald_chestplate = new ItemEmeraldArmor(EmeraldArmorMaterial, 0, 1, "emerald_chestplate");
		emerald_leggings = new ItemEmeraldArmor(EmeraldArmorMaterial, 0, 2, "emerald_leggings");
		emerald_boots = new ItemEmeraldArmor(EmeraldArmorMaterial, 0, 3, "emerald_boots");

	}

	/**
	 * Registers the initialised items with the gameRegistry, so they can be access from the game.
	 * The registerItem methods requires the object created at the top of this class, and the unlocalised
	 * name set in each constructor.
	 * As the setUnlocalisedName method adds "item." to the start of every item, substring(5) is used to
	 * remove the first 5 characters.
	 */
	public static void register() {
		// Ingots
		GameRegistry.registerItem(lapis_lazuli_ingot, lapis_lazuli_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_ingot, redstone_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_ingot, quartz_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_ingot, glowstone_ingot.getUnlocalizedName().substring(5));
		// Tools
		GameRegistry.registerItem(lapis_sword, lapis_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_pickaxe, lapis_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_spade, lapis_spade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_axe, lapis_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_hoe, lapis_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_sword, redstone_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_pickaxe, redstone_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_spade, redstone_spade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_axe, redstone_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_hoe, redstone_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_sword, quartz_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_pickaxe, quartz_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_spade, quartz_spade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_axe, quartz_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_hoe, quartz_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_sword, glowstone_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_pickaxe, glowstone_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_spade, glowstone_spade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_axe, glowstone_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_hoe, glowstone_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_sword, emerald_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_pickaxe, emerald_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_spade, emerald_spade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_axe, emerald_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_hoe, emerald_hoe.getUnlocalizedName().substring(5));
		// Armor
		GameRegistry.registerItem(lapis_helmet, lapis_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_chestplate, lapis_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_leggings, lapis_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_boots, lapis_boots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_helmet, redstone_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_chestplate, redstone_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_leggings, redstone_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstone_boots, redstone_boots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_helmet, quartz_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_chestplate, quartz_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_leggings, quartz_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(quartz_boots, quartz_boots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_helmet, glowstone_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_chestplate, glowstone_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_leggings, glowstone_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_boots, glowstone_boots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_helmet, emerald_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_chestplate, emerald_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_leggings, emerald_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_boots, emerald_boots.getUnlocalizedName().substring(5));
	}
}