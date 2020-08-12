package bb.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cs
 */
public class ComboBoxItem {
    private final String codeValue;
    private final String displayText;

    public ComboBoxItem(String code,String text) {
        this.codeValue = code;
        this.displayText = text;

    }

    ComboBoxItem(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the codeValue
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * @return the displayText
     */
    public String getDisplayText() {
        return displayText;
    }
    @Override
    public String toString(){
        return this.displayText;
    }
    
}

    
    
    

