
class Geeks {
    public static void main(String[] args) {

        
        byte[] nameBytes = {66, 104, 117, 115, 104, 97, 110};
        String name = new String(nameBytes);
        System.out.println("Name from byte array: " + name);

        
        byte[] rollBytes = {50, 52, 49, 48, 48, 51, 48, 51};
        String roll = new String(rollBytes);
        System.out.println("Roll no from byte array: " + roll);

        
        byte[] emailBytes = {
            98, 104, 117, 115, 104, 97, 110, 46, 109, 97, 108, 118, 105, 121, 97,
            46, 99, 115, 50, 56, 64, 105, 105, 108, 109, 46, 101, 100, 117
        };
        String email = new String(emailBytes);
        System.out.println("Email from byte array: " + email);
    }
}
