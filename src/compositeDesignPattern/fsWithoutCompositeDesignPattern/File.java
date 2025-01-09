package compositeDesignPattern.fsWithoutCompositeDesignPattern;

public class File {
    private String name;
    File(String name){
        this.name = name;
    }
    public void ls(){
        System.out.println("name: "+name);
    }

}
