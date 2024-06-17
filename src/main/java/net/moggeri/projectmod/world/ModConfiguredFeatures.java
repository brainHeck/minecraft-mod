package net.moggeri.projectmod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.moggeri.projectmod.ProjectMod;
import net.moggeri.projectmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public  static final RegistryKey<ConfiguredFeature<?, ?>> DJANIUM_ORE_KEY = registerKey("djanium_ore");
    public  static final RegistryKey<ConfiguredFeature<?, ?>> SABAN_ORE_KEY = registerKey("saban_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacebles = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldDjaniumOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.DJANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSabanOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.SABAN_ORE.getDefaultState()));

        register(context, DJANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDjaniumOre, 6));
        register(context, SABAN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSabanOre, 8));

    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(ProjectMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
