
#  VS Code - Java JDK11 - Git

## Jáva fejlesztői környezet (JDK) telepítése, beállítása
1.  Redhat Open JDK11 letöltése (pl.: java-11-openjdk-11.0.1.13-1.redhat.windows.x86_64.zip),<br>
    bin, lib, conf, stb. mappák kicsomagolása pl.: C:\Program Files\RedHat\jdk11 mappába<br>
    Kicsomagolható korlátozott felhasználó esetén pl.: C:\Users\felhasználó_neve\AppData\Roaming\jdk11 mappába is<br>
    https://developers.redhat.com/products/openjdk/download/
2.  Git for windows telepítése (opcionális, git-hez):
    https://git-for-windows.github.io/
3.  Visual Studio Code user version (továbbiakban VSCode) letöltése, telepítése<br>
    https://code.visualstudio.com/docs/setup/setup-overview
4.  VSCode futtatása, kiterjesztések (Extensions) telepítése: Ctrl-Shift-X
    Kiterjesztés keresése, telepítés:
     - Language Support for Java(TM) by Red Hat<br>
       https://marketplace.visualstudio.com/items?itemName=redhat.java
     - Debugger for Java (Microsoft)
     - GitLens — Git supercharged<br>
       https://marketplace.visualstudio.com/items?itemName=eamodio.gitlens
5.  Billentyűkombinációk beállítása:<br>
    File\Preferences\Keyboard Shortcuts menüvel, vagy Ctrl-K majd Ctrl-S<br>
    Parancs keresése: gépeléssel<br>
    Hozzárendelés, módosítás: "ceruza" ikonra kattíntással, törlés: Del bill.<br>
    - gépel: "delete" > parancs: "Delete Line" > hozzárendel: Ctrl-L
    - opcionális: további billentyűkombinációk hozzárendelése tetszés szerint
6.. Opcionális: VSCode beállítása: lsd. az oldal végén

## Projekt előkészítése (inicializálása)
1. Parancssor futtatása (CMD.EXE)
2. "CD projektek_szülőmappája" (ide kerül majd a "programNeve" mappa)
3. "JedlikJavaTemplate" név átírása "programNeve"-re (2x), (eu.jedlik is átírható!) majd a parancs futtatása:
   "mvn archetype:generate -DgroupId=eu.jedlik.JedlikJavaTemplate -DartifactId=JedlikJavaTemplate -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false"
   (idézőjelek nélkül)
4. VSCode indítása:
    - utoljára megnyitott projektet visszatölti, majd
    - VSCode indítása után File/Open Folder... menüpontba a "programNeve" mappa megnyitása, vagy
    - "programNeve" mappa helyi menüből: Open with Code
5. UTF-8 kódolás beállítása: pom.xml utolsó (</project>) tag elé:
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
6. Állományok létrehozása, szerkesztése a JedlikJavaTemplate sablon alapján:
    - .vscode\settings.json
    - .gitignore
6. Első futattási kisérlet: F5-el Select Environment -> Java
   .vscode\launch.json létrejön automatikusan
7. External konzol beállítása: 
   launch.json állomány bővítése:
   "console" : "externalTerminal",
8. Újra F5, futtatható, tesztelhető a program
9. Első F1-re: Tasks: Run Task (begépeléssel kereshető)
   No task to run found. Configure Tasks ...
   Create tasks.json file from template -> Maven
   .vscode\tasks.json létrejön automatikusan
10. F1: Tasks: Run Task (begépeléssel kereshető)
    test vagy verify task kiválasztása
    Continue without scanning the task output

C.  Fejlesztés, tesztelés, futtatás
===================================
1.  VSCode indítása (utoljára megnyitott projektet visszatölti), vagy
    Project mappa helyi menüből: Open with Code, vagy
    VSCode indítása után File/Open Folder... menüpontba a project mappa megnyitása
2.  src\main\java\.....\programNeve\App.java szerkesztése
3.  src\main\java\.....\programNeve\ újFájl/osztály létrehozása, szerkesztése
4.  Futtatás, nyomkövetés: F5
5.  Futtatás lefordított JAR fájl-al:
    target mappából:
    java -cp .\JedlikJavaTemplate-1.0-SNAPSHOT.jar eu.jedlik.JedlikJavaTemplate.App
    
D. Verziók lekérdezése terminálablakból:
=========================================
git: git --version
Marven: mvn -v
javac: javac -version
java: java -version

E. Hasznos linkek:
===================
https://code.visualstudio.com/docs
https://code.visualstudio.com/shortcuts/keyboard-shortcuts-windows.pdf
https://git-scm.com/book/en/v2
https://stackoverflow.com/questions/46671308/maven-creating-a-java-project-that-works-in-vs-code

F. Verziókezelés Git-el VS Code-ban (nagyon alap, opcionális):
==============================================================
1. Github account létrehozása:
   https://github.com/
   (nitslaszlo az account név a példában)
2. Git repository létrehozása:
   pl.: GitHub asztali alkalmazással vagy github.com-on
   (JedlikTsTemplate a repository neve a példában)
3. Git konfigurálása Git CMD ablakból:
   git config --global user.name nitslaszlo@gmail.com
   git config --global credential.helper wincred
4. Visual Studio Code indítása - project betöltése
5. Git inicializálása a 3. ("Y") ikonnal vagy Ctrl-Shift-G
   majd "Initialize Repository"-ra kattint (felül)
6. ".gitignore" fájl létrehozása (opcionális):
   Ctrl-N -el új fájl létrehozása
   A fájl tartalma:
   target
   (További mappák és fájlok megadhatóak, melyek nem kerülnek "feltöltésre")
   Ctrl-S -> .gitignore néven menteni a projekt főkönyvtárába
7. Remote repository megadása új terminál ablakból (Ctr-Shift-ö), első feltöltés
   git commit -m "first upload"
   git remote add origin https://github.com/nitslaszlo/JedlikTsTemplate.git
   git push -u origin master
8. Későbbi feltöltések:
   Ctrl-Shift-G -> Commit message megadása, majd commit Ctrl-Enter -el
   Változások szinkronizálása ("feltöltés"): Alul a státus sorban balra "Synchronize Changes" -ra kattínt

G. VS Code editor beállítása:
==============================
1. Ctrl-Shift-P vagy F1
2. "Preferen..." gépelése
3. Preferences: "Open Workplace Settings" a projektben tárolt beállításokhoz (ez az erősebb) vagy
   Preferences: "Open User Settings" a felasználónált tárolt beállításokhoz
   Konfig fájl workspace: projekt/.vscode/settings.json
   Konfig fájl user: c:/Users/UserName/AppData/Roaming/Code/User/settings.json