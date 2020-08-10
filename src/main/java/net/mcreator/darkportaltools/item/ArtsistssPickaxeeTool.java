
package net.mcreator.darkportaltools.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class ArtsistssPickaxeeTool {
	public static final ToolMaterial ARTSISTSSPICKAXEE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 660;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 9F;
		}

		@Override
		public float getAttackDamage() {
			return 2F;
		}

		@Override
		public int getMiningLevel() {
			return 4;
		}

		@Override
		public int getEnchantability() {
			return 18;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.EMPTY;
		}
	};
	public static final Item INSTANCE = new PickaxeItem(ARTSISTSSPICKAXEE_TOOL_MATERIAL, -3, -3, (new Item.Settings().group(ItemGroup.TOOLS))) {
	};
}
