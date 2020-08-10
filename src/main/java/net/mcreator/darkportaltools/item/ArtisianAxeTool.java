
package net.mcreator.darkportaltools.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

public class ArtisianAxeTool {
	public static final ToolMaterial ARTISIANAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 3300;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 9F;
		}

		@Override
		public float getAttackDamage() {
			return 7F;
		}

		@Override
		public int getMiningLevel() {
			return 4;
		}

		@Override
		public int getEnchantability() {
			return 28;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.EMPTY;
		}
	};
	public static final Item INSTANCE = new AxeItem(ARTISIANAXE_TOOL_MATERIAL, -3, -3, (new Item.Settings().group(ItemGroup.TOOLS))) {
	};
}
