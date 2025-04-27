package Generics;


interface Printable {
    void print();
}

interface Savable {
    void save();
}

class Document {
    void read() {
        System.out.println("Reading document...");
    }
}
class Report extends  Document implements Printable,Savable{

    @Override
    public void print() {
        System.out.println("Printing the document");
    }

    @Override
    public void save() {
        System.out.println("Saving  the document");
    }
}
public class Processor<T extends  Document & Printable & Savable> {
    T item;

    Processor (T item){
        this.item=item;
    }

    void process() {
        item.read();    // from Document
        item.print();   // from Printable
        item.save();    // from Savable
    }

}
