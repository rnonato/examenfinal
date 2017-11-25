package Pregunta8;

public class Semaforo
{
    private EstadoSemaforo objEstadoSemaforo;
    // -------------------------------------------
    public Semaforo() {
         this.objEstadoSemaforo = new EstadoVerde();
    }
    // -------------------------------------------
     public void setEstado( EstadoSemaforo objEstadoSemaforo ) {
         this.objEstadoSemaforo = objEstadoSemaforo;
    }
    // -------------------------------------------
     //@Override
     public void mostrar() {
        this.objEstadoSemaforo.mostrar();
    }
}