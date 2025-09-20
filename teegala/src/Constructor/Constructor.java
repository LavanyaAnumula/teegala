package Constructor;

class sample {
    int a = 1, b = 2, c = 3;

    sample() {
        System.out.println("this is constructor");
    }

    public void show() {
        int volume = a * b * c;
        System.out.println(volume);
    }
}

public class Constructor {
    public static void main(String[] args) {
        sample s = new sample(); 
        s.show();                
    }
}