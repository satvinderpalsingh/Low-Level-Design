package compositeDesignPattern.fsWithcompositeDesignPattern;

public class File implements FileSystem {
    private String name;
    File(String name){
        this.name = name;
    }
    public void ls(){
        System.out.println("name: "+name);
    }

}
