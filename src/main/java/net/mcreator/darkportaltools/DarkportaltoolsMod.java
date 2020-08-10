/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.darkportaltools;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ArmorItem;
import net.minecraft.entity.EquipmentSlot;

import net.mcreator.darkportaltools.item._CinbarkArmorArmorMaterial;
import net.mcreator.darkportaltools.item.TestSwordTool;
import net.mcreator.darkportaltools.item.TTuvekArmorArmorArmorMaterial;
import net.mcreator.darkportaltools.item.ArtsistssPickaxeeTool;
import net.mcreator.darkportaltools.item.ArtisianShovelTool;
import net.mcreator.darkportaltools.item.ArtisianHoeTool;
import net.mcreator.darkportaltools.item.ArtisianAxeTool;

import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class DarkportaltoolsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item _CinbarkArmor_HELMET = Registry.register(Registry.ITEM, id("_cinbark_armor"),
			new ArmorItem(_CinbarkArmorArmorMaterial._CINBARKARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item _CinbarkArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("_cinbark_armor"),
			new ArmorItem(_CinbarkArmorArmorMaterial._CINBARKARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item _CinbarkArmor_LEGGINGS = Registry.register(Registry.ITEM, id("_cinbark_armor"),
			new ArmorItem(_CinbarkArmorArmorMaterial._CINBARKARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item _CinbarkArmor_BOOTS = Registry.register(Registry.ITEM, id("_cinbark_armor"),
			new ArmorItem(_CinbarkArmorArmorMaterial._CINBARKARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item TTuvekArmorArmor_HELMET = Registry.register(Registry.ITEM, id("t_tuvek_armor_armor"),
			new ArmorItem(TTuvekArmorArmorArmorMaterial.TTUVEKARMORARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item TTuvekArmorArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("t_tuvek_armor_armor"),
			new ArmorItem(TTuvekArmorArmorArmorMaterial.TTUVEKARMORARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item TTuvekArmorArmor_LEGGINGS = Registry.register(Registry.ITEM, id("t_tuvek_armor_armor"),
			new ArmorItem(TTuvekArmorArmorArmorMaterial.TTUVEKARMORARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item TTuvekArmorArmor_BOOTS = Registry.register(Registry.ITEM, id("t_tuvek_armor_armor"),
			new ArmorItem(TTuvekArmorArmorArmorMaterial.TTUVEKARMORARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item ArtisianAxe_TOOL = Registry.register(Registry.ITEM, id("artisian_axe"), ArtisianAxeTool.INSTANCE);
	public static final Item ArtisianShovel_TOOL = Registry.register(Registry.ITEM, id("artisian_shovel"), ArtisianShovelTool.INSTANCE);
	public static final Item ArtisianHoe_TOOL = Registry.register(Registry.ITEM, id("artisian_hoe"), ArtisianHoeTool.INSTANCE);
	public static final Item ArtsistssPickaxee_TOOL = Registry.register(Registry.ITEM, id("artsistss_pickaxee"), ArtsistssPickaxeeTool.INSTANCE);
	public static final Item TestSword_TOOL = Registry.register(Registry.ITEM, id("test_sword"), TestSwordTool.INSTANCE);
	public void onInitialize() {
		LOGGER.info("[DarkportaltoolsMod] Initializing");
		WorldTickCallback.EVENT.register((world) -> {
		});
		UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
			return ActionResult.PASS;
		});
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			return ActionResult.PASS;
		});
		UseItemCallback.EVENT.register((player, world, hand) -> {
			return TypedActionResult.pass(player.getStackInHand(hand));
		});
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("darkportaltools", s);
	}
}
