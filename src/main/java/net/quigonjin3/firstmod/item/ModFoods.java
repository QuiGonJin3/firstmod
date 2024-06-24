package net.quigonjin3.firstmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .fast().effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), .1f).build();
}
