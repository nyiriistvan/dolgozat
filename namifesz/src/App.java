import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nyiri István,Szoft II N,22-10-24");
        Nyilvantarto nyilvantarto=new Nyilvantarto();
        ArrayList<String> nevlista=nyilvantarto.getNames();
        for (String nev: nevlista){
        System.out.println(nev);
        }

    }
}