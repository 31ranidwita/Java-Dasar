public class Main {
    public static void main(String[] args) {
        
        //luas trapesium
        int a = 10;
        int b = 15;
        int tinggi = 8;
        // 1/2*(a+b)*t
        double luastrapesium = 0.5*(a+b)*tinggi;
        System.out.println("===== LUAS TRAPESIUM =====");
        System.out.println("Luas Trapesium" + ":" + luastrapesium );

        // luas layang-layang
        

        //volume kerucut
        tinggi = 10;
        double r = Math.pow(5 , 2);
        double phi = 3.14;
        // 1/3*phi r^2*t
        double volumekerucut = (phi*r*tinggi)/3;
        System.out.println("===== VOLUME KERUCUT =====");
        System.out.println("Volume Kerucut" + ":" + volumekerucut);

    }
}