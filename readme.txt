
=========================================
=  VS Code - Java - Apache Maven - Git  =
=========================================

A.  Fejlesztői környezet telepítése, beállítása
================================================
1.  Redhat Open JDK letöltése, telepítése:
    https://developers.redhat.com/products/openjdk/download/
2.  Apache Maven letöltése, kicsomagolása (példában: "C:\Program Files")
    https://maven.apache.org/download.cgi
3.  Git for windows telepítése (opcionális, git-hez):
    https://git-for-windows.github.io/
4.  Keresési útvonal (path) bővítése, ha a parancssorból (CMD.EXE)
    kiadott "javac" parancs nem található: 
      1. Vezérlőpult/Rendszer/Speciális rendszerbeállítások/
         Speciális fül/Környezeti változók/Rendszerváltozók/Path-on dupla katt./Új...
      2. "C:\Program Files\RedHat\java-1.8.0-openjdk-1.8.0.151-1\bin"
         hozzáadása (idézőjelek nélkül, telepített verzió szerint)
5.  Keresési útvonal (path) bővítése, ha a parancssorból (CMD.EXE)
    kiadott "mvn -v" parancs nem található: 
      1. Vezérlőpult/Rendszer/Speciális rendszerbeállítások/
         Speciális fül/Környezeti változók/Rendszerváltozók/Path-on dupla katt./Új...
      2. "C:\Program Files\apache-maven-3.5.2\bin"
         hozzáadása (idézőjelek nélkül, telepített verzió szerint)
6.  JAVA_HOME környezeti változó definiálása, ha a parancssorból (CMD.EXE)
    kiadott "echo %JAVA_HOME%" parancs "%JAVA_HOME%"-ot ír ki
      1. Vezérlőpult/Rendszer/Speciális rendszerbeállítások/
         Speciális fül/Környezeti változók/Rendszerváltozók/Új...
      2. Válozó neve: JAVA_HOME
         Változó értéke: "C:\Program Files\RedHat\java-1.8.0-openjdk-1.8.0.151-1"
         hozzáadása (idézőjelek nélkül, telepített verzió szerint)
7.  Visual Studio Code (továbbiakban VSCode) telepítése
    https://code.visualstudio.com/docs/setup/setup-overview
8.  VSCode futtatása, Visual Studio Extensions telepítése: Ctrl-Shift-X
    Kiterjesztés keresése, telepítés:
     - Java Extension Pack (Microsoft)
     - vscode-pfd
9.  Billentyűkombinációk beállítása: 
    File\Preferences\Keyboard Shortcuts menüvel, vagy Ctrl-K majd Ctrl-S
    Parancs keresése: gépeléssel
    Hozzárendelés, módosítás: "ceruza" ikonra kattíntással, törlés: Del bill.
    - gépel: "delete" > parancs: "Delete Line" > hozzárendel: Ctrl-L
    - opcionális: további billentyűkombinációk hozzárendelése tetszés szerint
11. Opcionális: VSCode beállítása: lsd. az oldal végén

B.  Projekt előkészítése (inicializálása)
=========================================
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
6. Első futattási kisérlet: F5-el Select Environment -> Java
   .vscode\launch.json létrejön automatikusan
7. Újra F5, futtatható, tesztelhető a program
8. Első F1-re: Tasks: Run Task (begépeléssel kereshető)
   No task to run found. Configure Tasks ...
   Create tasks.json file from template -> Maven
   .vscode\tasks.json létrejön automatikusan
8. F1: Tasks: Run Task (begépeléssel kereshető)
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
6. Remote repository megadása új terminál ablakból (Ctr-Shift-ö)
   "git remote add origin https://github.com/nitslaszlo/JedlikTsTemplate.git"
   "git push -u origin master"
7. ".gitignore" fájl létrehozása (opcionális):
   Ctrl-N -el új fájl létrehozása
   A fájl tartalma:
   node_modules
   npm-debug.log
   (További mappák és fájlok megadhatóak, melyek nem kerülnek "feltöltésre")
   Ctrl-S -> .gitignore néven menteni a projekt főkönyvtárába
8. Ctrl-Shift-G -> Commit message megadása, majd commit Ctrl-Enter -el
9. Változások szinkronizálása ("feltöltés")
   Alul a státus sorban balra "Synchronize Changes" -ra kattínt

G. VS Code editor beállítása:
==============================
1. Ctrl-Shift-P vagy F1
2. "Preferen..." gépelése
3. Preferences: "Open Workplace Settings" a projektben tárolt beállításokhoz (ez az erősebb) vagy
   Preferences: "Open User Settings" a felasználónált tárolt beállításokhoz
   Konfig fájl workspace: projekt/.vscode/settings.json
   Konfig fájl user: c:/Users/UserName/AppData/Roaming/Code/User/settings.json