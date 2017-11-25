package Pregunta9;

public class ManejadorDenegado extends Manejador
{
    public ManejadorDenegado() {
    }
    // --------------------------------------------------
    @Override
     public void comprobar(String estado)
    {
       if( (estado != null) && (estado.equalsIgnoreCase("DENEGADO") == true) )
       {
           System.out.println("Solicitud denegada");
       }
       else
       {
             if( this.getSiguiente() != null )
            {
                // Llamamos al método en el siguiente objeto
                 this.getSiguiente().comprobar( estado );
            }
       }
    }
}