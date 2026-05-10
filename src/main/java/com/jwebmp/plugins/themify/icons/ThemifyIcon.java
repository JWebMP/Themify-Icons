package com.jwebmp.plugins.themify.icons;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;

/**
 * Creates a span that will contain this icon as a class name
 */
public class ThemifyIcon<J extends ThemifyIcon<J>>
		extends Span<IComponentHierarchyBase<?,?>, NoAttributes, J>
	implements IIcon<com.jwebmp.core.base.interfaces.IComponentHierarchyBase<?,?>, J>
{
	private ThemifyIcons icon;
	/**
	 * Creates the span for the given icon
	 *
	 * @param icon
	 * 		The icon to use
	 */
	public ThemifyIcon(ThemifyIcons icon)
	{
		this.icon = icon;
	}

	@Override
	public void preConfigure()
	{
		if(!isConfigured())
		{
			addClass(icon);
		}
		super.preConfigure();
	}

	/**
	 * Creates an empty span with no icon, use the other constructor
	 */
	public ThemifyIcon()
	{
		//No config required
	}

	@Override
	public String getClassName()
	{
		return icon.toString();
	}

	@Override
	public IComponentHierarchyBase<?,?> getIconComponent()
	{
		return this;
	}
}
