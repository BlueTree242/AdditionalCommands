package com.bluetree.additionalcommands;
 
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor; 
 

 
 
public class Main extends JavaPlugin {
 

	@Override
	  public void onEnable() {
		  //starts
		  //reloads
		  //plugin reloads
		  this.saveDefaultConfig();
		  this.reloadConfig();
	       new UpdateChecker(this, 12345).getVersion(version -> {
	            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
	                getLogger().info(ChatColor.GREEN + "No new version available.");
	            } else {
	                getLogger().info(ChatColor.GREEN + "A new version is available. Please download as fast as possible!");
	            }
	        });
	 
		  if (getConfig().getBoolean("startup-messages")) {
	        
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		  getLogger().info(ChatColor.GREEN + "Join our discord for support! https://discord.gg/MMMQHA4");
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		  getLogger().info(ChatColor.GREEN + ("Plugin Enabled! Enjoy"));
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
				
			}
	        
	        return;
	        
		  }
		  else; {
		  getLogger().info(ChatColor.RED + "Startup messages is disabled");
		  
		  
		  }
		  

		  
}
	  @Override
	  public void onDisable() {
		  //shutdown
		  //reloads
		  //plugin reloads
		  getLogger().info(ChatColor.RED + "Plugin disabled!");
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  

 
      public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
          if (label.equalsIgnoreCase("additionalcommands")) {
        	  if (sender.hasPermission("additionalcommands.reload")) {
        		  if ((args.length >= 1) && (args[0].equalsIgnoreCase("reload"))) {
                 if (args[0].equalsIgnoreCase("reload")) {
           		  this.saveDefaultConfig();
        		  this.reloadConfig();
                    sender.sendMessage(ChatColor.AQUA + "Plugin reloaded!");
                    return true;
                	  }
                  }
 
 
        	  
 
            else {
        	    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bUsage : &c/additionalcommands reload"));
        	    return true;
        	    
        	    
        	    	
        	    
        	    
            }
        		  
          }
        	  else; {
        		  sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("default-no-permission-message").replace("%plugin_version%", this.getDescription().getVersion()).replace("%player%", sender.getName()).replace("%prefix%", this.getConfig().getString("prefix"))));
        		  getLogger().info(ChatColor.translateAlternateColorCodes('&',"&c" + sender.getName() + " was denied to access the command!"));
        	  }
          }
        	  
        	  
          if (label.equalsIgnoreCase("ac")) {
        	  if (sender.hasPermission("additionalcommands.reload")) {
        		  if ((args.length >= 1) && (args[0].equalsIgnoreCase("reload"))) {
                 if (args[0].equalsIgnoreCase("reload")) {
           		  this.saveDefaultConfig();
        		  this.reloadConfig();
                    sender.sendMessage(ChatColor.AQUA + "Plugin reloaded!");
                    return true;
                	  }
                  }
 
 
        	  
 
            else {
        	    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bUsage : &c/ac reload"));
        	    return true;
        	    
        	    
        	    	
        	    
        	    
            }
        		  
          }
        	  else; {
        		  sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("default-no-permission-message").replace("%plugin_version%", this.getDescription().getVersion()).replace("%player%", sender.getName()).replace("%prefix%", this.getConfig().getString("prefix"))));
        		  getLogger().info(ChatColor.translateAlternateColorCodes('&',"&c" + sender.getName() + " was denied to access the command!"));
        	  }
          }
        	  
        	  
                  
 
      if (label.equalsIgnoreCase("website")) {
    	  if (sender.hasPermission(this.getConfig().getString("website.permission"))) {
    		  sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("website.message").replace("%plugin_version%", this.getDescription().getVersion()).replace("%player%", sender.getName().replace("%prefix%", this.getConfig().getString("prefix")))));
    	  
              return true;
    	  }
    	  else {
    		  sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
    				  this.getConfig().getString("website.no-permission-message").replace("%plugin_version%", this.getDescription().getVersion()).replace("%player%", sender.getName().replace("%prefix%", this.getConfig().getString("prefix")))));
    		  
    	  
    	  }
      }
      
      
                   // removed: return true;
 
                   // removed: return true;
      
 		
               if (label.equalsIgnoreCase("discord")) {
            	   if (sender.hasPermission(this.getConfig().getString("discord.permission"))) {
                   sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                		  this.getConfig().getString("discord.message").replace("%plugin_version%", this.getDescription().getVersion()).replace("%player%", sender.getName().replace("%prefix%", this.getConfig().getString("prefix")))));
                   return true;
            	   }
            	   else; {
            		   sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
             				  this.getConfig().getString("discord.no-permission-message").replace("%plugin_version%", this.getDescription().getVersion()).replace("%player%", sender.getName().replace("%prefix%", this.getConfig().getString("prefix")))));
            		   
            	   }
                   
                   return true;
}
               if (label.equalsIgnoreCase("youtube")) {
            	   if (sender.hasPermission(this.getConfig().getString("youtube.permission"))) {
                   sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                		   this.getConfig().getString("youtube.meessage").replace("%plugin_version%", this.getDescription().getVersion()).replace("%player%", sender.getName().replace("%prefix%", this.getConfig().getString("prefix")))));
                   return true;
            	   }
            	   else; {
            		   sender.sendMessage(ChatColor.translateAlternateColorCodes('&', 
            				   this.getConfig().getString("youtube.no-permission-meessage").replace("%plugin_version%", this.getDescription().getVersion()).replace("%player%", sender.getName())));
            		   
            	   }
                   
                   return true;
               

            	            	   
            	  
            	   
               }
			return false;
      }
      
}



