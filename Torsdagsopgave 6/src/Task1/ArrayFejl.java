public class ArrayFejl {

    public static void printTreForsteElementer(String[] array) {
        System.out.println("Første element: " + array[0]);
        System.out.println("Andet element: " + array[1]);
        System.out.println("Tredje element: " + array[2]);
    }

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};

        printTreForsteElementer(navne1);
        // task 1.1 navne2 har kun 2 elementer, vi prøver at kalde efter 3
       // printTreForsteElementer(navne2);
        // task 1.2, 1.3, 1,4
        try{
            printTreForsteElementer(navne2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Der er ikke nok elementer i array'et!");
        }
    }
}