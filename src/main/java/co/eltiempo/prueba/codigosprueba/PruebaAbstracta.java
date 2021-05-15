package co.eltiempo.prueba.codigosprueba;

//Clase Abstracta
public abstract class PruebaAbstracta {

    //Metodo a heredar
    protected String nombre;

    //METODO ABSTRACTO
    public abstract void poder();
    //METODO CONCRETO
    public void poderUnico(){
        System.out.println("poder");
    }
}
