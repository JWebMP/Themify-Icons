import com.jwebmp.plugins.themify.icons.implementations.ThemifyIconsInclusionModule;

module com.jwebmp.plugins.themify.icons {

	exports com.jwebmp.plugins.themify.icons;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.themify.icons.ThemifyIconsPageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.themify.icons.implementations.ThemifyIconsExclusionsModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with ThemifyIconsInclusionModule;

	opens com.jwebmp.plugins.themify.icons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
