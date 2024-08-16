package Framework;

public class ALjException extends Exception {

    public ALjException(String e, String clase, String metodo) {
        System.out.println("[ERROR APP --> LOG] " + clase + "." + metodo + " : " + e);
    }

    @Override
    public String getMessage() {
        return "Losiento se presento un error..";
    }
}
