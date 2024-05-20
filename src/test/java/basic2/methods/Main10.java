package basic2.methods;

public class Main10 {

    public static void main(String[] args) {
        footballWin(2,0,0,5);
    }
    public static void footballWin(int aa, int ab, int ba, int bb) {
        //aa druzyna a  u siebie
        //ab druzyna b na wyjeździe
        //ba druzyna a grajac u wyjeździe
        //bb druzyna b grajac u siebie
//        if (aa < ab)
//            System.out.println("Wygrywa drużyna B na wyjeździe");
//        if ( aa > ab)
//            System.out.println("Wygrywa drużyna A grając u siebie");
//        if (aa == ab)
//            System.out.println("Remis drużyn na boisku drużyny A");
//        if (ba < bb)
//            System.out.println("Wygrywa drużyna B grając u siebie");
//        if (ba > bb)
//            System.out.println("Wygrywa drużyna A grajać na wyjeździe");
//        if (ba == bb)
//            System.out.println("Remis drużyn na boisku drużyny B");
        if ((aa + ba) > (ab + bb)) {
//            System.out.println("Wygrywa drużyna A");
            System.out.println("1");
        } else if ((aa + ba) < (ab + bb)) {
//            System.out.println("Wygrywa drużyna B");
            System.out.println("2");
        } else if (ab < ba) {
//            System.out.println("Wygrywa drużyna A zdobyła większą ilość bramek na wyjeździe");
            System.out.println("1");
        } else if (ab > ba) {
//            System.out.println("Wygrywa drużyna B zdobyła większą ilość bramek na wyjeździe)");
            System.out.println("2");
        } else if (ab == ba) {
//            System.out.println("Remis drużyna A i B");
            System.out.println("X");
        }
    }
}
