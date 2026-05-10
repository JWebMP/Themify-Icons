package com.jwebmp.plugins.themify.icons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class ThemifyIconsInclusionModule implements IGuiceScanModuleInclusions<ThemifyIconsInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.themify.icons");
		return set;
	}
}
