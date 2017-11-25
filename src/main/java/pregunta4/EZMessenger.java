package pregunta4;

public class EZMessenger implements Messaging {
   // private Implementador implementador;
	@Override
    public void send(String message) {
    	 //implementador.Messaging();
        System.out.println("Message '" + message + "' sent via EZ");
    }
}
