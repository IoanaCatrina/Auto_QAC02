package courses.java.oop1;

public class Pixuri {
    public String culoare;
    public String culoarePasta;
    public String tip;
    public int lungime;
    public int grosime;

    public String scrie() {
        return ("Pixul scrie: " + culoarePasta);
    }

    public void scrie(String text) {
        System.out.println("<" + culoarePasta + ">" + text + "</" + culoarePasta + ">" );
    }
}
