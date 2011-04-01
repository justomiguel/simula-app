/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.simulacion;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author justo.vargas
 */
public class UISimulacion extends MIDlet implements CommandListener {

    private boolean midletPaused = false;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private SplashScreen splashScreen;
    private List Menu;
    private Form CuadradosMedios;
    private TextField inputTextField;
    private Spacer spacer;
    private TextField iterations;
    private StringItem resultStringItem;
    private Form ProductosMedios;
    private TextField inputprodu;
    private TextField inputprodu2;
    private Spacer spacer1;
    private TextField itearcionesprodu;
    private StringItem stringItem;
    private Form ProductosContante;
    private TextField textField2;
    private Spacer spacer2;
    private StringItem stringItem1;
    private TextField textField;
    private TextField textField1;
    private Form Lineal;
    private TextField textField3;
    private StringItem stringItem2;
    private TextField textField5;
    private TextField textField4;
    private TextField textField7;
    private TextField textField6;
    private Command itemCommand;
    private Command backCommand;
    private Command exitCommand;
    private Command itemCommand1;
    private Command backCommand1;
    private Command itemCommand2;
    private Command backCommand2;
    private Command itemCommand3;
    private Command backCommand3;
    private Image image;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The UISimulacion constructor.
     */
    public UISimulacion() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here

    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == CuadradosMedios) {//GEN-BEGIN:|7-commandAction|1|34-preAction
            if (command == backCommand) {//GEN-END:|7-commandAction|1|34-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|2|34-postAction
                // write post-action user code here
            } else if (command == itemCommand) {//GEN-LINE:|7-commandAction|3|29-preAction
                // write pre-action user code here
                String seed = inputTextField.getString();
                if (seed.length() > 2){
                    int limite = 0;
                    try{
                        limite = Integer.parseInt(iterations.getString());
                    } catch (NumberFormatException e){
                        limite = 1;
                    }
                    long result;
                    resultStringItem.setLabel("Resultado:");
                    this.resultStringItem.setText("");
                    for (int i = 0; i < limite; i++) {
                        result = Algorythms.cuadradosMedios(seed);
                        this.resultStringItem.setText(resultStringItem.getText()+"\n "+(i+1)+".- 0,"+result);
                        seed = String.valueOf(result);
                    }
                } else {
                    resultStringItem.setLabel("La semilla es muy chica");
                    resultStringItem.setText("");
                }
//GEN-LINE:|7-commandAction|4|29-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|75-preAction
        } else if (displayable == Lineal) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|5|75-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|6|75-postAction
                // write post-action user code here
            } else if (command == itemCommand3) {//GEN-LINE:|7-commandAction|7|77-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|8|77-postAction
                // write post-action user code here

                int a = Integer.parseInt(textField3.getString());
                long Xo = Integer.parseInt(textField4.getString());;
                int c = Integer.parseInt(textField5.getString());;
                int m = Integer.parseInt(textField6.getString());;
                if (a >0 && c >0 && m > 1){
                    int limite = 0;
                    try{
                        limite = Integer.parseInt(textField7.getString());
                    } catch (NumberFormatException e){
                        limite = 1;
                    }
                    long result;
                    stringItem2.setLabel("Resultado:");
                    this.stringItem2.setText("");
                    for (int i = 0; i < limite; i++) {
                        result = Algorythms.lineal(a,Xo,c,m);
                        long r = (result*1000000 / (m-1));
                        this.stringItem2.setText(stringItem2.getText()+"\n "+(i+1)+".- 0,"+r);
                        Xo = result;
                    }
                } else {
                    stringItem2.setLabel("Fijate los numeros viste");
                    stringItem2.setText("");
                }
            }//GEN-BEGIN:|7-commandAction|9|20-preAction
        } else if (displayable == Menu) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|9|20-preAction
                // write pre-action user code here
                MenuAction();//GEN-LINE:|7-commandAction|10|20-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|11|37-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|12|37-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|61-preAction
        } else if (displayable == ProductosContante) {
            if (command == backCommand2) {//GEN-END:|7-commandAction|13|61-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|14|61-postAction
                // write post-action user code here
            } else if (command == itemCommand2) {//GEN-LINE:|7-commandAction|15|59-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|16|59-postAction
                // write post-action user code here
                String seed1 = textField.getString();
                 String a = textField1.getString();
                if (seed1.length() > 2 ){
                    int limite = 0;
                    try{
                        limite = Integer.parseInt(textField2.getString());
                    } catch (NumberFormatException e){
                        limite = 1;
                    }
                    long result;
                    stringItem1.setLabel("Resultado:");
                    this.stringItem1.setText("");
                    for (int i = 0; i < limite; i++) {
                        result = Algorythms.productosMedios(seed1, a);
                        this.stringItem1.setText(stringItem1.getText()+"\n "+(i+1)+".- 0,"+result);
                        seed1 = String.valueOf(result);
                    }
                } else {
                    stringItem1.setLabel("La semilla es muy chica");
                    stringItem1.setText("");
                }
            }//GEN-BEGIN:|7-commandAction|17|45-preAction
        } else if (displayable == ProductosMedios) {
            if (command == backCommand1) {//GEN-END:|7-commandAction|17|45-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|18|45-postAction
                // write post-action user code here
            } else if (command == itemCommand1) {//GEN-LINE:|7-commandAction|19|43-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|20|43-postAction
                // write post-action user code here
                 String seed1 = inputprodu.getString();
                 String seed2 = inputprodu2.getString();
                if (seed1.length() > 2 && seed2.length() > 2){
                    int limite = 0;
                    try{
                        limite = Integer.parseInt(itearcionesprodu.getString());
                    } catch (NumberFormatException e){
                        limite = 1;
                    }
                    long result;
                    stringItem.setLabel("Resultado:");
                    this.stringItem.setText("");
                    for (int i = 0; i < limite; i++) {
                        result = Algorythms.productosMedios(seed1, seed2);
                        this.stringItem.setText(stringItem.getText()+"\n "+(i+1)+".- 0,"+result);
                        seed1 = seed2;
                        seed2 = String.valueOf(result);
                    }
                } else {
                    stringItem.setLabel("La semilla es muy chica");
                    stringItem.setText("");
                }
            }//GEN-BEGIN:|7-commandAction|21|16-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|21|16-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|22|16-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|23|7-postCommandAction
        }//GEN-END:|7-commandAction|23|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|24|
    //</editor-fold>//GEN-END:|7-commandAction|24|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of splashScreen component.
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|14-getter|1|14-postInit
            splashScreen.setTitle("");
            splashScreen.setCommandListener(this);
            splashScreen.setFullScreenMode(true);
            splashScreen.setImage(getImage());
            splashScreen.setText("");
            splashScreen.setTimeout(2000);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return splashScreen;
    }
    //</editor-fold>//GEN-END:|14-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Menu ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of Menu component.
     * @return the initialized component instance
     */
    public List getMenu() {
        if (Menu == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            Menu = new List("Menu", Choice.IMPLICIT);//GEN-BEGIN:|18-getter|1|18-postInit
            Menu.append("Cuadrados Medios", null);
            Menu.append("Productos Medios", null);
            Menu.append("Producto Constante", null);
            Menu.append("Algoritmo Lineal", null);
            Menu.addCommand(getExitCommand());
            Menu.setCommandListener(this);
            Menu.setSelectedFlags(new boolean[] { false, false, false, false });//GEN-END:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return Menu;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: MenuAction ">//GEN-BEGIN:|18-action|0|18-preAction
    /**
     * Performs an action assigned to the selected list element in the Menu component.
     */
    public void MenuAction() {//GEN-END:|18-action|0|18-preAction
        // enter pre-action user code here
        String __selectedString = getMenu().getString(getMenu().getSelectedIndex());//GEN-BEGIN:|18-action|1|23-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Cuadrados Medios")) {//GEN-END:|18-action|1|23-preAction
                // write pre-action user code here
                switchDisplayable(null, getCuadradosMedios());//GEN-LINE:|18-action|2|23-postAction
                // write post-action user code here
                this.inputTextField.setString("");
                this.iterations.setString("1");
                this.resultStringItem.setLabel("");
                this.resultStringItem.setText("");
            } else if (__selectedString.equals("Productos Medios")) {//GEN-LINE:|18-action|3|53-preAction
                // write pre-action user code here
                switchDisplayable(null, getProductosMedios());//GEN-LINE:|18-action|4|53-postAction
                // write post-action user code here
                this.inputprodu.setString("");
                this.inputprodu2.setString("");
                this.itearcionesprodu.setString("1");
                this.stringItem.setLabel("");
                this.stringItem.setText("");
            } else if (__selectedString.equals("Producto Constante")) {//GEN-LINE:|18-action|5|57-preAction
                // write pre-action user code here
                switchDisplayable(null, getProductosContante());//GEN-LINE:|18-action|6|57-postAction
                // write post-action user code here
                this.textField.setString("");
                this.textField1.setString("");
                this.textField2.setString("1");
                this.stringItem1.setLabel("");
                this.stringItem1.setText("");
            } else if (__selectedString.equals("Algoritmo Lineal")) {//GEN-LINE:|18-action|7|72-preAction
                // write pre-action user code here
                switchDisplayable(null, getLineal());//GEN-LINE:|18-action|8|72-postAction
                // write post-action user code here
                this.textField3.setString("");
                this.textField4.setString("");
                this.textField5.setString("");
                this.textField6.setString("");
                this.textField7.setString("");
                this.stringItem2.setLabel("");
                this.stringItem2.setText("");
            }//GEN-BEGIN:|18-action|9|18-postAction
        }//GEN-END:|18-action|9|18-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|18-action|10|
    //</editor-fold>//GEN-END:|18-action|10|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: CuadradosMedios ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initiliazed instance of CuadradosMedios component.
     * @return the initialized component instance
     */
    public Form getCuadradosMedios() {
        if (CuadradosMedios == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            CuadradosMedios = new Form("Cuadrados Medios", new Item[] { getInputTextField(), getIterations(), getSpacer(), getResultStringItem() });//GEN-BEGIN:|24-getter|1|24-postInit
            CuadradosMedios.addCommand(getItemCommand());
            CuadradosMedios.addCommand(getBackCommand());
            CuadradosMedios.setCommandListener(this);//GEN-END:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return CuadradosMedios;
    }
    //</editor-fold>//GEN-END:|24-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: inputTextField ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initiliazed instance of inputTextField component.
     * @return the initialized component instance
     */
    public TextField getInputTextField() {
        if (inputTextField == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            inputTextField = new TextField("Ingrese semilla", null, 32, TextField.ANY);//GEN-LINE:|27-getter|1|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return inputTextField;
    }
    //</editor-fold>//GEN-END:|27-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of itemCommand component.
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            itemCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return itemCommand;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: iterations ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initiliazed instance of iterations component.
     * @return the initialized component instance
     */
    public TextField getIterations() {
        if (iterations == null) {//GEN-END:|30-getter|0|30-preInit
            // write pre-init user code here
            iterations = new TextField("Ingrese cantidad de iteraciones", null, 32, TextField.ANY);//GEN-LINE:|30-getter|1|30-postInit
            // write post-init user code here
        }//GEN-BEGIN:|30-getter|2|
        return iterations;
    }
    //</editor-fold>//GEN-END:|30-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initiliazed instance of spacer component.
     * @return the initialized component instance
     */
    public Spacer getSpacer() {
        if (spacer == null) {//GEN-END:|31-getter|0|31-preInit
            // write pre-init user code here
            spacer = new Spacer(16, 3);//GEN-LINE:|31-getter|1|31-postInit
            // write post-init user code here
        }//GEN-BEGIN:|31-getter|2|
        return spacer;
    }
    //</editor-fold>//GEN-END:|31-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: resultStringItem ">//GEN-BEGIN:|32-getter|0|32-preInit
    /**
     * Returns an initiliazed instance of resultStringItem component.
     * @return the initialized component instance
     */
    public StringItem getResultStringItem() {
        if (resultStringItem == null) {//GEN-END:|32-getter|0|32-preInit
            // write pre-init user code here
            resultStringItem = new StringItem("Resultado:", null);//GEN-LINE:|32-getter|1|32-postInit
            // write post-init user code here
        }//GEN-BEGIN:|32-getter|2|
        return resultStringItem;
    }
    //</editor-fold>//GEN-END:|32-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|33-getter|1|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|33-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|36-getter|0|36-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|36-getter|1|36-postInit
            // write post-init user code here
        }//GEN-BEGIN:|36-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|36-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initiliazed instance of image component.
     * @return the initialized component instance
     */
    public Image getImage() {
        if (image == null) {//GEN-END:|40-getter|0|40-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|40-getter|1|40-@java.io.IOException
                image = Image.createImage("/intro.png");
            } catch (java.io.IOException e) {//GEN-END:|40-getter|1|40-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|40-getter|2|40-postInit
            // write post-init user code here
        }//GEN-BEGIN:|40-getter|3|
        return image;
    }
    //</editor-fold>//GEN-END:|40-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ProductosMedios ">//GEN-BEGIN:|41-getter|0|41-preInit
    /**
     * Returns an initiliazed instance of ProductosMedios component.
     * @return the initialized component instance
     */
    public Form getProductosMedios() {
        if (ProductosMedios == null) {//GEN-END:|41-getter|0|41-preInit
            // write pre-init user code here
            ProductosMedios = new Form("Productos Medios", new Item[] { getInputprodu(), getInputprodu2(), getItearcionesprodu(), getSpacer1(), getStringItem() });//GEN-BEGIN:|41-getter|1|41-postInit
            ProductosMedios.addCommand(getItemCommand1());
            ProductosMedios.addCommand(getBackCommand1());
            ProductosMedios.setCommandListener(this);//GEN-END:|41-getter|1|41-postInit
            // write post-init user code here
        }//GEN-BEGIN:|41-getter|2|
        return ProductosMedios;
    }
    //</editor-fold>//GEN-END:|41-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: inputprodu ">//GEN-BEGIN:|46-getter|0|46-preInit
    /**
     * Returns an initiliazed instance of inputprodu component.
     * @return the initialized component instance
     */
    public TextField getInputprodu() {
        if (inputprodu == null) {//GEN-END:|46-getter|0|46-preInit
            // write pre-init user code here
            inputprodu = new TextField("Ingrese Primer Semilla", null, 32, TextField.ANY);//GEN-LINE:|46-getter|1|46-postInit
            // write post-init user code here
        }//GEN-BEGIN:|46-getter|2|
        return inputprodu;
    }
    //</editor-fold>//GEN-END:|46-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: inputprodu2 ">//GEN-BEGIN:|47-getter|0|47-preInit
    /**
     * Returns an initiliazed instance of inputprodu2 component.
     * @return the initialized component instance
     */
    public TextField getInputprodu2() {
        if (inputprodu2 == null) {//GEN-END:|47-getter|0|47-preInit
            // write pre-init user code here
            inputprodu2 = new TextField("Ingrese Segunda Semilla", null, 32, TextField.ANY);//GEN-LINE:|47-getter|1|47-postInit
            // write post-init user code here
        }//GEN-BEGIN:|47-getter|2|
        return inputprodu2;
    }
    //</editor-fold>//GEN-END:|47-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itearcionesprodu ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initiliazed instance of itearcionesprodu component.
     * @return the initialized component instance
     */
    public TextField getItearcionesprodu() {
        if (itearcionesprodu == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            itearcionesprodu = new TextField("Iteraciones", null, 32, TextField.ANY);//GEN-LINE:|50-getter|1|50-postInit
            // write post-init user code here
        }//GEN-BEGIN:|50-getter|2|
        return itearcionesprodu;
    }
    //</editor-fold>//GEN-END:|50-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer1 ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initiliazed instance of spacer1 component.
     * @return the initialized component instance
     */
    public Spacer getSpacer1() {
        if (spacer1 == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            spacer1 = new Spacer(16, 1);//GEN-LINE:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return spacer1;
    }
    //</editor-fold>//GEN-END:|51-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            stringItem = new StringItem("Resultado", null);//GEN-LINE:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|52-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand1 ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initiliazed instance of itemCommand1 component.
     * @return the initialized component instance
     */
    public Command getItemCommand1() {
        if (itemCommand1 == null) {//GEN-END:|42-getter|0|42-preInit
            // write pre-init user code here
            itemCommand1 = new Command("Item", Command.ITEM, 0);//GEN-LINE:|42-getter|1|42-postInit
            // write post-init user code here
        }//GEN-BEGIN:|42-getter|2|
        return itemCommand1;
    }
    //</editor-fold>//GEN-END:|42-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initiliazed instance of backCommand1 component.
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|44-getter|0|44-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|44-getter|1|44-postInit
            // write post-init user code here
        }//GEN-BEGIN:|44-getter|2|
        return backCommand1;
    }
    //</editor-fold>//GEN-END:|44-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ProductosContante ">//GEN-BEGIN:|56-getter|0|56-preInit
    /**
     * Returns an initiliazed instance of ProductosContante component.
     * @return the initialized component instance
     */
    public Form getProductosContante() {
        if (ProductosContante == null) {//GEN-END:|56-getter|0|56-preInit
            // write pre-init user code here
            ProductosContante = new Form("Producto Constante", new Item[] { getTextField(), getTextField1(), getTextField2(), getSpacer2(), getStringItem1() });//GEN-BEGIN:|56-getter|1|56-postInit
            ProductosContante.addCommand(getItemCommand2());
            ProductosContante.addCommand(getBackCommand2());
            ProductosContante.setCommandListener(this);//GEN-END:|56-getter|1|56-postInit
            // write post-init user code here
        }//GEN-BEGIN:|56-getter|2|
        return ProductosContante;
    }
    //</editor-fold>//GEN-END:|56-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|64-getter|0|64-preInit
    /**
     * Returns an initiliazed instance of textField component.
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|64-getter|0|64-preInit
            // write pre-init user code here
            textField = new TextField("Ingrese Semilla", null, 32, TextField.ANY);//GEN-LINE:|64-getter|1|64-postInit
            // write post-init user code here
        }//GEN-BEGIN:|64-getter|2|
        return textField;
    }
    //</editor-fold>//GEN-END:|64-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|65-getter|0|65-preInit
    /**
     * Returns an initiliazed instance of textField1 component.
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|65-getter|0|65-preInit
            // write pre-init user code here
            textField1 = new TextField("Ingrese Constante a:", null, 32, TextField.ANY);//GEN-LINE:|65-getter|1|65-postInit
            // write post-init user code here
        }//GEN-BEGIN:|65-getter|2|
        return textField1;
    }
    //</editor-fold>//GEN-END:|65-getter|2|





    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand2 ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initiliazed instance of itemCommand2 component.
     * @return the initialized component instance
     */
    public Command getItemCommand2() {
        if (itemCommand2 == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            itemCommand2 = new Command("Item", Command.ITEM, 0);//GEN-LINE:|58-getter|1|58-postInit
            // write post-init user code here
        }//GEN-BEGIN:|58-getter|2|
        return itemCommand2;
    }
    //</editor-fold>//GEN-END:|58-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand2 ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initiliazed instance of backCommand2 component.
     * @return the initialized component instance
     */
    public Command getBackCommand2() {
        if (backCommand2 == null) {//GEN-END:|60-getter|0|60-preInit
            // write pre-init user code here
            backCommand2 = new Command("Back", Command.BACK, 0);//GEN-LINE:|60-getter|1|60-postInit
            // write post-init user code here
        }//GEN-BEGIN:|60-getter|2|
        return backCommand2;
    }
    //</editor-fold>//GEN-END:|60-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|68-getter|0|68-preInit
    /**
     * Returns an initiliazed instance of textField2 component.
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|68-getter|0|68-preInit
            // write pre-init user code here
            textField2 = new TextField("Iteraciones", null, 32, TextField.ANY);//GEN-LINE:|68-getter|1|68-postInit
            // write post-init user code here
        }//GEN-BEGIN:|68-getter|2|
        return textField2;
    }
    //</editor-fold>//GEN-END:|68-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer2 ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initiliazed instance of spacer2 component.
     * @return the initialized component instance
     */
    public Spacer getSpacer2() {
        if (spacer2 == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            spacer2 = new Spacer(16, 1);//GEN-LINE:|69-getter|1|69-postInit
            // write post-init user code here
        }//GEN-BEGIN:|69-getter|2|
        return spacer2;
    }
    //</editor-fold>//GEN-END:|69-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initiliazed instance of stringItem1 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            stringItem1 = new StringItem("stringItem1", null);//GEN-LINE:|70-getter|1|70-postInit
            // write post-init user code here
        }//GEN-BEGIN:|70-getter|2|
        return stringItem1;
    }
    //</editor-fold>//GEN-END:|70-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Lineal ">//GEN-BEGIN:|71-getter|0|71-preInit
    /**
     * Returns an initiliazed instance of Lineal component.
     * @return the initialized component instance
     */
    public Form getLineal() {
        if (Lineal == null) {//GEN-END:|71-getter|0|71-preInit
            // write pre-init user code here
            Lineal = new Form("Algoritmo Lineal", new Item[] { getTextField3(), getTextField4(), getTextField5(), getTextField6(), getTextField7(), getStringItem2() });//GEN-BEGIN:|71-getter|1|71-postInit
            Lineal.addCommand(getBackCommand3());
            Lineal.addCommand(getItemCommand3());
            Lineal.setCommandListener(this);//GEN-END:|71-getter|1|71-postInit
            // write post-init user code here

        }//GEN-BEGIN:|71-getter|2|
        return Lineal;
    }
    //</editor-fold>//GEN-END:|71-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|79-getter|0|79-preInit
    /**
     * Returns an initiliazed instance of textField3 component.
     * @return the initialized component instance
     */
    public TextField getTextField3() {
        if (textField3 == null) {//GEN-END:|79-getter|0|79-preInit
            // write pre-init user code here
            textField3 = new TextField("a", null, 32, TextField.ANY);//GEN-LINE:|79-getter|1|79-postInit
            // write post-init user code here
        }//GEN-BEGIN:|79-getter|2|
        return textField3;
    }
    //</editor-fold>//GEN-END:|79-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|80-getter|0|80-preInit
    /**
     * Returns an initiliazed instance of textField4 component.
     * @return the initialized component instance
     */
    public TextField getTextField4() {
        if (textField4 == null) {//GEN-END:|80-getter|0|80-preInit
            // write pre-init user code here
            textField4 = new TextField("Xo", null, 32, TextField.ANY);//GEN-LINE:|80-getter|1|80-postInit
            // write post-init user code here
        }//GEN-BEGIN:|80-getter|2|
        return textField4;
    }
    //</editor-fold>//GEN-END:|80-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|81-getter|0|81-preInit
    /**
     * Returns an initiliazed instance of textField5 component.
     * @return the initialized component instance
     */
    public TextField getTextField5() {
        if (textField5 == null) {//GEN-END:|81-getter|0|81-preInit
            // write pre-init user code here
            textField5 = new TextField("c", null, 32, TextField.ANY);//GEN-LINE:|81-getter|1|81-postInit
            // write post-init user code here
        }//GEN-BEGIN:|81-getter|2|
        return textField5;
    }
    //</editor-fold>//GEN-END:|81-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField6 ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initiliazed instance of textField6 component.
     * @return the initialized component instance
     */
    public TextField getTextField6() {
        if (textField6 == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            textField6 = new TextField("m", null, 32, TextField.ANY);//GEN-LINE:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return textField6;
    }
    //</editor-fold>//GEN-END:|82-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField7 ">//GEN-BEGIN:|83-getter|0|83-preInit
    /**
     * Returns an initiliazed instance of textField7 component.
     * @return the initialized component instance
     */
    public TextField getTextField7() {
        if (textField7 == null) {//GEN-END:|83-getter|0|83-preInit
            // write pre-init user code here
            textField7 = new TextField("Cantidad de Iteraciones", null, 32, TextField.ANY);//GEN-LINE:|83-getter|1|83-postInit
            // write post-init user code here
        }//GEN-BEGIN:|83-getter|2|
        return textField7;
    }
    //</editor-fold>//GEN-END:|83-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand3 ">//GEN-BEGIN:|74-getter|0|74-preInit
    /**
     * Returns an initiliazed instance of backCommand3 component.
     * @return the initialized component instance
     */
    public Command getBackCommand3() {
        if (backCommand3 == null) {//GEN-END:|74-getter|0|74-preInit
            // write pre-init user code here
            backCommand3 = new Command("Back", Command.BACK, 0);//GEN-LINE:|74-getter|1|74-postInit
            // write post-init user code here
        }//GEN-BEGIN:|74-getter|2|
        return backCommand3;
    }
    //</editor-fold>//GEN-END:|74-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand3 ">//GEN-BEGIN:|76-getter|0|76-preInit
    /**
     * Returns an initiliazed instance of itemCommand3 component.
     * @return the initialized component instance
     */
    public Command getItemCommand3() {
        if (itemCommand3 == null) {//GEN-END:|76-getter|0|76-preInit
            // write pre-init user code here
            itemCommand3 = new Command("Item", Command.ITEM, 0);//GEN-LINE:|76-getter|1|76-postInit
            // write post-init user code here
        }//GEN-BEGIN:|76-getter|2|
        return itemCommand3;
    }
    //</editor-fold>//GEN-END:|76-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem2 ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initiliazed instance of stringItem2 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem2() {
        if (stringItem2 == null) {//GEN-END:|85-getter|0|85-preInit
            // write pre-init user code here
            stringItem2 = new StringItem("Resultado:", null);//GEN-LINE:|85-getter|1|85-postInit
            // write post-init user code here
        }//GEN-BEGIN:|85-getter|2|
        return stringItem2;
    }
    //</editor-fold>//GEN-END:|85-getter|2|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

}
