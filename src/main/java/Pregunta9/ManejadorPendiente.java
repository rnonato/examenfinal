package Pregunta9;

public class ManejadorPendiente extends Manejador
	{
	    public ManejadorPendiente() {
	    }
	    // --------------------------------------------------
	    @Override
	     public void comprobar(String estado)
	    {
	       if( estado == null )
	       {
	           System.out.println("Solicitud pendiente");
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