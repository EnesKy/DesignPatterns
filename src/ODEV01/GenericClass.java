package ODEV01;

public class GenericClass<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T newT) {
        this.t = newT;
    }

    public static <T> boolean isEqual(GenericClass<T> g1, GenericClass<T> g2){
        return g1.get().equals(g2.get());
    }

}
