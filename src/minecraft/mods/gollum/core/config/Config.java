package mods.gollum.core.config;

import mods.gollum.core.mod.GollumMod;


public abstract class Config {
	
	private String fileName;
	
	public Config(GollumMod mod) {
		this(mod.getModid());
	}
	
	public Config(String fileName) {
		this.fileName = fileName;
		
		// Charge la configuration
		ConfigLoader configLoader = new ConfigLoader(this);
		configLoader.loadConfig();
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
}
