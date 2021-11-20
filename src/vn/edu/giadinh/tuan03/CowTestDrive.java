package vn.edu.giadinh.tuan03;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow(15);
        System.out.println("wweight: " + cow.weight);

        cow = new Cow(5);
        System.out.println("weigt: " + cow.weight);

        cow = new Cow(25.5, "Bồ Đào Nha", "Đỏ");
        System.out.println(" weight: " + cow.weight + " Breed: " + cow.breed + " color: " + cow.color);
        

    }
}
