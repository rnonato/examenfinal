package pregunta5;

public class Client {

    public static void main(String[] args) {
        int objects = 30;
        for (int i = 0; i < objects; i++) {
            Logger loggerUndergraduate = new Logger("pe.edu.unmsm.undergraduate");
            loggerUndergraduate.log("message" + (i + 1), LogType.INFO);
            Logger loggePostgraduate = new Logger("pe.edu.unmsm.postgraduate");
            loggePostgraduate.log("message" + (i + 1), LogType.INFO);
            Logger loggePostgraduate1 = new Logger("pe.edu.unmsm.postgraduate");
            loggePostgraduate1.log("message" + (i + 1), LogType.DEBUG);
            Logger loggePostgraduate2 = new Logger("pe.edu.unmsm.postgraduate");
            loggePostgraduate2.log("message" + (i + 1), LogType.ERROR);
            Logger loggePostgraduate3 = new Logger("pe.edu.unmsm.postgraduate");
            loggePostgraduate3.log("message" + (i + 1), LogType.FAULT);
        }
    }
}
