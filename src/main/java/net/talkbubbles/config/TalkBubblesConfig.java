package net.talkbubbles.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "talkbubbles")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class TalkBubblesConfig implements ConfigData {

    @Comment("Time in ticks")
    public int chatTime = 200;
    public int maxChatWidth = 180;
    public int chatColor = 1315860;
    public float backgroundOpacity = 0.7F;
    public double chatRange = 30.0D;
}