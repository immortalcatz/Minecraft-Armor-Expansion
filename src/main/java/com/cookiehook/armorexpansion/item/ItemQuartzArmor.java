package com.cookiehook.armorexpansion.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemQuartzArmor extends BaseArmor {
	
	/**
	 * Creates an armor item, using the following parameters.
	 * @param material - The ArmorMaterial needed. This sets properties such as durability, efficiency etc.
	 * @param renderIndex - Used by vanilla armor to choose a texture. We override this with the ArmorMaterial.
	 * @param armorType - Whether this is a helmet, chestplate, leggings or boots. Uses EntityEquipmenSlot Enum values as arguments
	 * @param name - Name used for unlocalised and registry name.
	 */
	public ItemQuartzArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, String name) {
		//This super call passes all the arguments to the BaseArmor constructor, which actually does the work.
		super(material, renderIndex, armorType, name);
	}

	/*
	 * Called every time the armor is updated by vanilla minecraft (20 times per second).
	 * This checks that the armor in each slot (head, chest, legs, feet) is this type of armor.
	 * If this is true, the Haste effect is added for 10 ticks (0.5 seconds).
	 * The result of this is players having the potion effect, only when wearing the entire armor set.
	 */
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if (	player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ItemQuartzArmor
				&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ItemQuartzArmor
				&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ItemQuartzArmor
				&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ItemQuartzArmor) {
			player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 10, 2, false, false));
		}
	}
}
