package mindustry.world.blocks.defense;

import arc.math.Mathf;
import mindustry.entities.effect.Lightning;
import mindustry.world.TileData;
import mindustry.graphics.Pal;

public class SurgeWall extends Wall{
    public float lightningChance = 0.05f;
    public float lightningDamage = 15f;
    public int lightningLength = 17;

    public SurgeWall(String name){
        super(name);
    }

    @Override
    public void handleBulletHit(TileData entity, Bullet bullet){
        super.handleBulletHit(entity, bullet);
        if(Mathf.chance(lightningChance)){
            Lightning.create(entity.getTeam(), Pal.surge, lightningDamage, bullet.x, bullet.y, bullet.rot() + 180f, lightningLength);
        }
    }
}
