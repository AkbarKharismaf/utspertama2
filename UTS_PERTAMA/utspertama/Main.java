import pengguna.*;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("Akbar Kharisma Fahri", "G.111.19.0048", 8, user);

        System.out.println("Nama Mhs: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());
        System.out.println("Username: " + mhs.getUser().getUsername());
        System.out.println("Password: " + mhs.getUser().getPassword());
    }
}