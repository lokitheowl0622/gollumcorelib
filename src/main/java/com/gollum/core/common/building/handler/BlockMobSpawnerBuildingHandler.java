package com.gollum.core.common.building.handler;

import com.gollum.core.common.building.Building.Unity;

import net.minecraft.block.BlockMobSpawner;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;

public class BlockMobSpawnerBuildingHandler extends BuildingBlockHandler {
	
	@Override
	protected boolean mustApply (World world, int x, int y, int z, Unity unity) {
		return unity.block instanceof BlockMobSpawner;
	}
	
	@Override
	public void applyExtra(
		World world,
		int x, int y, int z,
		Unity unity,
		int initX, int initY, int initZ,
		int rotate,
		int dx, int dz,
		int maxX, int maxZ
	) {
		
		TileEntity te  = world.getTileEntity (x, y, z);
		if (te instanceof TileEntityMobSpawner) {
			String entity = ""; try { entity = unity.extra.get("entity"); } catch (Exception e) {} entity = (entity != null) ? entity : "Pig";
			((TileEntityMobSpawner) te).func_145881_a().setEntityName(entity);
		}
	}
	
}
