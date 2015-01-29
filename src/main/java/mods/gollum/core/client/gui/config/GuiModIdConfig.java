package mods.gollum.core.client.gui.config;

import java.util.Map.Entry;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import mods.gollum.core.client.gui.config.element.ListElement;
import mods.gollum.core.client.gui.config.entry.ListEntry;

public class GuiModIdConfig extends GuiListConfig {

	public GuiModIdConfig(ListEntry listEntry) {
		super(listEntry);
	}
	
	@Override
	protected void initConfigElement() {

		for (Entry<String, ModContainer> entry : Loader.instance().getIndexedModList().entrySet()) {
			this.configElements.add(new ListElement(entry.getKey(), entry.getValue().getName() + " ("+entry.getKey()+")"));
		}
 	}

}