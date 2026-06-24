import java.lang.reflect.*;

class Box<T> {
    public void set(T value) {System.out.println("Value set: " + value);}
    public T get() { return null; }
}

public class GengericsDebug {
    public static void main(String[] args) throws Exception {
        Box<Integer> intBox = new Box<>();
        Box<Integer> rawBox = intBox;
        rawBox.set(123); 
        Method m = Box.class.getMethod("set", Object.class);
        m.invoke(intBox, 12); 
        
    }
}
