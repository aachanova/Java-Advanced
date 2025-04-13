package L01_JarOfT;

import java.util.ArrayDeque;

public class Jar {
    private ArrayDeque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(T element){
        this.elements.push(element);
    }
    public T remove(){
        return (T) this.elements.pop();
    }

}
