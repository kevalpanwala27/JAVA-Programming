// Code to understand super keyword.
class rectanglee {
    int length;
    int breadth;
    int x = 10;
    rectanglee(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
class cuboidd extends rectanglee {
    int height;
    int x = 20;
    cuboidd(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class word_super {
    public static void main(String[] args) {
        cuboidd c = new cuboidd(5,10,15);
        c.display();
    }
}

// to access the members of a super class, we have to use super keyword.
// to avoid name conflict this keyword is used.