// Code to understand this keyword.
class rectangle {
    int length;
    int breadth;

    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void display() {
        System.out.println("Length is: " + this.length);
        System.out.println("Breadth is: " + this.breadth);
    }
}
public class word_this {
    public static void main(String[] args) {

    }
}

// this is a reference to present object or current object upon which this method is called.
// to avoid name conflict this keyword is used.