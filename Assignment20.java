package package1;

public class Assignment20 {
    public static void main(String[] args) {
        Object marks = 40; // Pattern matching works on Objects

        String result = switch (marks) {
            case Integer i when i >= 75 -> "Distinction Pass";
            case Integer i when i >= 60 -> "First Class Pass";
            case Integer i when i >= 35 -> "Pass";
            default -> "Fail";
        };

        System.out.println(result);
    }
}
