package Pregunta8;


public class EstadoRojo extends EstadoSemaforo
{
   public EstadoRojo() {
   }
   // -------------------------------------------
   @Override
    public void mostrar() {
       System.out.println("Luz roja");
   }
}
