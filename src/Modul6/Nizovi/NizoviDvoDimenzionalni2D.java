package Modul6.Nizovi;

public class NizoviDvoDimenzionalni2D {
    public static void main(String[] args) {
        int[][] matrix = { // 2D niz se formira kreiranjem dva para uglasnih zagrada [][]
                // ovo je dvodimenzionalni niz koji ima 3 člana tj KOLONE
                {1, 2, 3, 4},  // 0 (KOLONA) član
                {5, 6, 7, 8},  // 1 (KOLONA) član
                {9, 10, 11, 12} // 2 (KOLONA) član
        };
        // Do vrijednosti se iz ovakvog niza se dolazi na sljedeci nacin:
        // Npr izvuci cemo broj 3 iz 1 clana;
        // Prvo se oznacava kolona ako je broj " 3 " u pitanju onda 0 kolona indeks 2

        System.out.println(matrix[0][2]);
        
        // PROLAZAK KROZ DVODIMENZIONALNE NIZOVE
        for (int i = 0; i < matrix.length ; i++) { // Ovom spoljasnjom petljom smo prosli kroz svaku KOLONU
            for (int j = 0; j < matrix[i].length ; j++) { // Ovom unutrasnjom petljom smo prosli kroz
                                                  //svaku od ovih kolona i ispisivali vrijednosti
                System.out.println(matrix[i][j]);
                
            }
            
        }
    }
}
