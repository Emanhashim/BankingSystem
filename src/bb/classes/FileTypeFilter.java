/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb.classes;

import java.io.File;

/**
 *
 * @author cs
 */
public class FileTypeFilter {
    
    private final String ext;
    private final String desc;

    public FileTypeFilter(String ex, String des) {
        this.ext = ex;
        this.desc = des;
    }

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        return f.getName().endsWith(ext);
    }

    public String getDescription() {
        return desc + String.format("(%s)", ext);
    }
 
    
    
    
    
}
