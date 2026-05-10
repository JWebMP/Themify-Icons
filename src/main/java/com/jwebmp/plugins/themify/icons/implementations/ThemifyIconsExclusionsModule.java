package com.jwebmp.plugins.themify.icons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class ThemifyIconsExclusionsModule
		implements IGuiceScanModuleExclusions<ThemifyIconsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.themify.icons");
		return strings;
	}
}
