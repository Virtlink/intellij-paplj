# PAPLJ in IntelliJ IDEA
An IntelliJ IDEA plugin implementing the PAPLJ language, a simplified Java dialect for teaching Programming And Programming Languages in Java.


## Features
The PAPLJ plugin in IntelliJ has the following features:

- grammar


## Differences
The IntelliJ implementation of PAPLJ differs when compared to the Spoofax implementation. In the IntelliJ implementation:

- the syntax is a bit more permissive


## Build and Run
To build the project and run an IntelliJ instance with PAPLJ:

1. Run the `runIde` task in the root of the project.
   
       ./gradlew runIde

   This will build the project and start an instance of IntelliJ with the plugin loaded.
2. In the new IntelliJ instance, create a new project.
3. In the `src` directory, create a new file ending with the `.pj` extension.


## Editing
To edit this project in IntelliJ IDEA:

1. Install the [Grammar-Kit](https://plugins.jetbrains.com/plugin/6606-grammar-kit) and [PsiViewer](https://plugins.jetbrains.com/plugin/227-psiviewer) plugins.
1. Create a new project _from existing sources_, and select the `settings.gradle` file in the project's root.
2. Open the _Gradle Tasks_ view via _Window_ → _Show view_ → _Other..._ → _Gradle_ → _Gradle Tasks_.
2. Expand the `paplj` project.
3. Double-click the `intellij/runIde` task to launch a new instance of IntelliJ with the language plugin.

The project consists of the following modules:

- `paplj` — The IntelliJ IDEA plugin.

### Changing the Grammar
When changing the BNF grammar, it's occasionally necessary to re-generate the lexer. Compared to the generated lexer, the following changes were made:

- Add `
import static org.metaborg.paplj.psi.PapljTokenElementTypes.*;` import to the top of the lexer.


## See Also
- [Grammar-Kit](https://github.com/JetBrains/Grammar-Kit)
