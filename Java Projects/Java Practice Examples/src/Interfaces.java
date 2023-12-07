// interface Banks {
//     float rateOfInterest();
// }

// class RBC implements Banks {
//     public float rateOfInterest() {
//         return 10.5f;
//     }
// }

interface Animating {
    void animate();
}

interface Drawing {
    void draw();
}

public class Interfaces implements Animating, Drawing {

    public void animate() {
        System.out.println("Animating");
    }

    public void draw() {
        System.out.println("Drawing");
    }

    public static void main(String[] args) {
        // Banks money = new RBC();
        // System.out.println("RBCs ROI is: " + money.rateOfInterest());
        Interfaces print = new Interfaces();
        print.animate();
        print.draw();
    }
}
