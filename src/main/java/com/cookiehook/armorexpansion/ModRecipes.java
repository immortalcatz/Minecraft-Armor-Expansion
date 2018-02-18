package com.cookiehook.armorexpansion;

import com.cookiehook.armorexpansion.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	/**
	 * Adds recipes to the GameRegisty.
	 * This is where you should create new recipes, and call it in Main.
	 */
	public static void addRecipes()
	{
		/*
		 * The addSmelting method is an overloaded method. This means there are multiple copies that can take different arguments.
		 * The first takes an input itemstack, which allows you to set metadata on the item.
		 * The second takes an input item, with default metadata.
		 * In both methods, the second argument is the output, third argument is the amount of XP recieved.
		 * Some vanilla XP values are:
		 *  Iron - 0.7F
		 *  Gold - 1.0F
		 *  Food - 0.35F
		 *  Sand - 0.1F
		 */
		GameRegistry.addSmelting(new ItemStack(Items.DYE, 1, 4), new ItemStack(ModItems.lapis_lazuli_ingot), 1.0F);
		GameRegistry.addSmelting(Items.REDSTONE, new ItemStack(ModItems.redstone_ingot), 1.0F);
		GameRegistry.addSmelting(Items.QUARTZ, new ItemStack(ModItems.quartz_ingot), 1.0F);
		GameRegistry.addSmelting(Items.GLOWSTONE_DUST, new ItemStack(ModItems.glowstone_ingot), 1.0F);
		
		/*
		 * The addRecipe method takes the following arguments:
		 * ItemStack - The output of the recipe.
		 * Objects - Used to define the recipe.
		 * The crafting grid is represented in the three "double quoted" areas. Use a letter placeholder for an item, Space for empty.
		 * Each item placeholder is defined by a 'single quoted' letter, then the Item or ItemStack you wish to use.
		 */
		//Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_sword),
				" A ",
				" A ",
				" B ",
				'A', ModItems.lapis_lazuli_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_pickaxe),
				"AAA",
				" B ",
				" B ",
						'A', ModItems.lapis_lazuli_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_spade),
				" A ",
				" B ",
				" B ",
				'A', ModItems.lapis_lazuli_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_axe),
				"AA ",
				"AB ",
				" B ",
				'A', ModItems.lapis_lazuli_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_hoe),
				"AA ",
				" B ",
				" B ",
				'A', ModItems.lapis_lazuli_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_sword),
				" A ",
				" A ",
				" B ",
				'A', ModItems.redstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_pickaxe),
				"AAA",
				" B ",
				" B ",
				'A', ModItems.redstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_spade),
				" A ",
				" B ",
				" B ",
				'A', ModItems.redstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_axe),
				"AA ",
				"AB ",
				" B ",
				'A', ModItems.redstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_hoe),
				"AA ",
				" B ",
				" B ",
				'A', ModItems.redstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_sword),
				" A ",
				" A ",
				" B ",
				'A', ModItems.quartz_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_pickaxe),
				"AAA",
				" B ",
				" B ",
				'A', ModItems.quartz_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_spade),
				" A ",
				" B ",
				" B ",
				'A', ModItems.quartz_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_axe),
				"AA ",
				"AB ",
				" B ",
				'A', ModItems.quartz_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_hoe),
				"AA ",
				" B ",
				" B ",
				'A', ModItems.quartz_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_sword),
				" A ",
				" A ",
				" B ",
				'A', ModItems.glowstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_pickaxe),
				"AAA",
				" B ",
				" B ",
				'A', ModItems.glowstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_spade),
				" A ",
				" B ",
				" B ",
				'A', ModItems.glowstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_axe),
				"AA ",
				"AB ",
				" B ",
				'A', ModItems.glowstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_hoe),
				"AA ",
				" B ",
				" B ",
				'A', ModItems.glowstone_ingot, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_sword),
				" A ",
				" A ",
				" B ",
				'A', Items.EMERALD, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_pickaxe),
				"AAA",
				" B ",
				" B ",
				'A', Items.EMERALD, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_spade),
				" A ",
				" B ",
				" B ",
				'A', Items.EMERALD, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_axe),
				"AA ",
				"AB ",
				" B ",
				'A', Items.EMERALD, 'B', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_hoe),
				"AA ",
				" B ",
				" B ",
				'A', Items.EMERALD, 'B', Items.STICK);
		
		//Armour
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_helmet),
				"AAA",
				"A A",
				'A', ModItems.lapis_lazuli_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_chestplate),
				"A A",
				"AAA",
				"AAA",
				'A', ModItems.lapis_lazuli_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_leggings),
				"AAA",
				"A A",
				"A A",
				'A', ModItems.lapis_lazuli_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.lapis_boots),
				"A A",
				"A A",
				'A', ModItems.lapis_lazuli_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_helmet),
				"AAA",
				"A A",
				'A', ModItems.redstone_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_chestplate),
				"A A",
				"AAA",
				"AAA",
				'A', ModItems.redstone_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_leggings),
				"AAA",
				"A A",
				"A A",
				'A', ModItems.redstone_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.redstone_boots),
				"A A",
				"A A",
				'A', ModItems.redstone_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_helmet),
				"AAA",
				"A A",
				'A', ModItems.quartz_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_chestplate),
				"A A",
				"AAA",
				"AAA",
				'A', ModItems.quartz_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_leggings),
				"AAA",
				"A A",
				"A A",
				'A', ModItems.quartz_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_boots),
				"A A",
				"A A",
				'A', ModItems.quartz_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_helmet),
				"AAA",
				"A A",
				'A', ModItems.glowstone_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_chestplate),
				"A A",
				"AAA",
				"AAA",
				'A', ModItems.glowstone_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_leggings),
				"AAA",
				"A A",
				"A A",
				'A', ModItems.glowstone_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstone_boots),
				"A A",
				"A A",
				'A', ModItems.glowstone_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_helmet),
				"AAA",
				"A A",
				'A', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_chestplate),
				"A A",
				"AAA",
				"AAA",
				'A', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_leggings),
				"AAA",
				"A A",
				"A A",
				'A', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_boots),
				"A A",
				"A A",
				'A', Items.EMERALD);
		
		//Convert ingots into blocks, to return back to dust form.
		GameRegistry.addRecipe(new ItemStack(Blocks.LAPIS_BLOCK),
				"AAA",
				"AAA",
				"AAA",
				'A', ModItems.lapis_lazuli_ingot);
		GameRegistry.addRecipe(new ItemStack(Blocks.REDSTONE_BLOCK),
				"AAA",
				"AAA",
				"AAA",
				'A', ModItems.redstone_ingot);
		GameRegistry.addRecipe(new ItemStack(Blocks.GLOWSTONE),
				"AA",
				"AA",
				'A', ModItems.glowstone_ingot);
		GameRegistry.addRecipe(new ItemStack(Blocks.QUARTZ_BLOCK),
				"AA",
				"AA",
				'A', ModItems.quartz_ingot);
	}
}