package pixelmon.Pokemon;

import pixelmon.entities.EntityGroundPixelmon;
import net.minecraft.src.World;

public class EntityPsyduck  extends EntityGroundPixelmon
{
	
	public EntityPsyduck(World world)
	{
		super(world);
		init();
	}

	public void init()
	{
		name = "Psyduck";
		isImmuneToFire = false;
		super.init();
	}
	
	public void evolve() 
	{		
		
	}
}
