package NarutoStyleItems;


import NarutoStyleEntitys.EntityFourthHokageKunai;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FourthHokageKunai extends Item {

	public FourthHokageKunai(int par1) {
		super(par1);
		this.setMaxStackSize(8);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.canRepair = false;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        //par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityFourthHokageKunai(par2World, par3EntityPlayer));
        }

        return par1ItemStack;}
	
	 @Override
	 @SideOnly(Side.CLIENT)
	 public void registerIcons(IconRegister iconRegister) {
	          this.itemIcon = iconRegister.registerIcon("narutostyle:FourthHokageKunai");
	 }
}
