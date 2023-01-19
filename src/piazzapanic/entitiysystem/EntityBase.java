package piazzapanic.entitiysystem;

import java.io.File;
import java.io.FileNotFoundException;

public abstract class EntityBase {
    protected String name;

    public abstract String getTextureFilePath();
    public abstract String getName();

    public EntityBase(){
        this.name = this.getName();
    }

    public File getTextureFile() throws FileNotFoundException{
        String textureFilePath = this.getTextureFilePath();
        File textureFile = new File(textureFilePath);
        if (textureFile.exists()){
            return textureFile;
        } else{
            throw new FileNotFoundException(textureFilePath);
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}