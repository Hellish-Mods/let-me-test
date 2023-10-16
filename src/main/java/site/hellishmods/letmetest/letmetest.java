package site.hellishmods.letmetest;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(letmetest.MOD_ID)
public class letmetest
{
    // Consts and vars
    public static final String MOD_ID = "letmetest";

    public letmetest() {
        MinecraftForge.EVENT_BUS.register(this); // Register mod
    }
}
