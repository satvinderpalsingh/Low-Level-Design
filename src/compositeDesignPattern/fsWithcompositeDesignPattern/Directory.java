package compositeDesignPattern.fsWithcompositeDesignPattern;

import java.util.List;

public class Directory implements FileSystem {
    private String name;
    List<FileSystem> files;
    Directory(String name){
        this.name = name;
        this.files=new java.util.ArrayList<>();
    }
    public void ls(){
        System.out.println("name: "+name);
        for(FileSystem file:files){
            file.ls();
            System.out.println("---");
        }
    }

}
