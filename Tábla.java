import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Tábla // 1. feladat
{
    private char[][] T; // 2. feladat
    private char ÜresCella; // 2. feladat

    private static Random R = new Random();

    public Tábla(char üresCella) { // 3. feladat
        T = new char[8][8]; // 3.a
        ÜresCella = üresCella; // 3.b
        for (int i = 0; i < 8; i++) // 3.c
        {
            for (int j = 0; j < 8; j++) {
                T[i][j] = ÜresCella; // 3.c
            }
        }
    }

    public void Megjelenít() { // 4. feladat
        for (int sor = 0; sor < 8; sor++) {
            for (int oszlop = 0; oszlop < 8; oszlop++) {
                System.out.print(T[sor][oszlop] + (oszlop == 7 ? "\n" : ""));
            }
        }
    }

    public void Elhelyez(int n) { // 5. feladat
        for (int i = 0; i < n;) {
            int sor = R.nextInt(8);
            int oszlop = R.nextInt(8);
            if (T[sor][oszlop] == ÜresCella) {
                T[sor][oszlop] = 'K';
                i++;
            }
        }
    }

    public boolean ÜresSor(int sorAzon) { // 7. feladat
        for (int oszlop = 0; oszlop < 8; oszlop++) {
            if (T[sorAzon][oszlop] != ÜresCella)
                return false;
        }
        return true;
    }

    public boolean ÜresOszlop(int oszlopAzon) { // 7. feladat
        for (int sor = 0; sor < 8; sor++) {
            if (T[sor][oszlopAzon] != ÜresCella)
                return false;
        }
        return true;
    }

    public int ÜresOszlopokSzáma() { // 8. feladat
        int üresDb = 0;
        for (int oszlop = 0; oszlop < 8; oszlop++) {
            if (ÜresOszlop(oszlop))
                üresDb++;
        }
        return üresDb;
    }

    public int ÜresSorokSzáma() { // 8. feladat
        int üresDb = 0;
        for (int sor = 0; sor < 8; sor++) {
            if (ÜresSor(sor))
                üresDb++;
        }
        return üresDb;
    }

    public void FájlbaÍr(FileWriter writer) { // 10. feladat
        try {
            for (int sor = 0; sor < 8; sor++) {
                for (int oszlop = 0; oszlop < 8; oszlop++) {
                    writer.write(T[sor][oszlop] + (oszlop == 7 ? "\r\n" : ""));
                }
            }
            writer.write("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}