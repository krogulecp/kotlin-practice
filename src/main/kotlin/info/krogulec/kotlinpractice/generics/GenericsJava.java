package info.krogulec.kotlinpractice.generics;

public class GenericsJava {

    void test(Source<String> input) {
        //final Source<Object> generalised = input;
    }

    void copyAll(MyCollection<Object> to, MyCollection<String> from) {
        //to.addAll(from);
    }


}

interface MyCollection<T> {
    void addAll(MyCollection<T> items);
}

interface Source<T> {
    T nextT();
}
