package dev.atakku.desertsandstorms.fabric;

import dev.atakku.desertsandstorms.DesertSandstorms;
import net.fabricmc.api.ModInitializer;

public class DesertSandstormsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DesertSandstorms.init();
    }
}