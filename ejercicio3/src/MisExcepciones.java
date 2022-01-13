public class MisExcepciones extends Exception{
    private int tipo;

    public MisExcepciones(int tipo) {
        this.tipo = tipo;
    }
    @Override
    public String getMessage(){
        switch (tipo){
            case 1:
                return "";
            default:
                return "";
        }
    }
}
