package compositeDesignPattern.fsWithcompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        File file = new File("Border");
        File file1 = new File("The Big Lebowski");
        Directory comedyDirectory = new Directory("Comedy");
        comedyDirectory.files.add(file1);
        Directory directory = new Directory("Movies");
        directory.files.add(file);
        directory.files.add(comedyDirectory);
        directory.ls();
    }

}
