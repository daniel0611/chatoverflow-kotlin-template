# chatoverflow-kotlin-template

This is a template for [ChatOverflow](https://github.com/codeoverflow-org/chatoverflow) plugins written in Kotlin using [my ChatOverflow Gradle plugin](https://github.com/daniel0611/gradle-chatoverflow-plugin).

This project should be considered highly experimental, everything may break at any time and the unofficial way to create Kotlin plugins may also change at every time. With this template you can also only create plugins for **ChatOverflow prealpha 3 or above**.

Kotlin plugins have to be created unofficially using Gradle till a Kotlin compile plugin comptatible with sbt 1 is released. The master branch of [pfn/kotlin-plugin](https://github.com/pfn/kotlin-plugin) has support, but isn't yet available as a release. The owner is already asked to create a release in a [pr](https://github.com/pfn/kotlin-plugin/pull/29). If the owner doesn't get arround to it I may fork the plugin, but I would rather want to wait and let the original owner release it.

### Usage

Here's a simple guide to create your own ChatOverflow Kotlin plugin using this template.

1. Press the green `Use this template` button above and choose a name for your plugin repository.

2. Clone your newly create repository to your computer/laptop.

3. Execute `sbt apiProject/publishM2` inside a local ChatOverflow installation that is on the current `develop` branch. You can use the scripts of the setup repository ([codeoverflow-org/chatoverflow-setup](https://github.com/codeoverflow-org/chatoverflow-setup)) to setup this environment if you called them with the `--dev` flag.

   This step is required till the release of ChatOverflow prealpha 3, because with this release the api will get released to Maven Central.

4. Open the project in your favorite IDE or text editor, I recommend [IntelliJ](https://www.jetbrains.com/idea/) for any JVM related work.

5. Update the values in `settings.gradle` and  `src/main/resources/plugin.xml` with your values accordingly.

6. Run `gradle jar` or use the `Build Plugin` run configuration inside IntelliJ to build the plugin. You have now a built plugin jar inside of `build/libs`. 

7. Copy the jar into the `plugins` directory of any ChatOverflow installation version prealpha 3 / a current prealpha 3 developer installation or newer. Run ChatOverflow and test your plugin.

8. Go and modify the actual plugin source file located at `src/main/kotlin` and start developing your plugin. Use the previous explained way to build and test your plugin. If you want to share your plugin with other people you can just give them your plugin jar, but they also need ChatOverflow prealpha 3 or newer / a current developer version.
