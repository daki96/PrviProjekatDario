package Modul7;

public class SoftGreske3Throw {
    public static void main(String[] args) throws Exception {

        // Throw naredba izbacuje u Runtime exception klasu koju mi kreiramo

       try {
           errorMethod();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    static void errorMethod ()throws Exception{
        Exception exc = new Exception("There is an error");
        throw exc;
    }
}
