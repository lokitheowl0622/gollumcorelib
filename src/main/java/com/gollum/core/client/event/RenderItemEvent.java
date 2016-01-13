package com.gollum.core.client.event;

import com.gollum.core.utils.math.Integer2d;

import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.Event;

public class RenderItemEvent extends Event {

	public RenderItem renderItem;
	public ItemStack itemStack;
	
	public RenderItemEvent(RenderItem renderItem, ItemStack itemStack) {
		this.renderItem = renderItem;
		this.itemStack = itemStack;
	}

	public static class Pre extends RenderItemEvent {
		
		public Pre(RenderItem renderItem, ItemStack itemStack) {
			super(renderItem, itemStack);
		}
		public boolean isCancelable() {
			return true;
		}
	}
	
	public static class Post extends RenderItemEvent {
		
		public Post(RenderItem renderItem, ItemStack itemStack) {
			super(renderItem, itemStack);
		}
	}
	
}
