package homeworks.java.oop1;

public class Library {
    public static void main(String[] args) {

        Author jLindqvist = new Author("John Ajvide Lindqvist", "john.lindqvist@email.com");
        Book lasaMaSaIntru = new Book("Lasa-ma sa intru", 2012, jLindqvist, 32.40);
        System.out.println(lasaMaSaIntru.getDetails());

        Author lGrossman = new Author("Lev Grossman", "lev.gross@email.com");
        Book magicieni = new Book("Magicienii", 2014, lGrossman, 38.70);
        System.out.println(magicieni.getDetails());

        Author dOwens = new Author("Delia Owens", "delia.owens@email.com");
        Book acoloUndeCantaRacii = new Book("Acolo unde canta racii", 2012, dOwens, 21.99);
        System.out.println(acoloUndeCantaRacii.getDetails());

        Author nMachiavelli = new Author("Niccolo Machiavelli", "nick.machiavelli@email.com");
        Book principele = new Book("Principele", 2024, nMachiavelli, 48);
        System.out.println(principele.getDetails());

        Author jojoMoyes = new Author("Jojo Moyes", "jojo.moyes@email.com");
        Book unBarbatSiOFemeie = new Book("Un barbat si o femeie", 2017, jojoMoyes, 28.99);
        System.out.println(unBarbatSiOFemeie.getDetails());

        Author mGodina = new Author("Marian Godina", "marian.godina@email.com");
        Book drumFaraPrioritate = new Book("Drum fara prioritate", 2023, mGodina, 27.80);
        System.out.println(drumFaraPrioritate.getDetails());

        Author dMichie = new Author("David Michie", "david.michie@email.com");
        Book pisica = new Book("Pisica lui Dalai Lama", 2016, dMichie, 12.35);
        System.out.println(pisica.getDetails());
    }
}
