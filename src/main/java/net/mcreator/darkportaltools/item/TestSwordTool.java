
package net.mcreator.darkportaltools.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class TestSwordTool {
	public static final ToolMaterial TESTSWORD_TOOL_MATERIAL = new ToolMaterial() {
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
			return 7F;
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
	public static final Item INSTANCE = new SwordItem(TESTSWORD_TOOL_MATERIAL, -2, -2, (new Item.Settings().group(ItemGroup.COMBAT))) {
	};
}
