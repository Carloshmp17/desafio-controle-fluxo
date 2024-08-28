public class ParametrosInvalidosException extends Exception{
    
    public ParametrosInvalidosException(){
        super();
    }

    @Override
    public String toString(){
        return "O segundo parametro deve ser maior que o primeiro";
    }
}
