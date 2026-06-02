# JWebMP Themify Icons

[![Maven Central](https://img.shields.io/maven-central/v/com.jwebmp.plugins/themify-icons)](https://central.sonatype.com/artifact/com.jwebmp.plugins/themify-icons)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue)](https://www.apache.org/licenses/LICENSE-2.0)

![Java 25+](https://img.shields.io/badge/Java-25%2B-green)
![Modular](https://img.shields.io/badge/Modular-JPMS-green)
![Angular](https://img.shields.io/badge/Angular-21-DD0031?logo=angular)

<!-- Tech icons row -->
![Themify Icons](https://img.shields.io/badge/Themify_Icons-3.4-blueviolet)
![JWebMP](https://img.shields.io/badge/JWebMP-2.0-0A7)

320+ pixel-perfect, hand-crafted icons inspired by Apple iOS 7 for JWebMP applications. 100% free for personal and commercial use. CSS web font rendering with `ti-` class prefix.

Built on [Themify Icons](https://themify.me/themify-icons) � [Angular 21](https://angular.dev/) � [JWebMP Core](https://jwebmp.com/) � JPMS module `com.jwebmp.plugins.themify.icons` � Java 25+

**Version: 3.4** � Complete icon set with type-safe Java enum API.

## Installation

```xml
<dependency>
  <groupId>com.jwebmp.plugins</groupId>
  <artifactId>themify-icons</artifactId>
  <version>2.0.3-SNAPSHOT</version>
</dependency>
```

<details>
<summary>Gradle (Kotlin DSL)</summary>

```kotlin
implementation("com.jwebmp.plugins:themify-icons:2.0.0-SNAPSHOT")
```
</details>

## Features

- **320+ Pixel-Perfect Icons** � Hand-crafted, iOS 7-inspired icon set
- **Type-Safe Java Enum API** � `ThemifyIcons` enum with compile-time safety and IDE autocomplete
- **CSS Web Font Rendering** � Lightweight `ti-` prefixed CSS classes
- **CRTP Fluent API** � `ThemifyIcon<J>` component with type-safe method chaining
- **IIcon Interface** � Implements JWebMP's standard icon interface for interoperability
- **Zero Configuration** � Auto-registered via ServiceLoader SPI
- **Modular Architecture** � JPMS module with explicit dependencies
- **Comprehensive Categories** � Arrows, UI, media, text, layout, social/brand icons

## Quick Start

### Prerequisites

- **Java 25 LTS** (required)
- **Maven 3.8+**
- **Node.js 18+** (for frontend builds)
- **Angular 21+** (auto-integrated via JWebMP)

### Basic Usage

```java
import com.jwebmp.plugins.themify.icons.ThemifyIcon;
import com.jwebmp.plugins.themify.icons.ThemifyIcons;

// Create a home icon
var homeIcon = new ThemifyIcon<>(ThemifyIcons.home);

// Arrow icon
var arrow = new ThemifyIcon<>(ThemifyIcons.arrow_right);

// Social icon
var github = new ThemifyIcon<>(ThemifyIcons.github);

// Shopping icon
var cart = new ThemifyIcon<>(ThemifyIcons.shopping_cart);
```

### Icon Categories

```java
// Arrows & Direction
ThemifyIcons.arrow_up, ThemifyIcons.arrow_down, ThemifyIcons.arrow_left, ThemifyIcons.arrow_right
ThemifyIcons.angle_up, ThemifyIcons.angle_down, ThemifyIcons.angle_left, ThemifyIcons.angle_right

// Common UI
ThemifyIcons.home, ThemifyIcons.user, ThemifyIcons.search, ThemifyIcons.settings
ThemifyIcons.email, ThemifyIcons.star, ThemifyIcons.heart, ThemifyIcons.bookmark

// Media Controls
ThemifyIcons.control_play, ThemifyIcons.control_pause, ThemifyIcons.control_stop

// Editing & Design
ThemifyIcons.pencil, ThemifyIcons.brush, ThemifyIcons.palette, ThemifyIcons.eraser

// Devices
ThemifyIcons.desktop, ThemifyIcons.tablet, ThemifyIcons.mobile, ThemifyIcons.server

// Social & Brands
ThemifyIcons.github, ThemifyIcons.facebook, ThemifyIcons.twitter, ThemifyIcons.linkedin
```

---

## Architecture

### Technology Stack

- **Backend**: Java 25 LTS, Maven, GuicedEE (IoC)
- **Frontend**: Angular 21, CSS web fonts
- **Integration**: JWebMP Page Configurators, ServiceLoader SPI
- **Module System**: JPMS with explicit dependencies

### Module Structure

```
src/main/java/com/jwebmp/plugins/themify/icons/
+-- ThemifyIcon.java                    # CRTP icon component (span-based)
+-- ThemifyIcons.java                   # Enum with 320+ icon constants
+-- ThemifyIconsPageConfigurator.java   # Auto-registration via ServiceLoader
+-- implementations/
    +-- ThemifyIconsInclusionModule.java
    +-- ThemifyIconsExclusionsModule.java
```

---

## API Reference

### ThemifyIcon Component

```java
public class ThemifyIcon<J extends ThemifyIcon<J>>
    extends Span<IComponentHierarchyBase<?,?>, NoAttributes, J>
    implements IIcon<IComponentHierarchyBase<?,?>, J>

// Constructors
new ThemifyIcon<>(ThemifyIcons.home)    // Icon from enum
new ThemifyIcon<>()                      // Empty (set icon later)

// Methods
icon.getClassName()      // Returns CSS class string (e.g. "ti-home")
icon.getIconComponent()  // Returns this component as IComponentHierarchyBase
```

### ThemifyIcons Enum

All icons render with the `ti-` CSS class prefix. Underscores become dashes:

```java
ThemifyIcons.arrow_right.toString()   // ? "ti-arrow-right"
ThemifyIcons.shopping_cart.toString()  // ? "ti-shopping-cart"
ThemifyIcons.home.toString()          // ? "ti-home"
```

---

## Configuration

### Auto-Configuration via PageConfigurator

The plugin is automatically configured when present on the classpath. It registers `themify-icons.min.css` on all pages.

### Manual Disable (Optional)

```java
ThemifyIconsPageConfigurator.setEnabled(false);
```

---

## Module Graph

```
com.jwebmp.plugins.themify.icons
 +-- com.jwebmp.core              (JWebMP core)
 +-- com.guicedee.guicedinjection (Guice DI)
```

### Exported Packages

- `com.jwebmp.plugins.themify.icons` � Icon component, enum, and configurator

---

## Testing

```bash
mvn clean test
```

---

## Documentation

- **[Themify Icons](https://themify.me/themify-icons)** � Official icon reference and cheatsheet
- **[JWebMP Home](https://jwebmp.com/)** � JWebMP framework documentation

| File | Purpose |
|------|---------|
| `ThemifyIcon.java` | CRTP icon component |
| `ThemifyIcons.java` | Enum with 320+ icons |
| `ThemifyIconsPageConfigurator.java` | Auto-configuration via ServiceLoader |
| `module-info.java` | JPMS module descriptor |

---

## Security

- No external network calls at runtime
- No secrets or credentials required
- Pure CSS web font icon library
- OWASP Dependency-Check in CI/CD
- GitHub Dependabot enabled

---

## Contributing

1. **Fork** the repository
2. **Create a feature branch** (`git checkout -b feature/my-feature`)
3. **Commit with clear messages** (`git commit -m "feat: add new icon"`)
4. **Push to your fork** (`git push origin feature/my-feature`)
5. **Open a Pull Request**

---

## Project Status

| Aspect | Status |
|--------|--------|
| **Version** | 3.4 / 2.0.0-SNAPSHOT |
| **Icons** | 320+ complete |
| **Java** | 25 LTS (required) |
| **Build** | Passing |
| **License** | Apache 2.0 |
| **Maintenance** | Active |

---

## Links

- **GitHub Repository**: https://github.com/JWebMP/JWebMP
- **Themify Icons**: https://themify.me/themify-icons
- **JWebMP Home**: https://jwebmp.com/

---

## License

Licensed under the [Apache License 2.0](LICENSE).

```
Copyright 2025 JWebMP Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
```

---

## Acknowledgments

- **[Themify](https://themify.me/)** � Original Themify Icons icon set
- **[JWebMP](https://jwebmp.com/)** � Server-driven web framework
- **[Angular](https://angular.dev/)** � Modern web framework

---

## Support

- **GitHub Issues**: https://github.com/JWebMP/JWebMP/issues
- **Discussions**: https://github.com/JWebMP/JWebMP/discussions

---

**Made with JWebMP**
