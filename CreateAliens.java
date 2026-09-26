public class CreateAliens {
    public static void main(String[] args) {
        // Instantiate one Martian and one Jupiterian polymorphically
        Alien myMartian = new Martian();
        Alien myJupiterian = new Jupiterian();

        // Display results using toString()
        System.out.println("==========================================");
        System.out.println("            ALIEN PROFILE TEST            ");
        System.out.println("==========================================");
        
        System.out.println("Martian:");
        System.out.println("  " + myMartian.toString());
        System.out.println();

        System.out.println("Jupiterian:");
        System.out.println("  " + myJupiterian.toString());
        System.out.println("==========================================");
    }
}