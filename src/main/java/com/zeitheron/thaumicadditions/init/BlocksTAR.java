package com.zeitheron.thaumicadditions.init;

import com.zeitheron.thaumicadditions.blocks.BlockAbstractEssentiaJar;
import com.zeitheron.thaumicadditions.blocks.BlockAbstractSmelter;
import com.zeitheron.thaumicadditions.blocks.BlockAspectCombiner;
import com.zeitheron.thaumicadditions.blocks.BlockAuraCharger;
import com.zeitheron.thaumicadditions.blocks.BlockAuraDisperser;
import com.zeitheron.thaumicadditions.blocks.BlockCraftingFurnace;
import com.zeitheron.thaumicadditions.blocks.BlockCrystalBore;
import com.zeitheron.thaumicadditions.blocks.BlockCrystalCrusher;
import com.zeitheron.thaumicadditions.blocks.BlockCrystalWater;
import com.zeitheron.thaumicadditions.blocks.BlockEntitySummoner;
import com.zeitheron.thaumicadditions.blocks.BlockPuriflower;
import com.zeitheron.thaumicadditions.tiles.jars.TileAdaminiteJar;
import com.zeitheron.thaumicadditions.tiles.jars.TileBrassJar;
import com.zeitheron.thaumicadditions.tiles.jars.TileEldritchJar;
import com.zeitheron.thaumicadditions.tiles.jars.TileMithminiteJar;
import com.zeitheron.thaumicadditions.tiles.jars.TileMithrilliumJar;
import com.zeitheron.thaumicadditions.tiles.jars.TileThaumiumJar;

public class BlocksTAR
{
	public static final BlockCraftingFurnace CRAFTING_FURNACE = new BlockCraftingFurnace();
	public static final BlockAbstractSmelter MITHRILLIUM_SMELTER = new BlockAbstractSmelter("mithrillium_smelter", 1F, 20, 1000);
	public static final BlockAbstractSmelter ADAMINITE_SMELTER = new BlockAbstractSmelter("adaminite_smelter", 1.2F, 15, 2000);
	public static final BlockAbstractSmelter MITHMINITE_SMELTER = new BlockAbstractSmelter("mithminite_smelter", 1.5F, 10, 4000);
	
	public static final BlockCrystalWater CRYSTAL_WATER = new BlockCrystalWater();
	public static final BlockAuraDisperser AURA_DISPERSER = new BlockAuraDisperser();
	public static final BlockAspectCombiner ASPECT_COMBINER = new BlockAspectCombiner();
	public static final BlockAuraCharger AURA_CHARGER = new BlockAuraCharger();
	public static final BlockCrystalCrusher CRYSTAL_CRUSHER = new BlockCrystalCrusher();
	public static final BlockCrystalBore CRYSTAL_BORE = new BlockCrystalBore();
	public static final BlockEntitySummoner ENTITY_SUMMONER = new BlockEntitySummoner();
	public static final BlockPuriflower PURIFLOWER = new BlockPuriflower();
	
	public static final BlockAbstractEssentiaJar<TileBrassJar> BRASS_JAR = new BlockAbstractEssentiaJar<>(TileBrassJar.class, 275, "jar_brass");
	public static final BlockAbstractEssentiaJar<TileThaumiumJar> THAUMIUM_JAR = new BlockAbstractEssentiaJar<>(TileThaumiumJar.class, 350, "jar_thaumium");
	public static final BlockAbstractEssentiaJar<TileEldritchJar> ELDRITCH_JAR = new BlockAbstractEssentiaJar<>(TileEldritchJar.class, 500, "jar_eldritch");
	public static final BlockAbstractEssentiaJar<TileMithrilliumJar> MITHRILLIUM_JAR = new BlockAbstractEssentiaJar<>(TileMithrilliumJar.class, 1000, "jar_mithrillium");
	public static final BlockAbstractEssentiaJar<TileAdaminiteJar> ADAMINITE_JAR = new BlockAbstractEssentiaJar<>(TileAdaminiteJar.class, 2000, "jar_adaminite");
	public static final BlockAbstractEssentiaJar<TileMithminiteJar> MITHMINITE_JAR = new BlockAbstractEssentiaJar<>(TileMithminiteJar.class, 4000, "jar_mithminite");
}