package piazzapanic.entitiysystem;

import java.io.File;
import java.io.FileNotFoundException;

public abstract class EntityBase {
    public abstract String getTextureFilePath();

    public File getTextureFile() throws FileNotFoundException{
        String textureFilePath = this.getTextureFilePath();
        File textureFile = new File(textureFilePath);
        if (textureFile.exists()){
            return textureFile;
        } else{
            throw new FileNotFoundException(textureFilePath);
        }
    }
}