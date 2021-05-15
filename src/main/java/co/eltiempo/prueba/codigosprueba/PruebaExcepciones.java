package co.eltiempo.prueba.codigosprueba;

public class PruebaExcepciones {

    public void excepcioneste() throws Exception {
        throw(new Exception("ERROR"));
    }

    public void controlExcepciones() throws Exception{
        try{
            System.out.println("No presento error");
        }catch (Exception e){
            System.out.println("Se presento error");
            e.printStackTrace();
        }
    }

}
