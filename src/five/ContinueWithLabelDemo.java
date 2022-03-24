package five;

/**
 * Pravimo program koji ce pronaci rijec u nekoj recenici
 *  String recenica = "Pronadji mene ti";
 *  String rijec = "men";
 */
public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "Pronadji mene ti";
        String rijec = "men";
        // Imamo sad pravo baratati sa ovim nizovima ispod jer su oni tema predavanja kombinovano s petljama i sa continue i break
        char[] recenicaNiz = recenica.toCharArray(); //String konvertujemo u niz {P,r,o,n,a,d,j,i...}
        char[] rijecNiz = rijec.toCharArray(); //String konvertujemo u niz {m,e,n}
        int max = recenicaNiz.length - rijecNiz.length;
        boolean foundIt = false;
        NASALabela: for (int i = 0; i < max; i++) {
            for (int j = 0; j < rijecNiz.length; j++) {
                char slovoRecenica = recenicaNiz[i + j];
                char slovoRijec = rijecNiz[j];
                if (slovoRecenica != slovoRijec){
                    continue NASALabela;
                }


            }
            foundIt = true;
            break;

        }

    }
}
