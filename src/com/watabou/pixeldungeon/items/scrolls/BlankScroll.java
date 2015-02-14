package com.watabou.pixeldungeon.items.scrolls;

import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;

public class BlankScroll extends Item {
	{
		image = ItemSpriteSheet.SCROLL_BLANK;
	}
	
	@Override
	public boolean isUpgradable() {
		return false;
	}
	
	@Override
	public boolean isIdentified() {
		return true;
	}
	
	@Override
	public int price() {
		return 10 * quantity;
	}
}