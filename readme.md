
#  VS Code - Java JDK11 - Git

## Java fejlesztői környezet (JDK) telepítése, beállítása
1.  Redhat Open JDK11 letöltése (pl.: java-11-openjdk-11.0.1.13-1.redhat.windows.x86_64.zip),<br>
    bin, lib, conf, stb. mappák kicsomagolása pl.: C:\Program Files\RedHat\jdk11 mappába<br>
    Kicsomagolható korlátozott felhasználó esetén pl.: C:\Users\felhasználó_neve\AppData\Roaming\jdk11 mappába is<br>
    https://developers.redhat.com/products/openjdk/download/
2.  Git for windows telepítése (opcionális, git-hez):<br>
    https://git-for-windows.github.io/
3.  Visual Studio Code User Installer (továbbiakban VSCode) letöltése, telepítése ("pipálj" ki minden opciót)<br>
    https://code.visualstudio.com/download
4.  VSCode futtatása, kiterjesztések (Extensions) telepítése: Ctrl-Shift-X<br>
    Kötelező és opcionális kiterjesztés keresése, telepítés:
     - Language Support for Java(TM) by Red Hat<br>
       https://marketplace.visualstudio.com/items?itemName=redhat.java
     - Debugger for Java (Microsoft)
     - GitLens — Git supercharged (opcionális git-hez javasolt)<br>
       https://marketplace.visualstudio.com/items?itemName=eamodio.gitlens
    - LaTeX Workshop (opcionális PDF állományok megjelenítésére VSCode-ban, nagyon lassú, de korrekt)<br>
       https://marketplace.visualstudio.com/items?itemName=James-Yu.latex-workshop
5.  Billentyűkombinációk beállítása:<br>
    File\Preferences\Keyboard Shortcuts menüvel, vagy Ctrl-K majd Ctrl-S<br>
    Parancs keresése: gépeléssel<br>
    Hozzárendelés, módosítás: "ceruza" ikonra kattíntással, törlés: Del bill.<br>
    - gépel: "delete" > parancs: "Delete Line" > hozzárendel: Ctrl-L
    - opcionális: további billentyűkombinációk hozzárendelése tetszés szerint
6. Opcionális: VSCode beállítása: lsd. az oldal végén

## Projekt előkészítése (inicializálása)
1. "programNeve" mappa létrehozása
2. VSCode indítása:<br>
    - VSCode indítása után File/Open Folder... menüpontba a "programNeve" mappa megnyitása, vagy
    - "programNeve" mappa helyi menüből: Open with Code
3. Állományok létrehozása, szerkesztése a JedlikJavaTemplate sablon alapján:<br>
    - .vscode\settings.json
    - .vscode\launch.json
4. App.java állomány létrehozása a JedlikJavaTemplate sablon alapján
5. App.java állomány kódolását "UTF-8 with BOM"-ra kell állítani az ékezetes karakterek konzolra írásához (Save with Encoding)
6. App.java állomány bővítése, új osztályok létrehozása külön állományokban
7. F5-el futtatható, tesztelhető a program
    
## Hasznos linkek:
https://code.visualstudio.com/docs<br>
https://code.visualstudio.com/shortcuts/keyboard-shortcuts-windows.pdf<br>
https://git-scm.com/book/en/v2

## Verziókezelés Git-el VS Code-ban (nagyon alap, opcionális):
1. Github account létrehozása:<br>
   https://github.com/<br>
   (nitslaszlo az account név a példában)
2. Git repository létrehozása:<br>
   pl.: GitHub asztali alkalmazással vagy github.com-on<br>
   (JedlikTsTemplate a repository neve a példában)
3. Git konfigurálása Git CMD ablakból:<br>
   git config --global user.name nitslaszlo@gmail.com<br>
   git config --global credential.helper wincred
4. Visual Studio Code indítása - project betöltése
5. Git inicializálása a 3. ("Y") ikonnal vagy Ctrl-Shift-G<br>
   majd "Initialize Repository"-ra kattint (felül)
6. ".gitignore" fájl létrehozása (opcionális):<br>
   Ctrl-N -el új fájl létrehozása<br>
   A fájl tartalma:<br>
   target<br>
   (További mappák és fájlok megadhatóak, melyek nem kerülnek "feltöltésre")<br>
   Ctrl-S -> .gitignore néven menteni a projekt főkönyvtárába
7. Remote repository megadása új terminál ablakból (Ctr-Shift-ö), első feltöltés<br>
   git commit -m "first upload"<br>
   git remote add origin https://github.com/nitslaszlo/JedlikTsTemplate.git<br>
   git push -u origin master
8. Későbbi feltöltések:<br>
   Ctrl-Shift-G -> Commit message megadása, majd commit Ctrl-Enter -el<br>
   Változások szinkronizálása ("feltöltés"): Alul a státus sorban balra "Synchronize Changes" -ra kattínt

## VS Code editor beállítása:
1. Ctrl-Shift-P vagy F1
2. "Pref..." gépelése
3. Preferences: "Open Workplace Settings" a projektben tárolt beállításokhoz (ez az erősebb) vagy<br>
   Preferences: "Open User Settings" a felasználónált tárolt beállításokhoz<br>
   Konfig fájl workspace: projekt/.vscode/settings.json<br>
   Konfig fájl user: c:/Users/UserName/AppData/Roaming/Code/User/settings.json