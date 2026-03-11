public class Main {
    public static void main(String[] args) {
        // Create UF with 10 objects (0 through 9)
        UF uf = new UF(10);

        System.out.println("Initial number of components: " + uf.count());

        // Perform some unions
        System.out.println("\nPerforming unions:");
        uf.union(4, 3);
        System.out.println("union(4,3)");

        uf.union(3, 8);
        System.out.println("union(3,8)");

        uf.union(6, 5);
        System.out.println("union(6,5)");

        uf.union(9, 4);
        System.out.println("union(9,4)");

        uf.union(2, 1);
        System.out.println("union(2,1)");

        // Check connections
        System.out.println("\nChecking connections:");
        System.out.println("connected(0,7): " + uf.connected(0, 7));
        System.out.println("connected(8,9): " + uf.connected(8, 9));

        // More unions
        System.out.println("\nMore unions:");
        uf.union(5, 0);
        System.out.println("union(5,0)");

        uf.union(7, 2);
        System.out.println("union(7,2)");

        uf.union(6, 1);
        System.out.println("union(6,1)");

        uf.union(1, 0);
        System.out.println("union(1,0)");

        // Final check
        System.out.println("\nFinal checks:");
        System.out.println("connected(0,7): " + uf.connected(0, 7));
        System.out.println("Final number of components: " + uf.count());

        // Show all connections
        System.out.println("\nAll objects and their roots:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Object " + i + " is in component with root: " + uf.find(i));
        }
    }
}