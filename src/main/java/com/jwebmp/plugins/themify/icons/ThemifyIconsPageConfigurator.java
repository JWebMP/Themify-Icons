package com.jwebmp.plugins.themify.icons;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Page configurator for Themify Icons — registers themify-icons CSS via npm.
 */
@PluginInformation(pluginName = "Themify Icons",
		pluginUniqueName = "themify-icons",
		pluginDescription = "Themify Icons is a complete set of 320+ pixel-perfect, hand-crafted icons inspired by Apple iOS 7. 100% free for personal and commercial use.",
		pluginVersion = "3.4",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "icons, ui",
		pluginSubtitle = "Themify Icons is a complete set of icons for use in web design and apps",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginSourceUrl = "https://themify.me/themify-icons",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginOriginalHomepage = "https://themify.me/themify-icons",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/themify-icons",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "themify-icons",
		pluginModuleName = "com.jwebmp.plugins.themify.icons",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "themify-icons", version = "^0.0.2")
@NgStyleSheet("node_modules/themify-icons/css/themify-icons.css")
public class ThemifyIconsPageConfigurator
		implements IPageConfigurator<ThemifyIconsPageConfigurator>
{
	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
