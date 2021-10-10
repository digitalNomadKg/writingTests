public class Holder<T> {


    private T myVar;

    public Holder(T myVar) {
        this.myVar = myVar;
    }

    public Holder() {

    }

    public T getMyVar() {
        return myVar;
    }

    public void setMyVar(T myVar) {
        this.myVar = myVar;
    }
}
