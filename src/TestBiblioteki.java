public class TestBiblioteki {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Drakula", 1897, "Bram Stoker", 428);
        Ksiazka ksiazka2 = new Ksiazka("Frankeshtein", 1818, "Mary Shelley", 320);
        Film film1 = new Film("Zielona Mila", 1999, "Frank Darabont", 189);
        Film film2 = new Film("Shrek", 2001, "Andrew Adamson", 90);

        MediaBiblioteczne[] media = { ksiazka1, ksiazka2, film1, film2 };

        for (int i = 0; i < media.length; i++) {
            media[i].wyswietlInformacje();
        }

        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka1.zwroc();


        ksiazka2.sprawdzLiczbeStron();
        film1.sprawdzCzasTrwania();

    }
}