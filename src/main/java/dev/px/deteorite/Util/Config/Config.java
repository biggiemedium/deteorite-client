package dev.px.deteorite.Util.Config;

import dev.px.deteorite.Deteorite;
import dev.px.deteorite.Util.Interfaces.Util;

import java.io.File;

public class Config implements Util {

    private String name;

    private File mainFile;
    private File subFile;

    public Config(String path, boolean txt) {
        this.mainFile = new File(Deteorite.MODID);
        if(!mainFile.exists()) { mainFile.mkdirs(); }

        //String Sfile = txt ? path + ".txt" : path;

        this.subFile = new File(mainFile + File.separator + path);
        if(!subFile.exists()) { subFile.mkdirs(); }
    }

    public void loads() {

    }

    public void saves() {

    }

    public File getMainFile() {
        return this.mainFile;
    }

    public File getSubFile() {
        return this.subFile;
    }
}
