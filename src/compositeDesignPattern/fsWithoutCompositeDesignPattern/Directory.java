package compositeDesignPattern.fsWithoutCompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    List<Object> files;
    Directory(String name){
        this.name = name;
        this.files=new ArrayList<>();
    }
    public void ls(){
        System.out.println("name: "+name);
        for(Object file:files){
            if(file instanceof File){
                ((File)file).ls();
            }
            else if(file instanceof Directory){
                ((Directory)file).ls();
            }
            System.out.println("---");
        }
    }

}
