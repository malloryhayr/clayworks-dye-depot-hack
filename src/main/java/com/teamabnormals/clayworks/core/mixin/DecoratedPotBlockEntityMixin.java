package com.teamabnormals.clayworks.core.mixin;

import com.teamabnormals.clayworks.common.block.TrimmedPot;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.DecoratedPotBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;

@Mixin(DecoratedPotBlockEntity.class)
public class DecoratedPotBlockEntityMixin implements TrimmedPot {
	@Unique
	private ResourceLocation clayworks$trim = null;

	@Override
	@Nullable
	public ResourceLocation getTrim() {
		return this.clayworks$trim;
	}

	@Override
	public void setTrim(ResourceLocation name) {
		this.clayworks$trim = name;
	}

	@Inject(method = "saveAdditional", at = @At("TAIL"))
	private void saveAdditional(CompoundTag tag, CallbackInfo ci) {
		if (this.clayworks$trim != null) {
			tag.putString("trim", this.clayworks$trim.toString());
		}
	}

	@Inject(method = "load", at = @At("TAIL"))
	private void load(CompoundTag tag, CallbackInfo ci) {
		if (tag != null && tag.contains("trim")) {
			this.setTrim(new ResourceLocation(tag.getString("trim")));
		} else {
			this.setTrim(null);
		}
	}

	@Inject(method = "setFromItem", at = @At("TAIL"))
	private void setFromItem(ItemStack stack, CallbackInfo ci) {
		CompoundTag tag = BlockItem.getBlockEntityData(stack);
		if (tag != null && tag.contains("trim")) {
			this.setTrim(new ResourceLocation(tag.getString("trim")));
		} else {
			this.setTrim(null);
		}
	}
}
