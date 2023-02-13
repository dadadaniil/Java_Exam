import com.sun.tools.javac.Main;

public class Loops {

    static int[] someIntArray = {1, 34, 5, 3, 6, 7, 7, 7, 3};

    public static void main(String[] args) {
        doWhile(5);
        ifStatement(true);
        whileLoop(5);
        swticher(40);
        foreachLoop();
        forLoop(5);
    }


    static private void doWhile(int i) {
        System.out.println();
        do {
            System.out.print(i);
            i++;
            //Two previuos statements will be completed at least one time regardless while condition
        } while (i <= 10);
    }

    static private void ifStatement(boolean doNeedToDo) {
        System.out.println();
        //Checking if all statements are true
        if (doNeedToDo) {
            System.out.println("Hello");
        }
    }

    static private void whileLoop(int k) {
        System.out.println();
        while (k < 10) {
            System.out.print(k);
            k++;
        }
    }

    static private void swticher(int k) {
        System.out.println();
        switch (k) {
            case 1:
                System.out.println("Numero uno");
                break;
            case 2:
                System.out.println("Das auto");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("your case doesn't exist");
        }
    }

    static private void forLoop(int k) {
        System.out.println();
        for (int counter = k; counter < k + 5; counter++) {
            System.out.print(counter);
        }
    }

    static private void foreachLoop() {
        System.out.println();
        for (int k :
                someIntArray) {
            System.out.print(k);
        }
    }
}
