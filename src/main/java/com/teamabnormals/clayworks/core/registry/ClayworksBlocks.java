package com.teamabnormals.clayworks.core.registry;

import com.ninni.dye_depot.registry.DDBlocks;
import com.ninni.dye_depot.registry.DDDyeKeys;
import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import com.teamabnormals.clayworks.common.block.KilnBlock;
import com.teamabnormals.clayworks.core.Clayworks;
import com.teamabnormals.clayworks.core.ClayworksConfig;
import com.teamabnormals.clayworks.core.registry.helper.ClayworksBlockSubRegistryHelper;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

import static com.ninni.dye_depot.registry.DDDyeKeys.ROSE;
import static net.minecraft.world.item.CreativeModeTabs.*;
import static net.minecraft.world.item.crafting.Ingredient.of;

@EventBusSubscriber(modid = Clayworks.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ClayworksBlocks {
	public static final ClayworksBlockSubRegistryHelper HELPER = Clayworks.REGISTRY_HELPER.getBlockSubHelper();

	public static final RegistryObject<Block> KILN = HELPER.createBlock("kiln", () -> new KilnBlock(ClayworksBlockProperties.KILN));
	public static final RegistryObject<Block> CHISELED_BRICKS = HELPER.createBlock("chiseled_bricks", () -> new Block(ClayworksBlockProperties.BRICKS));
	public static final RegistryObject<Block> GLAZED_TERRACOTTA = HELPER.createBlock("glazed_terracotta", () -> new GlazedTerracottaBlock(ClayworksBlockProperties.GLAZED_TERRACOTTA));

	public static final RegistryObject<Block> TERRACOTTA_STAIRS = HELPER.createBlock("terracotta_stairs", () -> new StairBlock(() -> Blocks.TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = HELPER.createBlock("white_terracotta_stairs", () -> new StairBlock(() -> Blocks.WHITE_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.WHITE_TERRACOTTA));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = HELPER.createBlock("orange_terracotta_stairs", () -> new StairBlock(() -> Blocks.ORANGE_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.ORANGE_TERRACOTTA));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = HELPER.createBlock("magenta_terracotta_stairs", () -> new StairBlock(() -> Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.MAGENTA_TERRACOTTA));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = HELPER.createBlock("yellow_terracotta_stairs", () -> new StairBlock(() -> Blocks.YELLOW_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.YELLOW_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = HELPER.createBlock("light_blue_terracotta_stairs", () -> new StairBlock(() -> Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = HELPER.createBlock("lime_terracotta_stairs", () -> new StairBlock(() -> Blocks.LIME_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.LIME_TERRACOTTA));
	public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = HELPER.createBlock("pink_terracotta_stairs", () -> new StairBlock(() -> Blocks.PINK_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.PINK_TERRACOTTA));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = HELPER.createBlock("gray_terracotta_stairs", () -> new StairBlock(() -> Blocks.GRAY_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.GRAY_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = HELPER.createBlock("light_gray_terracotta_stairs", () -> new StairBlock(() -> Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = HELPER.createBlock("cyan_terracotta_stairs", () -> new StairBlock(() -> Blocks.CYAN_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.CYAN_TERRACOTTA));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = HELPER.createBlock("purple_terracotta_stairs", () -> new StairBlock(() -> Blocks.PURPLE_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.PURPLE_TERRACOTTA));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = HELPER.createBlock("blue_terracotta_stairs", () -> new StairBlock(() -> Blocks.BLUE_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.BLUE_TERRACOTTA));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = HELPER.createBlock("brown_terracotta_stairs", () -> new StairBlock(() -> Blocks.BROWN_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.BROWN_TERRACOTTA));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = HELPER.createBlock("green_terracotta_stairs", () -> new StairBlock(() -> Blocks.GREEN_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.GREEN_TERRACOTTA));
	public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = HELPER.createBlock("red_terracotta_stairs", () -> new StairBlock(() -> Blocks.RED_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.RED_TERRACOTTA));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = HELPER.createBlock("black_terracotta_stairs", () -> new StairBlock(() -> Blocks.BLACK_TERRACOTTA.defaultBlockState(), ClayworksBlockProperties.BLACK_TERRACOTTA));
	public static final RegistryObject<Block> ROSE_TERRACOTTA_STAIRS = HELPER.createBlock("rose_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.ROSE_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.ROSE_TERRACOTTA));
	public static final RegistryObject<Block> MAROON_TERRACOTTA_STAIRS = HELPER.createBlock("maroon_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.MAROON_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.MAROON_TERRACOTTA));
	public static final RegistryObject<Block> CORAL_TERRACOTTA_STAIRS = HELPER.createBlock("coral_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.CORAL_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.CORAL_TERRACOTTA));
	public static final RegistryObject<Block> GINGER_TERRACOTTA_STAIRS = HELPER.createBlock("ginger_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.GINGER_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.GINGER_TERRACOTTA));
	public static final RegistryObject<Block> TAN_TERRACOTTA_STAIRS = HELPER.createBlock("tan_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.TAN_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.TAN_TERRACOTTA));
	public static final RegistryObject<Block> BEIGE_TERRACOTTA_STAIRS = HELPER.createBlock("beige_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.BEIGE_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.BEIGE_TERRACOTTA));
	public static final RegistryObject<Block> AMBER_TERRACOTTA_STAIRS = HELPER.createBlock("amber_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.AMBER_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.AMBER_TERRACOTTA));
	public static final RegistryObject<Block> OLIVE_TERRACOTTA_STAIRS = HELPER.createBlock("olive_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.OLIVE_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.OLIVE_TERRACOTTA));
	public static final RegistryObject<Block> FOREST_TERRACOTTA_STAIRS = HELPER.createBlock("forest_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.FOREST_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.FOREST_TERRACOTTA));
	public static final RegistryObject<Block> VERDANT_TERRACOTTA_STAIRS = HELPER.createBlock("verdant_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.VERDANT_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.VERDANT_TERRACOTTA));
	public static final RegistryObject<Block> TEAL_TERRACOTTA_STAIRS = HELPER.createBlock("teal_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.TEAL_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.TEAL_TERRACOTTA));
	public static final RegistryObject<Block> MINT_TERRACOTTA_STAIRS = HELPER.createBlock("mint_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.MINT_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.MINT_TERRACOTTA));
	public static final RegistryObject<Block> AQUA_TERRACOTTA_STAIRS = HELPER.createBlock("aqua_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.AQUA_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.AQUA_TERRACOTTA));
	public static final RegistryObject<Block> SLATE_TERRACOTTA_STAIRS = HELPER.createBlock("slate_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.SLATE_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.SLATE_TERRACOTTA));
	public static final RegistryObject<Block> NAVY_TERRACOTTA_STAIRS = HELPER.createBlock("navy_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.NAVY_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.NAVY_TERRACOTTA));
	public static final RegistryObject<Block> INDIGO_TERRACOTTA_STAIRS = HELPER.createBlock("indigo_terracotta_stairs", () -> new StairBlock(() -> DDBlocks.INDIGO_TERRACOTTA.get().defaultBlockState(), ClayworksBlockProperties.INDIGO_TERRACOTTA));

	public static final RegistryObject<Block> TERRACOTTA_SLAB = HELPER.createBlock("terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = HELPER.createBlock("white_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.WHITE_TERRACOTTA));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = HELPER.createBlock("orange_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.ORANGE_TERRACOTTA));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = HELPER.createBlock("magenta_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.MAGENTA_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = HELPER.createBlock("light_blue_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = HELPER.createBlock("yellow_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.YELLOW_TERRACOTTA));
	public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = HELPER.createBlock("lime_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.LIME_TERRACOTTA));
	public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = HELPER.createBlock("pink_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.PINK_TERRACOTTA));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = HELPER.createBlock("gray_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.GRAY_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = HELPER.createBlock("light_gray_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = HELPER.createBlock("cyan_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.CYAN_TERRACOTTA));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = HELPER.createBlock("purple_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.PURPLE_TERRACOTTA));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = HELPER.createBlock("blue_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.BLUE_TERRACOTTA));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = HELPER.createBlock("brown_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.BROWN_TERRACOTTA));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = HELPER.createBlock("green_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.GREEN_TERRACOTTA));
	public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = HELPER.createBlock("red_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.RED_TERRACOTTA));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = HELPER.createBlock("black_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.BLACK_TERRACOTTA));
	public static final RegistryObject<Block> ROSE_TERRACOTTA_SLAB = HELPER.createBlock("rose_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.ROSE_TERRACOTTA));
	public static final RegistryObject<Block> MAROON_TERRACOTTA_SLAB = HELPER.createBlock("maroon_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.MAROON_TERRACOTTA));
	public static final RegistryObject<Block> CORAL_TERRACOTTA_SLAB = HELPER.createBlock("coral_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.CORAL_TERRACOTTA));
	public static final RegistryObject<Block> GINGER_TERRACOTTA_SLAB = HELPER.createBlock("ginger_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.GINGER_TERRACOTTA));
	public static final RegistryObject<Block> TAN_TERRACOTTA_SLAB = HELPER.createBlock("tan_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.TAN_TERRACOTTA));
	public static final RegistryObject<Block> BEIGE_TERRACOTTA_SLAB = HELPER.createBlock("beige_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.BEIGE_TERRACOTTA));
	public static final RegistryObject<Block> AMBER_TERRACOTTA_SLAB = HELPER.createBlock("amber_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.AMBER_TERRACOTTA));
	public static final RegistryObject<Block> OLIVE_TERRACOTTA_SLAB = HELPER.createBlock("olive_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.OLIVE_TERRACOTTA));
	public static final RegistryObject<Block> FOREST_TERRACOTTA_SLAB = HELPER.createBlock("forest_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.FOREST_TERRACOTTA));
	public static final RegistryObject<Block> VERDANT_TERRACOTTA_SLAB = HELPER.createBlock("verdant_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.VERDANT_TERRACOTTA));
	public static final RegistryObject<Block> TEAL_TERRACOTTA_SLAB = HELPER.createBlock("teal_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.TEAL_TERRACOTTA));
	public static final RegistryObject<Block> MINT_TERRACOTTA_SLAB = HELPER.createBlock("mint_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.MINT_TERRACOTTA));
	public static final RegistryObject<Block> AQUA_TERRACOTTA_SLAB = HELPER.createBlock("aqua_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.AQUA_TERRACOTTA));
	public static final RegistryObject<Block> SLATE_TERRACOTTA_SLAB = HELPER.createBlock("slate_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.SLATE_TERRACOTTA));
	public static final RegistryObject<Block> NAVY_TERRACOTTA_SLAB = HELPER.createBlock("navy_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.NAVY_TERRACOTTA));
	public static final RegistryObject<Block> INDIGO_TERRACOTTA_SLAB = HELPER.createBlock("indigo_terracotta_slab", () -> new SlabBlock(ClayworksBlockProperties.INDIGO_TERRACOTTA));


	public static final RegistryObject<Block> TERRACOTTA_WALL = HELPER.createBlock("terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = HELPER.createBlock("white_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.WHITE_TERRACOTTA));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = HELPER.createBlock("orange_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.ORANGE_TERRACOTTA));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = HELPER.createBlock("magenta_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.MAGENTA_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = HELPER.createBlock("light_blue_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = HELPER.createBlock("yellow_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.YELLOW_TERRACOTTA));
	public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = HELPER.createBlock("lime_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.LIME_TERRACOTTA));
	public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = HELPER.createBlock("pink_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.PINK_TERRACOTTA));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = HELPER.createBlock("gray_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.GRAY_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = HELPER.createBlock("light_gray_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = HELPER.createBlock("cyan_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.CYAN_TERRACOTTA));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = HELPER.createBlock("purple_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.PURPLE_TERRACOTTA));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = HELPER.createBlock("blue_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.BLUE_TERRACOTTA));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = HELPER.createBlock("brown_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.BROWN_TERRACOTTA));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = HELPER.createBlock("green_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.GREEN_TERRACOTTA));
	public static final RegistryObject<Block> RED_TERRACOTTA_WALL = HELPER.createBlock("red_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.RED_TERRACOTTA));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = HELPER.createBlock("black_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.BLACK_TERRACOTTA));
	public static final RegistryObject<Block> ROSE_TERRACOTTA_WALL = HELPER.createBlock("rose_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.ROSE_TERRACOTTA));
	public static final RegistryObject<Block> MAROON_TERRACOTTA_WALL = HELPER.createBlock("maroon_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.MAROON_TERRACOTTA));
	public static final RegistryObject<Block> CORAL_TERRACOTTA_WALL = HELPER.createBlock("coral_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.CORAL_TERRACOTTA));
	public static final RegistryObject<Block> GINGER_TERRACOTTA_WALL = HELPER.createBlock("ginger_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.GINGER_TERRACOTTA));
	public static final RegistryObject<Block> TAN_TERRACOTTA_WALL = HELPER.createBlock("tan_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.TAN_TERRACOTTA));
	public static final RegistryObject<Block> BEIGE_TERRACOTTA_WALL = HELPER.createBlock("beige_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.BEIGE_TERRACOTTA));
	public static final RegistryObject<Block> AMBER_TERRACOTTA_WALL = HELPER.createBlock("amber_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.AMBER_TERRACOTTA));
	public static final RegistryObject<Block> OLIVE_TERRACOTTA_WALL = HELPER.createBlock("olive_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.OLIVE_TERRACOTTA));
	public static final RegistryObject<Block> FOREST_TERRACOTTA_WALL = HELPER.createBlock("forest_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.FOREST_TERRACOTTA));
	public static final RegistryObject<Block> VERDANT_TERRACOTTA_WALL = HELPER.createBlock("verdant_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.VERDANT_TERRACOTTA));
	public static final RegistryObject<Block> TEAL_TERRACOTTA_WALL = HELPER.createBlock("teal_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.TEAL_TERRACOTTA));
	public static final RegistryObject<Block> MINT_TERRACOTTA_WALL = HELPER.createBlock("mint_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.MINT_TERRACOTTA));
	public static final RegistryObject<Block> AQUA_TERRACOTTA_WALL = HELPER.createBlock("aqua_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.AQUA_TERRACOTTA));
	public static final RegistryObject<Block> SLATE_TERRACOTTA_WALL = HELPER.createBlock("slate_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.SLATE_TERRACOTTA));
	public static final RegistryObject<Block> NAVY_TERRACOTTA_WALL = HELPER.createBlock("navy_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.NAVY_TERRACOTTA));
	public static final RegistryObject<Block> INDIGO_TERRACOTTA_WALL = HELPER.createBlock("indigo_terracotta_wall", () -> new WallBlock(ClayworksBlockProperties.INDIGO_TERRACOTTA));

	public static final RegistryObject<Block> TERRACOTTA_BRICKS = HELPER.createBlock("terracotta_bricks", () -> new Block(ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = HELPER.createBlock("white_terracotta_bricks", () -> new Block(ClayworksBlockProperties.WHITE_TERRACOTTA));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = HELPER.createBlock("orange_terracotta_bricks", () -> new Block(ClayworksBlockProperties.ORANGE_TERRACOTTA));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = HELPER.createBlock("magenta_terracotta_bricks", () -> new Block(ClayworksBlockProperties.MAGENTA_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = HELPER.createBlock("light_blue_terracotta_bricks", () -> new Block(ClayworksBlockProperties.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = HELPER.createBlock("yellow_terracotta_bricks", () -> new Block(ClayworksBlockProperties.YELLOW_TERRACOTTA));
	public static final RegistryObject<Block> LIME_TERRACOTTA_BRICKS = HELPER.createBlock("lime_terracotta_bricks", () -> new Block(ClayworksBlockProperties.LIME_TERRACOTTA));
	public static final RegistryObject<Block> PINK_TERRACOTTA_BRICKS = HELPER.createBlock("pink_terracotta_bricks", () -> new Block(ClayworksBlockProperties.PINK_TERRACOTTA));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = HELPER.createBlock("gray_terracotta_bricks", () -> new Block(ClayworksBlockProperties.GRAY_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = HELPER.createBlock("light_gray_terracotta_bricks", () -> new Block(ClayworksBlockProperties.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = HELPER.createBlock("cyan_terracotta_bricks", () -> new Block(ClayworksBlockProperties.CYAN_TERRACOTTA));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = HELPER.createBlock("purple_terracotta_bricks", () -> new Block(ClayworksBlockProperties.PURPLE_TERRACOTTA));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = HELPER.createBlock("blue_terracotta_bricks", () -> new Block(ClayworksBlockProperties.BLUE_TERRACOTTA));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = HELPER.createBlock("brown_terracotta_bricks", () -> new Block(ClayworksBlockProperties.BROWN_TERRACOTTA));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = HELPER.createBlock("green_terracotta_bricks", () -> new Block(ClayworksBlockProperties.GREEN_TERRACOTTA));
	public static final RegistryObject<Block> RED_TERRACOTTA_BRICKS = HELPER.createBlock("red_terracotta_bricks", () -> new Block(ClayworksBlockProperties.RED_TERRACOTTA));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = HELPER.createBlock("black_terracotta_bricks", () -> new Block(ClayworksBlockProperties.BLACK_TERRACOTTA));
	public static final RegistryObject<Block> ROSE_TERRACOTTA_BRICKS = HELPER.createBlock("rose_terracotta_bricks", () -> new Block(ClayworksBlockProperties.ROSE_TERRACOTTA));
	public static final RegistryObject<Block> MAROON_TERRACOTTA_BRICKS = HELPER.createBlock("maroon_terracotta_bricks", () -> new Block(ClayworksBlockProperties.MAROON_TERRACOTTA));
	public static final RegistryObject<Block> CORAL_TERRACOTTA_BRICKS = HELPER.createBlock("coral_terracotta_bricks", () -> new Block(ClayworksBlockProperties.CORAL_TERRACOTTA));
	public static final RegistryObject<Block> GINGER_TERRACOTTA_BRICKS = HELPER.createBlock("ginger_terracotta_bricks", () -> new Block(ClayworksBlockProperties.GINGER_TERRACOTTA));
	public static final RegistryObject<Block> TAN_TERRACOTTA_BRICKS = HELPER.createBlock("tan_terracotta_bricks", () -> new Block(ClayworksBlockProperties.TAN_TERRACOTTA));
	public static final RegistryObject<Block> BEIGE_TERRACOTTA_BRICKS = HELPER.createBlock("beige_terracotta_bricks", () -> new Block(ClayworksBlockProperties.BEIGE_TERRACOTTA));
	public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICKS = HELPER.createBlock("amber_terracotta_bricks", () -> new Block(ClayworksBlockProperties.AMBER_TERRACOTTA));
	public static final RegistryObject<Block> OLIVE_TERRACOTTA_BRICKS = HELPER.createBlock("olive_terracotta_bricks", () -> new Block(ClayworksBlockProperties.OLIVE_TERRACOTTA));
	public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICKS = HELPER.createBlock("forest_terracotta_bricks", () -> new Block(ClayworksBlockProperties.FOREST_TERRACOTTA));
	public static final RegistryObject<Block> VERDANT_TERRACOTTA_BRICKS = HELPER.createBlock("verdant_terracotta_bricks", () -> new Block(ClayworksBlockProperties.VERDANT_TERRACOTTA));
	public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICKS = HELPER.createBlock("teal_terracotta_bricks", () -> new Block(ClayworksBlockProperties.TEAL_TERRACOTTA));
	public static final RegistryObject<Block> MINT_TERRACOTTA_BRICKS = HELPER.createBlock("mint_terracotta_bricks", () -> new Block(ClayworksBlockProperties.MINT_TERRACOTTA));
	public static final RegistryObject<Block> AQUA_TERRACOTTA_BRICKS = HELPER.createBlock("aqua_terracotta_bricks", () -> new Block(ClayworksBlockProperties.AQUA_TERRACOTTA));
	public static final RegistryObject<Block> SLATE_TERRACOTTA_BRICKS = HELPER.createBlock("slate_terracotta_bricks", () -> new Block(ClayworksBlockProperties.SLATE_TERRACOTTA));
	public static final RegistryObject<Block> NAVY_TERRACOTTA_BRICKS = HELPER.createBlock("navy_terracotta_bricks", () -> new Block(ClayworksBlockProperties.NAVY_TERRACOTTA));
	public static final RegistryObject<Block> INDIGO_TERRACOTTA_BRICKS = HELPER.createBlock("indigo_terracotta_bricks", () -> new Block(ClayworksBlockProperties.INDIGO_TERRACOTTA));

	public static final RegistryObject<Block> TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("terracotta_brick_stairs", () -> new StairBlock(() -> TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("white_terracotta_brick_stairs", () -> new StairBlock(() -> WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.WHITE_TERRACOTTA));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("orange_terracotta_brick_stairs", () -> new StairBlock(() -> ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.ORANGE_TERRACOTTA));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("magenta_terracotta_brick_stairs", () -> new StairBlock(() -> MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.MAGENTA_TERRACOTTA));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("yellow_terracotta_brick_stairs", () -> new StairBlock(() -> YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.YELLOW_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("light_blue_terracotta_brick_stairs", () -> new StairBlock(() -> LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("lime_terracotta_brick_stairs", () -> new StairBlock(() -> LIME_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.LIME_TERRACOTTA));
	public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("pink_terracotta_brick_stairs", () -> new StairBlock(() -> PINK_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.PINK_TERRACOTTA));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("gray_terracotta_brick_stairs", () -> new StairBlock(() -> GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.GRAY_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("light_gray_terracotta_brick_stairs", () -> new StairBlock(() -> LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("cyan_terracotta_brick_stairs", () -> new StairBlock(() -> CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.CYAN_TERRACOTTA));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("purple_terracotta_brick_stairs", () -> new StairBlock(() -> PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.PURPLE_TERRACOTTA));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("blue_terracotta_brick_stairs", () -> new StairBlock(() -> BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.BLUE_TERRACOTTA));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("brown_terracotta_brick_stairs", () -> new StairBlock(() -> BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.BROWN_TERRACOTTA));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("green_terracotta_brick_stairs", () -> new StairBlock(() -> GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.GREEN_TERRACOTTA));
	public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("red_terracotta_brick_stairs", () -> new StairBlock(() -> RED_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.RED_TERRACOTTA));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("black_terracotta_brick_stairs", () -> new StairBlock(() -> BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.BLACK_TERRACOTTA));
	public static final RegistryObject<Block> ROSE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("rose_terracotta_brick_stairs", () -> new StairBlock(() -> ROSE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.ROSE_TERRACOTTA));
	public static final RegistryObject<Block> MAROON_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("maroon_terracotta_brick_stairs", () -> new StairBlock(() -> MAROON_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.MAROON_TERRACOTTA));
	public static final RegistryObject<Block> CORAL_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("coral_terracotta_brick_stairs", () -> new StairBlock(() -> CORAL_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.CORAL_TERRACOTTA));
	public static final RegistryObject<Block> GINGER_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("ginger_terracotta_brick_stairs", () -> new StairBlock(() -> GINGER_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.GINGER_TERRACOTTA));
	public static final RegistryObject<Block> TAN_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("tan_terracotta_brick_stairs", () -> new StairBlock(() -> TAN_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.TAN_TERRACOTTA));
	public static final RegistryObject<Block> BEIGE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("beige_terracotta_brick_stairs", () -> new StairBlock(() -> BEIGE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.BEIGE_TERRACOTTA));
	public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("amber_terracotta_brick_stairs", () -> new StairBlock(() -> AMBER_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.AMBER_TERRACOTTA));
	public static final RegistryObject<Block> OLIVE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("olive_terracotta_brick_stairs", () -> new StairBlock(() -> OLIVE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.OLIVE_TERRACOTTA));
	public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("forest_terracotta_brick_stairs", () -> new StairBlock(() -> FOREST_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.FOREST_TERRACOTTA));
	public static final RegistryObject<Block> VERDANT_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("verdant_terracotta_brick_stairs", () -> new StairBlock(() -> VERDANT_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.VERDANT_TERRACOTTA));
	public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("teal_terracotta_brick_stairs", () -> new StairBlock(() -> TEAL_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.TEAL_TERRACOTTA));
	public static final RegistryObject<Block> MINT_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("mint_terracotta_brick_stairs", () -> new StairBlock(() -> MINT_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.MINT_TERRACOTTA));
	public static final RegistryObject<Block> AQUA_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("aqua_terracotta_brick_stairs", () -> new StairBlock(() -> AQUA_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.AQUA_TERRACOTTA));
	public static final RegistryObject<Block> SLATE_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("slate_terracotta_brick_stairs", () -> new StairBlock(() -> SLATE_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.SLATE_TERRACOTTA));
	public static final RegistryObject<Block> NAVY_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("navy_terracotta_brick_stairs", () -> new StairBlock(() -> NAVY_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.NAVY_TERRACOTTA));
	public static final RegistryObject<Block> INDIGO_TERRACOTTA_BRICK_STAIRS = HELPER.createBlock("indigo_terracotta_brick_stairs", () -> new StairBlock(() -> INDIGO_TERRACOTTA_BRICKS.get().defaultBlockState(), ClayworksBlockProperties.INDIGO_TERRACOTTA));

	public static final RegistryObject<Block> TERRACOTTA_BRICK_SLAB = HELPER.createBlock("terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("white_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.WHITE_TERRACOTTA));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("orange_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.ORANGE_TERRACOTTA));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("magenta_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.MAGENTA_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("light_blue_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("yellow_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.YELLOW_TERRACOTTA));
	public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("lime_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.LIME_TERRACOTTA));
	public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("pink_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.PINK_TERRACOTTA));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("gray_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.GRAY_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("light_gray_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("cyan_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.CYAN_TERRACOTTA));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("purple_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.PURPLE_TERRACOTTA));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("blue_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.BLUE_TERRACOTTA));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("brown_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.BROWN_TERRACOTTA));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("green_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.GREEN_TERRACOTTA));
	public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("red_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.RED_TERRACOTTA));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("black_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.BLACK_TERRACOTTA));
	public static final RegistryObject<Block> ROSE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("rose_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.ROSE_TERRACOTTA));
	public static final RegistryObject<Block> MAROON_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("maroon_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.MAROON_TERRACOTTA));
	public static final RegistryObject<Block> CORAL_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("coral_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.CORAL_TERRACOTTA));
	public static final RegistryObject<Block> GINGER_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("ginger_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.GINGER_TERRACOTTA));
	public static final RegistryObject<Block> TAN_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("tan_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.TAN_TERRACOTTA));
	public static final RegistryObject<Block> BEIGE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("beige_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.BEIGE_TERRACOTTA));
	public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("amber_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.AMBER_TERRACOTTA));
	public static final RegistryObject<Block> OLIVE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("olive_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.OLIVE_TERRACOTTA));
	public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("forest_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.FOREST_TERRACOTTA));
	public static final RegistryObject<Block> VERDANT_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("verdant_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.VERDANT_TERRACOTTA));
	public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("teal_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.TEAL_TERRACOTTA));
	public static final RegistryObject<Block> MINT_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("mint_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.MINT_TERRACOTTA));
	public static final RegistryObject<Block> AQUA_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("aqua_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.AQUA_TERRACOTTA));
	public static final RegistryObject<Block> SLATE_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("slate_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.SLATE_TERRACOTTA));
	public static final RegistryObject<Block> NAVY_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("navy_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.NAVY_TERRACOTTA));
	public static final RegistryObject<Block> INDIGO_TERRACOTTA_BRICK_SLAB = HELPER.createBlock("indigo_terracotta_brick_slab", () -> new SlabBlock(ClayworksBlockProperties.INDIGO_TERRACOTTA));

	public static final RegistryObject<Block> TERRACOTTA_BRICK_WALL = HELPER.createBlock("terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("white_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.WHITE_TERRACOTTA));
	public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("orange_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.ORANGE_TERRACOTTA));
	public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_WALL = HELPER.createBlock("magenta_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.MAGENTA_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("light_blue_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_WALL = HELPER.createBlock("yellow_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.YELLOW_TERRACOTTA));
	public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_WALL = HELPER.createBlock("lime_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.LIME_TERRACOTTA));
	public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_WALL = HELPER.createBlock("pink_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.PINK_TERRACOTTA));
	public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_WALL = HELPER.createBlock("gray_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.GRAY_TERRACOTTA));
	public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_WALL = HELPER.createBlock("light_gray_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_WALL = HELPER.createBlock("cyan_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.CYAN_TERRACOTTA));
	public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("purple_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.PURPLE_TERRACOTTA));
	public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("blue_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.BLUE_TERRACOTTA));
	public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_WALL = HELPER.createBlock("brown_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.BROWN_TERRACOTTA));
	public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_WALL = HELPER.createBlock("green_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.GREEN_TERRACOTTA));
	public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_WALL = HELPER.createBlock("red_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.RED_TERRACOTTA));
	public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_WALL = HELPER.createBlock("black_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.BLACK_TERRACOTTA));
	public static final RegistryObject<Block> ROSE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("rose_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.ROSE_TERRACOTTA));
	public static final RegistryObject<Block> MAROON_TERRACOTTA_BRICK_WALL = HELPER.createBlock("maroon_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.MAROON_TERRACOTTA));
	public static final RegistryObject<Block> CORAL_TERRACOTTA_BRICK_WALL = HELPER.createBlock("coral_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.CORAL_TERRACOTTA));
	public static final RegistryObject<Block> GINGER_TERRACOTTA_BRICK_WALL = HELPER.createBlock("ginger_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.GINGER_TERRACOTTA));
	public static final RegistryObject<Block> TAN_TERRACOTTA_BRICK_WALL = HELPER.createBlock("tan_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.TAN_TERRACOTTA));
	public static final RegistryObject<Block> BEIGE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("beige_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.BEIGE_TERRACOTTA));
	public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICK_WALL = HELPER.createBlock("amber_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.AMBER_TERRACOTTA));
	public static final RegistryObject<Block> OLIVE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("olive_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.OLIVE_TERRACOTTA));
	public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICK_WALL = HELPER.createBlock("forest_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.FOREST_TERRACOTTA));
	public static final RegistryObject<Block> VERDANT_TERRACOTTA_BRICK_WALL = HELPER.createBlock("verdant_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.VERDANT_TERRACOTTA));
	public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICK_WALL = HELPER.createBlock("teal_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.TEAL_TERRACOTTA));
	public static final RegistryObject<Block> MINT_TERRACOTTA_BRICK_WALL = HELPER.createBlock("mint_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.MINT_TERRACOTTA));
	public static final RegistryObject<Block> AQUA_TERRACOTTA_BRICK_WALL = HELPER.createBlock("aqua_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.AQUA_TERRACOTTA));
	public static final RegistryObject<Block> SLATE_TERRACOTTA_BRICK_WALL = HELPER.createBlock("slate_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.SLATE_TERRACOTTA));
	public static final RegistryObject<Block> NAVY_TERRACOTTA_BRICK_WALL = HELPER.createBlock("navy_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.NAVY_TERRACOTTA));
	public static final RegistryObject<Block> INDIGO_TERRACOTTA_BRICK_WALL = HELPER.createBlock("indigo_terracotta_brick_wall", () -> new WallBlock(ClayworksBlockProperties.INDIGO_TERRACOTTA));

	public static final RegistryObject<Block> CHISELED_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_terracotta_bricks", () -> new Block(ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_WHITE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_white_terracotta_bricks", () -> new Block(ClayworksBlockProperties.WHITE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_ORANGE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_orange_terracotta_bricks", () -> new Block(ClayworksBlockProperties.ORANGE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_MAGENTA_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_magenta_terracotta_bricks", () -> new Block(ClayworksBlockProperties.MAGENTA_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_LIGHT_BLUE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_light_blue_terracotta_bricks", () -> new Block(ClayworksBlockProperties.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_YELLOW_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_yellow_terracotta_bricks", () -> new Block(ClayworksBlockProperties.YELLOW_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_LIME_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_lime_terracotta_bricks", () -> new Block(ClayworksBlockProperties.LIME_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_PINK_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_pink_terracotta_bricks", () -> new Block(ClayworksBlockProperties.PINK_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_GRAY_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_gray_terracotta_bricks", () -> new Block(ClayworksBlockProperties.GRAY_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_LIGHT_GRAY_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_light_gray_terracotta_bricks", () -> new Block(ClayworksBlockProperties.TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_CYAN_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_cyan_terracotta_bricks", () -> new Block(ClayworksBlockProperties.CYAN_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_PURPLE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_purple_terracotta_bricks", () -> new Block(ClayworksBlockProperties.PURPLE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_BLUE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_blue_terracotta_bricks", () -> new Block(ClayworksBlockProperties.BLUE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_BROWN_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_brown_terracotta_bricks", () -> new Block(ClayworksBlockProperties.BROWN_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_GREEN_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_green_terracotta_bricks", () -> new Block(ClayworksBlockProperties.GREEN_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_RED_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_red_terracotta_bricks", () -> new Block(ClayworksBlockProperties.RED_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_BLACK_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_black_terracotta_bricks", () -> new Block(ClayworksBlockProperties.BLACK_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_ROSE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_rose_terracotta_bricks", () -> new Block(ClayworksBlockProperties.ROSE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_MAROON_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_maroon_terracotta_bricks", () -> new Block(ClayworksBlockProperties.MAROON_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_CORAL_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_coral_terracotta_bricks", () -> new Block(ClayworksBlockProperties.CORAL_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_GINGER_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_ginger_terracotta_bricks", () -> new Block(ClayworksBlockProperties.GINGER_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_TAN_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_tan_terracotta_bricks", () -> new Block(ClayworksBlockProperties.TAN_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_BEIGE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_beige_terracotta_bricks", () -> new Block(ClayworksBlockProperties.BEIGE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_AMBER_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_amber_terracotta_bricks", () -> new Block(ClayworksBlockProperties.AMBER_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_OLIVE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_olive_terracotta_bricks", () -> new Block(ClayworksBlockProperties.OLIVE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_FOREST_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_forest_terracotta_bricks", () -> new Block(ClayworksBlockProperties.FOREST_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_VERDANT_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_verdant_terracotta_bricks", () -> new Block(ClayworksBlockProperties.VERDANT_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_TEAL_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_teal_terracotta_bricks", () -> new Block(ClayworksBlockProperties.TEAL_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_MINT_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_mint_terracotta_bricks", () -> new Block(ClayworksBlockProperties.MINT_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_AQUA_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_aqua_terracotta_bricks", () -> new Block(ClayworksBlockProperties.AQUA_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_SLATE_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_slate_terracotta_bricks", () -> new Block(ClayworksBlockProperties.SLATE_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_NAVY_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_navy_terracotta_bricks", () -> new Block(ClayworksBlockProperties.NAVY_TERRACOTTA));
	public static final RegistryObject<Block> CHISELED_INDIGO_TERRACOTTA_BRICKS = HELPER.createBlock("chiseled_indigo_terracotta_bricks", () -> new Block(ClayworksBlockProperties.INDIGO_TERRACOTTA));

	public static final RegistryObject<Block> WHITE_DECORATED_POT = HELPER.createdDecoratedPotBlock("white_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_WHITE)));
	public static final RegistryObject<Block> ORANGE_DECORATED_POT = HELPER.createdDecoratedPotBlock("orange_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_ORANGE)));
	public static final RegistryObject<Block> MAGENTA_DECORATED_POT = HELPER.createdDecoratedPotBlock("magenta_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_MAGENTA)));
	public static final RegistryObject<Block> LIGHT_BLUE_DECORATED_POT = HELPER.createdDecoratedPotBlock("light_blue_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_LIGHT_BLUE)));
	public static final RegistryObject<Block> YELLOW_DECORATED_POT = HELPER.createdDecoratedPotBlock("yellow_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_YELLOW)));
	public static final RegistryObject<Block> LIME_DECORATED_POT = HELPER.createdDecoratedPotBlock("lime_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_LIGHT_GREEN)));
	public static final RegistryObject<Block> PINK_DECORATED_POT = HELPER.createdDecoratedPotBlock("pink_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_PINK)));
	public static final RegistryObject<Block> GRAY_DECORATED_POT = HELPER.createdDecoratedPotBlock("gray_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_GRAY)));
	public static final RegistryObject<Block> LIGHT_GRAY_DECORATED_POT = HELPER.createdDecoratedPotBlock("light_gray_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_LIGHT_GRAY)));
	public static final RegistryObject<Block> CYAN_DECORATED_POT = HELPER.createdDecoratedPotBlock("cyan_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_CYAN)));
	public static final RegistryObject<Block> PURPLE_DECORATED_POT = HELPER.createdDecoratedPotBlock("purple_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_PURPLE)));
	public static final RegistryObject<Block> BLUE_DECORATED_POT = HELPER.createdDecoratedPotBlock("blue_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_BLUE)));
	public static final RegistryObject<Block> BROWN_DECORATED_POT = HELPER.createdDecoratedPotBlock("brown_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_BROWN)));
	public static final RegistryObject<Block> GREEN_DECORATED_POT = HELPER.createdDecoratedPotBlock("green_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_GREEN)));
	public static final RegistryObject<Block> RED_DECORATED_POT = HELPER.createdDecoratedPotBlock("red_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_RED)));
	public static final RegistryObject<Block> BLACK_DECORATED_POT = HELPER.createdDecoratedPotBlock("black_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(MapColor.TERRACOTTA_BLACK)));
	public static final RegistryObject<Block> ROSE_DECORATED_POT = HELPER.createdDecoratedPotBlock("rose_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(ROSE.getMapColor())));
	public static final RegistryObject<Block> MAROON_DECORATED_POT = HELPER.createdDecoratedPotBlock("maroon_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.MAROON.getMapColor())));
	public static final RegistryObject<Block> CORAL_DECORATED_POT = HELPER.createdDecoratedPotBlock("coral_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.CORAL.getMapColor())));
	public static final RegistryObject<Block> GINGER_DECORATED_POT = HELPER.createdDecoratedPotBlock("ginger_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.GINGER.getMapColor())));
	public static final RegistryObject<Block> TAN_DECORATED_POT = HELPER.createdDecoratedPotBlock("tan_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.TAN.getMapColor())));
	public static final RegistryObject<Block> BEIGE_DECORATED_POT = HELPER.createdDecoratedPotBlock("beige_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.BEIGE.getMapColor())));
	public static final RegistryObject<Block> AMBER_DECORATED_POT = HELPER.createdDecoratedPotBlock("amber_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.AMBER.getMapColor())));
	public static final RegistryObject<Block> OLIVE_DECORATED_POT = HELPER.createdDecoratedPotBlock("olive_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.OLIVE.getMapColor())));
	public static final RegistryObject<Block> FOREST_DECORATED_POT = HELPER.createdDecoratedPotBlock("forest_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.FOREST.getMapColor())));
	public static final RegistryObject<Block> VERDANT_DECORATED_POT = HELPER.createdDecoratedPotBlock("verdant_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.VERDANT.getMapColor())));
	public static final RegistryObject<Block> TEAL_DECORATED_POT = HELPER.createdDecoratedPotBlock("teal_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.TEAL.getMapColor())));
	public static final RegistryObject<Block> MINT_DECORATED_POT = HELPER.createdDecoratedPotBlock("mint_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.MINT.getMapColor())));
	public static final RegistryObject<Block> AQUA_DECORATED_POT = HELPER.createdDecoratedPotBlock("aqua_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.AQUA.getMapColor())));
	public static final RegistryObject<Block> SLATE_DECORATED_POT = HELPER.createdDecoratedPotBlock("slate_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.SLATE.getMapColor())));
	public static final RegistryObject<Block> NAVY_DECORATED_POT = HELPER.createdDecoratedPotBlock("navy_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.NAVY.getMapColor())));
	public static final RegistryObject<Block> INDIGO_DECORATED_POT = HELPER.createdDecoratedPotBlock("indigo_decorated_pot", () -> new DecoratedPotBlock(ClayworksBlockProperties.decoratedPot(DDDyeKeys.INDIGO.getMapColor())));

	@Nullable
	public static DyeColor getDyeColorFromPot(Block block) {
		if (block == WHITE_DECORATED_POT.get()) return DyeColor.WHITE;
		if (block == ORANGE_DECORATED_POT.get()) return DyeColor.ORANGE;
		if (block == MAGENTA_DECORATED_POT.get()) return DyeColor.MAGENTA;
		if (block == LIGHT_BLUE_DECORATED_POT.get()) return DyeColor.LIGHT_BLUE;
		if (block == YELLOW_DECORATED_POT.get()) return DyeColor.YELLOW;
		if (block == LIME_DECORATED_POT.get()) return DyeColor.LIME;
		if (block == PINK_DECORATED_POT.get()) return DyeColor.PINK;
		if (block == GRAY_DECORATED_POT.get()) return DyeColor.GRAY;
		if (block == LIGHT_GRAY_DECORATED_POT.get()) return DyeColor.LIGHT_GRAY;
		if (block == CYAN_DECORATED_POT.get()) return DyeColor.CYAN;
		if (block == PURPLE_DECORATED_POT.get()) return DyeColor.PURPLE;
		if (block == BLUE_DECORATED_POT.get()) return DyeColor.BLUE;
		if (block == BROWN_DECORATED_POT.get()) return DyeColor.BROWN;
		if (block == GREEN_DECORATED_POT.get()) return DyeColor.GREEN;
		if (block == RED_DECORATED_POT.get()) return DyeColor.RED;
		if (block == BLACK_DECORATED_POT.get()) return DyeColor.BLACK;
		if (block == ROSE_DECORATED_POT.get()) return ROSE;
		if (block == MAROON_DECORATED_POT.get()) return DDDyeKeys.MAROON;
		if (block == CORAL_DECORATED_POT.get()) return DDDyeKeys.CORAL;
		if (block == GINGER_DECORATED_POT.get()) return DDDyeKeys.GINGER;
		if (block == TAN_DECORATED_POT.get()) return DDDyeKeys.TAN;
		if (block == BEIGE_DECORATED_POT.get()) return DDDyeKeys.BEIGE;
		if (block == AMBER_DECORATED_POT.get()) return DDDyeKeys.AMBER;
		if (block == OLIVE_DECORATED_POT.get()) return DDDyeKeys.OLIVE;
		if (block == FOREST_DECORATED_POT.get()) return DDDyeKeys.FOREST;
		if (block == VERDANT_DECORATED_POT.get()) return DDDyeKeys.VERDANT;
		if (block == TEAL_DECORATED_POT.get()) return DDDyeKeys.TEAL;
		if (block == MINT_DECORATED_POT.get()) return DDDyeKeys.MINT;
		if (block == AQUA_DECORATED_POT.get()) return DDDyeKeys.AQUA;
		if (block == SLATE_DECORATED_POT.get()) return DDDyeKeys.SLATE;
		if (block == NAVY_DECORATED_POT.get()) return DDDyeKeys.NAVY;
		if (block == INDIGO_DECORATED_POT.get()) return DDDyeKeys.INDIGO;
		return null;
	}

	public static Block getPotFromDyeColor(@Nullable DyeColor color) {
		String name = color.getName();
		return switch (name) {
			case "white" -> WHITE_DECORATED_POT.get();
			case "orange" -> ORANGE_DECORATED_POT.get();
			case "magenta" -> MAGENTA_DECORATED_POT.get();
			case "light_blue" -> LIGHT_BLUE_DECORATED_POT.get();
			case "yellow" -> YELLOW_DECORATED_POT.get();
			case "lime" -> LIME_DECORATED_POT.get();
			case "pink" -> PINK_DECORATED_POT.get();
			case "gray" -> GRAY_DECORATED_POT.get();
			case "light_gray" -> LIGHT_GRAY_DECORATED_POT.get();
			case "cyan" -> CYAN_DECORATED_POT.get();
			case "purple" -> PURPLE_DECORATED_POT.get();
			case "blue" -> BLUE_DECORATED_POT.get();
			case "brown" -> BROWN_DECORATED_POT.get();
			case "green" -> GREEN_DECORATED_POT.get();
			case "red" -> RED_DECORATED_POT.get();
			case "black" -> BLACK_DECORATED_POT.get();
			case "rose" -> ROSE_DECORATED_POT.get();
			case "maroon" -> MAROON_DECORATED_POT.get();
			case "coral" -> CORAL_DECORATED_POT.get();
			case "ginger" -> GINGER_DECORATED_POT.get();
			case "tan" -> TAN_DECORATED_POT.get();
			case "beige" -> BEIGE_DECORATED_POT.get();
			case "amber" -> AMBER_DECORATED_POT.get();
			case "olive" -> OLIVE_DECORATED_POT.get();
			case "forest" -> FOREST_DECORATED_POT.get();
			case "verdant" -> VERDANT_DECORATED_POT.get();
			case "teal" -> TEAL_DECORATED_POT.get();
			case "mint" -> MINT_DECORATED_POT.get();
			case "aqua" -> AQUA_DECORATED_POT.get();
			case "slate" -> SLATE_DECORATED_POT.get();
			case "navy" -> NAVY_DECORATED_POT.get();
			case "indigo" -> INDIGO_DECORATED_POT.get();
			default -> Blocks.DECORATED_POT;
		};
	}

	public static final class ClayworksBlockProperties {
		public static final Block.Properties KILN = Block.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F).lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 13 : 0);
		public static final Block.Properties BRICKS = Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F);
		public static final Block.Properties GLAZED_TERRACOTTA = Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY);

		public static final Block.Properties TERRACOTTA = terracotta(MapColor.COLOR_ORANGE);
		public static final Block.Properties WHITE_TERRACOTTA = terracotta(MapColor.TERRACOTTA_WHITE);
		public static final Block.Properties ORANGE_TERRACOTTA = terracotta(MapColor.TERRACOTTA_ORANGE);
		public static final Block.Properties MAGENTA_TERRACOTTA = terracotta(MapColor.TERRACOTTA_MAGENTA);
		public static final Block.Properties LIGHT_BLUE_TERRACOTTA = terracotta(MapColor.TERRACOTTA_LIGHT_BLUE);
		public static final Block.Properties YELLOW_TERRACOTTA = terracotta(MapColor.TERRACOTTA_YELLOW);
		public static final Block.Properties LIME_TERRACOTTA = terracotta(MapColor.TERRACOTTA_LIGHT_GREEN);
		public static final Block.Properties PINK_TERRACOTTA = terracotta(MapColor.TERRACOTTA_PINK);
		public static final Block.Properties GRAY_TERRACOTTA = terracotta(MapColor.TERRACOTTA_GRAY);
		public static final Block.Properties LIGHT_GRAY_TERRACOTTA = terracotta(MapColor.TERRACOTTA_LIGHT_GRAY);
		public static final Block.Properties CYAN_TERRACOTTA = terracotta(MapColor.TERRACOTTA_CYAN);
		public static final Block.Properties PURPLE_TERRACOTTA = terracotta(MapColor.TERRACOTTA_PURPLE);
		public static final Block.Properties BLUE_TERRACOTTA = terracotta(MapColor.TERRACOTTA_BLUE);
		public static final Block.Properties BROWN_TERRACOTTA = terracotta(MapColor.TERRACOTTA_BROWN);
		public static final Block.Properties GREEN_TERRACOTTA = terracotta(MapColor.TERRACOTTA_GREEN);
		public static final Block.Properties RED_TERRACOTTA = terracotta(MapColor.TERRACOTTA_RED);
		public static final Block.Properties BLACK_TERRACOTTA = terracotta(MapColor.TERRACOTTA_BLACK);
		public static final Block.Properties ROSE_TERRACOTTA = terracotta(ROSE.getMapColor());
		public static final Block.Properties MAROON_TERRACOTTA = terracotta(DDDyeKeys.MAROON.getMapColor());
		public static final Block.Properties CORAL_TERRACOTTA = terracotta(DDDyeKeys.CORAL.getMapColor());
		public static final Block.Properties GINGER_TERRACOTTA = terracotta(DDDyeKeys.GINGER.getMapColor());
		public static final Block.Properties TAN_TERRACOTTA = terracotta(DDDyeKeys.TAN.getMapColor());
		public static final Block.Properties BEIGE_TERRACOTTA = terracotta(DDDyeKeys.BEIGE.getMapColor());
		public static final Block.Properties AMBER_TERRACOTTA = terracotta(DDDyeKeys.AMBER.getMapColor());
		public static final Block.Properties OLIVE_TERRACOTTA = terracotta(DDDyeKeys.OLIVE.getMapColor());
		public static final Block.Properties FOREST_TERRACOTTA = terracotta(DDDyeKeys.FOREST.getMapColor());
		public static final Block.Properties VERDANT_TERRACOTTA = terracotta(DDDyeKeys.VERDANT.getMapColor());
		public static final Block.Properties TEAL_TERRACOTTA = terracotta(DDDyeKeys.TEAL.getMapColor());
		public static final Block.Properties MINT_TERRACOTTA = terracotta(DDDyeKeys.MINT.getMapColor());
		public static final Block.Properties AQUA_TERRACOTTA = terracotta(DDDyeKeys.AQUA.getMapColor());
		public static final Block.Properties SLATE_TERRACOTTA = terracotta(DDDyeKeys.SLATE.getMapColor());
		public static final Block.Properties NAVY_TERRACOTTA = terracotta(DDDyeKeys.NAVY.getMapColor());
		public static final Block.Properties INDIGO_TERRACOTTA = terracotta(DDDyeKeys.INDIGO.getMapColor());


		public static Block.Properties terracotta(MapColor color) {
			return Block.Properties.of().mapColor(color).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F);
		}

		public static Block.Properties decoratedPot(MapColor color) {
			return Block.Properties.of().mapColor(color).strength(0.0F, 0.0F).pushReaction(PushReaction.DESTROY).noOcclusion();
		}
	}

	public static void setupTabEditors() {
		CreativeModeTabContentsPopulator.mod(Clayworks.MOD_ID)
				.predicate(event -> event.getTabKey() == BUILDING_BLOCKS && ClayworksConfig.COMMON.chiseledBricks.get())
				.addItemsAfter(of(Items.BRICK_WALL), CHISELED_BRICKS)
				.predicate(event -> event.getTabKey() == COLORED_BLOCKS && ClayworksConfig.COMMON.terracottaVariants.get())
				.addItemsAfter(of(Items.PINK_TERRACOTTA),
						TERRACOTTA_STAIRS, WHITE_TERRACOTTA_STAIRS, LIGHT_GRAY_TERRACOTTA_STAIRS, GRAY_TERRACOTTA_STAIRS, BLACK_TERRACOTTA_STAIRS, BROWN_TERRACOTTA_STAIRS, RED_TERRACOTTA_STAIRS, ORANGE_TERRACOTTA_STAIRS, YELLOW_TERRACOTTA_STAIRS, LIME_TERRACOTTA_STAIRS, GREEN_TERRACOTTA_STAIRS, CYAN_TERRACOTTA_STAIRS, LIGHT_BLUE_TERRACOTTA_STAIRS, BLUE_TERRACOTTA_STAIRS, PURPLE_TERRACOTTA_STAIRS, MAGENTA_TERRACOTTA_STAIRS, PINK_TERRACOTTA_STAIRS, ROSE_TERRACOTTA_STAIRS, MAROON_TERRACOTTA_STAIRS, CORAL_TERRACOTTA_STAIRS, GINGER_TERRACOTTA_STAIRS, TAN_TERRACOTTA_STAIRS, BEIGE_TERRACOTTA_STAIRS, AMBER_TERRACOTTA_STAIRS, OLIVE_TERRACOTTA_STAIRS, FOREST_TERRACOTTA_STAIRS, VERDANT_TERRACOTTA_STAIRS, TEAL_TERRACOTTA_STAIRS, MINT_TERRACOTTA_STAIRS, AQUA_TERRACOTTA_STAIRS, SLATE_TERRACOTTA_STAIRS, NAVY_TERRACOTTA_STAIRS, INDIGO_TERRACOTTA_STAIRS,
						TERRACOTTA_SLAB, WHITE_TERRACOTTA_SLAB, LIGHT_GRAY_TERRACOTTA_SLAB, GRAY_TERRACOTTA_SLAB, BLACK_TERRACOTTA_SLAB, BROWN_TERRACOTTA_SLAB, RED_TERRACOTTA_SLAB, ORANGE_TERRACOTTA_SLAB, YELLOW_TERRACOTTA_SLAB, LIME_TERRACOTTA_SLAB, GREEN_TERRACOTTA_SLAB, CYAN_TERRACOTTA_SLAB, LIGHT_BLUE_TERRACOTTA_SLAB, BLUE_TERRACOTTA_SLAB, PURPLE_TERRACOTTA_SLAB, MAGENTA_TERRACOTTA_SLAB, PINK_TERRACOTTA_SLAB, ROSE_TERRACOTTA_SLAB, MAROON_TERRACOTTA_SLAB, CORAL_TERRACOTTA_SLAB, GINGER_TERRACOTTA_SLAB, TAN_TERRACOTTA_SLAB, BEIGE_TERRACOTTA_SLAB, AMBER_TERRACOTTA_SLAB, OLIVE_TERRACOTTA_SLAB, FOREST_TERRACOTTA_SLAB, VERDANT_TERRACOTTA_SLAB, TEAL_TERRACOTTA_SLAB, MINT_TERRACOTTA_SLAB, AQUA_TERRACOTTA_SLAB, SLATE_TERRACOTTA_SLAB, NAVY_TERRACOTTA_SLAB, INDIGO_TERRACOTTA_SLAB,
						TERRACOTTA_WALL, WHITE_TERRACOTTA_WALL, LIGHT_GRAY_TERRACOTTA_WALL, GRAY_TERRACOTTA_WALL, BLACK_TERRACOTTA_WALL, BROWN_TERRACOTTA_WALL, RED_TERRACOTTA_WALL, ORANGE_TERRACOTTA_WALL, YELLOW_TERRACOTTA_WALL, LIME_TERRACOTTA_WALL, GREEN_TERRACOTTA_WALL, CYAN_TERRACOTTA_WALL, LIGHT_BLUE_TERRACOTTA_WALL, BLUE_TERRACOTTA_WALL, PURPLE_TERRACOTTA_WALL, MAGENTA_TERRACOTTA_WALL, PINK_TERRACOTTA_WALL, ROSE_TERRACOTTA_WALL, MAROON_TERRACOTTA_WALL, CORAL_TERRACOTTA_WALL, GINGER_TERRACOTTA_WALL, TAN_TERRACOTTA_WALL, BEIGE_TERRACOTTA_WALL, AMBER_TERRACOTTA_WALL, OLIVE_TERRACOTTA_WALL, FOREST_TERRACOTTA_WALL, VERDANT_TERRACOTTA_WALL, TEAL_TERRACOTTA_WALL, MINT_TERRACOTTA_WALL, AQUA_TERRACOTTA_WALL, SLATE_TERRACOTTA_WALL, NAVY_TERRACOTTA_WALL, INDIGO_TERRACOTTA_WALL
				)
				.predicate(event -> event.getTabKey() == COLORED_BLOCKS && ClayworksConfig.COMMON.terracottaBricks.get())
				.addItemsAfter(of(Items.PINK_TERRACOTTA),
						TERRACOTTA_BRICKS, WHITE_TERRACOTTA_BRICKS, LIGHT_GRAY_TERRACOTTA_BRICKS, GRAY_TERRACOTTA_BRICKS, BLACK_TERRACOTTA_BRICKS, BROWN_TERRACOTTA_BRICKS, RED_TERRACOTTA_BRICKS, ORANGE_TERRACOTTA_BRICKS, YELLOW_TERRACOTTA_BRICKS, LIME_TERRACOTTA_BRICKS, GREEN_TERRACOTTA_BRICKS, CYAN_TERRACOTTA_BRICKS, LIGHT_BLUE_TERRACOTTA_BRICKS, BLUE_TERRACOTTA_BRICKS, PURPLE_TERRACOTTA_BRICKS, MAGENTA_TERRACOTTA_BRICKS, PINK_TERRACOTTA_BRICKS, ROSE_TERRACOTTA_BRICKS, MAROON_TERRACOTTA_BRICKS, CORAL_TERRACOTTA_BRICKS, GINGER_TERRACOTTA_BRICKS, TAN_TERRACOTTA_BRICKS, BEIGE_TERRACOTTA_BRICKS, AMBER_TERRACOTTA_BRICKS, OLIVE_TERRACOTTA_BRICKS, FOREST_TERRACOTTA_BRICKS, VERDANT_TERRACOTTA_BRICKS, TEAL_TERRACOTTA_BRICKS, MINT_TERRACOTTA_BRICKS, AQUA_TERRACOTTA_BRICKS, SLATE_TERRACOTTA_BRICKS, NAVY_TERRACOTTA_BRICKS, INDIGO_TERRACOTTA_BRICKS,
						CHISELED_TERRACOTTA_BRICKS, CHISELED_WHITE_TERRACOTTA_BRICKS, CHISELED_LIGHT_GRAY_TERRACOTTA_BRICKS, CHISELED_GRAY_TERRACOTTA_BRICKS, CHISELED_BLACK_TERRACOTTA_BRICKS, CHISELED_BROWN_TERRACOTTA_BRICKS, CHISELED_RED_TERRACOTTA_BRICKS, CHISELED_ORANGE_TERRACOTTA_BRICKS, CHISELED_YELLOW_TERRACOTTA_BRICKS, CHISELED_LIME_TERRACOTTA_BRICKS, CHISELED_GREEN_TERRACOTTA_BRICKS, CHISELED_CYAN_TERRACOTTA_BRICKS, CHISELED_LIGHT_BLUE_TERRACOTTA_BRICKS, CHISELED_BLUE_TERRACOTTA_BRICKS, CHISELED_PURPLE_TERRACOTTA_BRICKS, CHISELED_MAGENTA_TERRACOTTA_BRICKS, CHISELED_PINK_TERRACOTTA_BRICKS, CHISELED_ROSE_TERRACOTTA_BRICKS, CHISELED_MAROON_TERRACOTTA_BRICKS, CHISELED_CORAL_TERRACOTTA_BRICKS, CHISELED_GINGER_TERRACOTTA_BRICKS, CHISELED_TAN_TERRACOTTA_BRICKS, CHISELED_BEIGE_TERRACOTTA_BRICKS, CHISELED_AMBER_TERRACOTTA_BRICKS, CHISELED_OLIVE_TERRACOTTA_BRICKS, CHISELED_FOREST_TERRACOTTA_BRICKS, CHISELED_VERDANT_TERRACOTTA_BRICKS, CHISELED_TEAL_TERRACOTTA_BRICKS, CHISELED_MINT_TERRACOTTA_BRICKS, CHISELED_AQUA_TERRACOTTA_BRICKS, CHISELED_SLATE_TERRACOTTA_BRICKS, CHISELED_NAVY_TERRACOTTA_BRICKS, CHISELED_INDIGO_TERRACOTTA_BRICKS,
						TERRACOTTA_BRICK_STAIRS, WHITE_TERRACOTTA_BRICK_STAIRS, LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, GRAY_TERRACOTTA_BRICK_STAIRS, BLACK_TERRACOTTA_BRICK_STAIRS, BROWN_TERRACOTTA_BRICK_STAIRS, RED_TERRACOTTA_BRICK_STAIRS, ORANGE_TERRACOTTA_BRICK_STAIRS, YELLOW_TERRACOTTA_BRICK_STAIRS, LIME_TERRACOTTA_BRICK_STAIRS, GREEN_TERRACOTTA_BRICK_STAIRS, CYAN_TERRACOTTA_BRICK_STAIRS, LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, BLUE_TERRACOTTA_BRICK_STAIRS, PURPLE_TERRACOTTA_BRICK_STAIRS, MAGENTA_TERRACOTTA_BRICK_STAIRS, PINK_TERRACOTTA_BRICK_STAIRS, ROSE_TERRACOTTA_BRICK_STAIRS, MAROON_TERRACOTTA_BRICK_STAIRS, CORAL_TERRACOTTA_BRICK_STAIRS, GINGER_TERRACOTTA_BRICK_STAIRS, TAN_TERRACOTTA_BRICK_STAIRS, BEIGE_TERRACOTTA_BRICK_STAIRS, AMBER_TERRACOTTA_BRICK_STAIRS, OLIVE_TERRACOTTA_BRICK_STAIRS, FOREST_TERRACOTTA_BRICK_STAIRS, VERDANT_TERRACOTTA_BRICK_STAIRS, TEAL_TERRACOTTA_BRICK_STAIRS, MINT_TERRACOTTA_BRICK_STAIRS, AQUA_TERRACOTTA_BRICK_STAIRS, SLATE_TERRACOTTA_BRICK_STAIRS, NAVY_TERRACOTTA_BRICK_STAIRS, INDIGO_TERRACOTTA_BRICK_STAIRS,
						TERRACOTTA_BRICK_SLAB, WHITE_TERRACOTTA_BRICK_SLAB, LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, GRAY_TERRACOTTA_BRICK_SLAB, BLACK_TERRACOTTA_BRICK_SLAB, BROWN_TERRACOTTA_BRICK_SLAB, RED_TERRACOTTA_BRICK_SLAB, ORANGE_TERRACOTTA_BRICK_SLAB, YELLOW_TERRACOTTA_BRICK_SLAB, LIME_TERRACOTTA_BRICK_SLAB, GREEN_TERRACOTTA_BRICK_SLAB, CYAN_TERRACOTTA_BRICK_SLAB, LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, BLUE_TERRACOTTA_BRICK_SLAB, PURPLE_TERRACOTTA_BRICK_SLAB, MAGENTA_TERRACOTTA_BRICK_SLAB, PINK_TERRACOTTA_BRICK_SLAB, ROSE_TERRACOTTA_BRICK_SLAB, MAROON_TERRACOTTA_BRICK_SLAB, CORAL_TERRACOTTA_BRICK_SLAB, GINGER_TERRACOTTA_BRICK_SLAB, TAN_TERRACOTTA_BRICK_SLAB, BEIGE_TERRACOTTA_BRICK_SLAB, AMBER_TERRACOTTA_BRICK_SLAB, OLIVE_TERRACOTTA_BRICK_SLAB, FOREST_TERRACOTTA_BRICK_SLAB, VERDANT_TERRACOTTA_BRICK_SLAB, TEAL_TERRACOTTA_BRICK_SLAB, MINT_TERRACOTTA_BRICK_SLAB, AQUA_TERRACOTTA_BRICK_SLAB, SLATE_TERRACOTTA_BRICK_SLAB, NAVY_TERRACOTTA_BRICK_SLAB, INDIGO_TERRACOTTA_BRICK_SLAB,
						TERRACOTTA_BRICK_WALL, WHITE_TERRACOTTA_BRICK_WALL, LIGHT_GRAY_TERRACOTTA_BRICK_WALL, GRAY_TERRACOTTA_BRICK_WALL, BLACK_TERRACOTTA_BRICK_WALL, BROWN_TERRACOTTA_BRICK_WALL, RED_TERRACOTTA_BRICK_WALL, ORANGE_TERRACOTTA_BRICK_WALL, YELLOW_TERRACOTTA_BRICK_WALL, LIME_TERRACOTTA_BRICK_WALL, GREEN_TERRACOTTA_BRICK_WALL, CYAN_TERRACOTTA_BRICK_WALL, LIGHT_BLUE_TERRACOTTA_BRICK_WALL, BLUE_TERRACOTTA_BRICK_WALL, PURPLE_TERRACOTTA_BRICK_WALL, MAGENTA_TERRACOTTA_BRICK_WALL, PINK_TERRACOTTA_BRICK_WALL, ROSE_TERRACOTTA_BRICK_WALL, MAROON_TERRACOTTA_BRICK_WALL, CORAL_TERRACOTTA_BRICK_WALL, GINGER_TERRACOTTA_BRICK_WALL, TAN_TERRACOTTA_BRICK_WALL, BEIGE_TERRACOTTA_BRICK_WALL, AMBER_TERRACOTTA_BRICK_WALL, OLIVE_TERRACOTTA_BRICK_WALL, FOREST_TERRACOTTA_BRICK_WALL, VERDANT_TERRACOTTA_BRICK_WALL, TEAL_TERRACOTTA_BRICK_WALL, MINT_TERRACOTTA_BRICK_WALL, AQUA_TERRACOTTA_BRICK_WALL, SLATE_TERRACOTTA_BRICK_WALL, NAVY_TERRACOTTA_BRICK_WALL, INDIGO_TERRACOTTA_BRICK_WALL
				)
				.predicate(event -> event.getTabKey() == COLORED_BLOCKS && ClayworksConfig.COMMON.glazedTerracotta.get())
				.addItemsBefore(of(Items.WHITE_GLAZED_TERRACOTTA), GLAZED_TERRACOTTA)
				.predicate(event -> event.getTabKey() == COLORED_BLOCKS && ClayworksConfig.COMMON.decoratedPotColors.get())
				.addItems(() -> Items.DECORATED_POT, WHITE_DECORATED_POT, LIGHT_GRAY_DECORATED_POT, GRAY_DECORATED_POT, BLACK_DECORATED_POT, BROWN_DECORATED_POT, RED_DECORATED_POT, ORANGE_DECORATED_POT, YELLOW_DECORATED_POT, LIME_DECORATED_POT, GREEN_DECORATED_POT, CYAN_DECORATED_POT, LIGHT_BLUE_DECORATED_POT, BLUE_DECORATED_POT, PURPLE_DECORATED_POT, MAGENTA_DECORATED_POT, PINK_DECORATED_POT, ROSE_DECORATED_POT, MAROON_DECORATED_POT, CORAL_DECORATED_POT, GINGER_DECORATED_POT, TAN_DECORATED_POT, BEIGE_DECORATED_POT, AMBER_DECORATED_POT, OLIVE_DECORATED_POT, FOREST_DECORATED_POT, VERDANT_DECORATED_POT, TEAL_DECORATED_POT, MINT_DECORATED_POT, AQUA_DECORATED_POT, SLATE_DECORATED_POT, NAVY_DECORATED_POT, INDIGO_DECORATED_POT)
				.predicate(event -> event.getTabKey() == FUNCTIONAL_BLOCKS && ClayworksConfig.COMMON.kiln.get())
				.addItemsAfter(of(Items.SMOKER), KILN);
	}
}
