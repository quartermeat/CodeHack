/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("GenericSpinner", com.codename1.ui.spinner.GenericSpinner.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("GenericSpinner", com.codename1.ui.spinner.GenericSpinner.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findContainerSpinners(Component root) {
        return (com.codename1.ui.Container)findByName("containerSpinners", root);
    }

    public com.codename1.ui.Container findContainerSpinners() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("containerSpinners", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("containerSpinners", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelGuessDisplay(Component root) {
        return (com.codename1.ui.Label)findByName("labelGuessDisplay", root);
    }

    public com.codename1.ui.Label findLabelGuessDisplay() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("labelGuessDisplay", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("labelGuessDisplay", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerClueDisplay(Component root) {
        return (com.codename1.ui.Container)findByName("containerClueDisplay", root);
    }

    public com.codename1.ui.Container findContainerClueDisplay() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("containerClueDisplay", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("containerClueDisplay", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextAreaClue1(Component root) {
        return (com.codename1.ui.TextArea)findByName("textAreaClue1", root);
    }

    public com.codename1.ui.TextArea findTextAreaClue1() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("textAreaClue1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("textAreaClue1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButtonGuess(Component root) {
        return (com.codename1.ui.Button)findByName("buttonGuess", root);
    }

    public com.codename1.ui.Button findButtonGuess() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("buttonGuess", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("buttonGuess", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelWinTries(Component root) {
        return (com.codename1.ui.Label)findByName("labelWinTries", root);
    }

    public com.codename1.ui.Label findLabelWinTries() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("labelWinTries", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("labelWinTries", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextAreaClue2(Component root) {
        return (com.codename1.ui.TextArea)findByName("textAreaClue2", root);
    }

    public com.codename1.ui.TextArea findTextAreaClue2() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("textAreaClue2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("textAreaClue2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelTries(Component root) {
        return (com.codename1.ui.Label)findByName("labelTries", root);
    }

    public com.codename1.ui.Label findLabelTries() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("labelTries", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("labelTries", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelTriesLabel(Component root) {
        return (com.codename1.ui.Label)findByName("labelTriesLabel", root);
    }

    public com.codename1.ui.Label findLabelTriesLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("labelTriesLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("labelTriesLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelGuess(Component root) {
        return (com.codename1.ui.Label)findByName("labelGuess", root);
    }

    public com.codename1.ui.Label findLabelGuess() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("labelGuess", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("labelGuess", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextAreaGuess3(Component root) {
        return (com.codename1.ui.TextArea)findByName("textAreaGuess3", root);
    }

    public com.codename1.ui.TextArea findTextAreaGuess3() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("textAreaGuess3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("textAreaGuess3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextAreaGuess4(Component root) {
        return (com.codename1.ui.TextArea)findByName("textAreaGuess4", root);
    }

    public com.codename1.ui.TextArea findTextAreaGuess4() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("textAreaGuess4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("textAreaGuess4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextAreaGuess1(Component root) {
        return (com.codename1.ui.TextArea)findByName("textAreaGuess1", root);
    }

    public com.codename1.ui.TextArea findTextAreaGuess1() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("textAreaGuess1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("textAreaGuess1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextAreaGuess2(Component root) {
        return (com.codename1.ui.TextArea)findByName("textAreaGuess2", root);
    }

    public com.codename1.ui.TextArea findTextAreaGuess2() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("textAreaGuess2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("textAreaGuess2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerClue(Component root) {
        return (com.codename1.ui.Container)findByName("containerClue", root);
    }

    public com.codename1.ui.Container findContainerClue() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("containerClue", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("containerClue", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabeClue(Component root) {
        return (com.codename1.ui.Label)findByName("labeClue", root);
    }

    public com.codename1.ui.Label findLabeClue() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("labeClue", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("labeClue", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextAreaClue3(Component root) {
        return (com.codename1.ui.TextArea)findByName("textAreaClue3", root);
    }

    public com.codename1.ui.TextArea findTextAreaClue3() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("textAreaClue3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("textAreaClue3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.GenericSpinner findSpinner4(Component root) {
        return (com.codename1.ui.spinner.GenericSpinner)findByName("spinner4", root);
    }

    public com.codename1.ui.spinner.GenericSpinner findSpinner4() {
        com.codename1.ui.spinner.GenericSpinner cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("spinner4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("spinner4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextAreaClue4(Component root) {
        return (com.codename1.ui.TextArea)findByName("textAreaClue4", root);
    }

    public com.codename1.ui.TextArea findTextAreaClue4() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("textAreaClue4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("textAreaClue4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.GenericSpinner findSpinner3(Component root) {
        return (com.codename1.ui.spinner.GenericSpinner)findByName("spinner3", root);
    }

    public com.codename1.ui.spinner.GenericSpinner findSpinner3() {
        com.codename1.ui.spinner.GenericSpinner cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("spinner3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("spinner3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.GenericSpinner findSpinner2(Component root) {
        return (com.codename1.ui.spinner.GenericSpinner)findByName("spinner2", root);
    }

    public com.codename1.ui.spinner.GenericSpinner findSpinner2() {
        com.codename1.ui.spinner.GenericSpinner cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("spinner2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("spinner2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerLastGuess(Component root) {
        return (com.codename1.ui.Container)findByName("containerLastGuess", root);
    }

    public com.codename1.ui.Container findContainerLastGuess() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("containerLastGuess", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("containerLastGuess", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.GenericSpinner findSpinner1(Component root) {
        return (com.codename1.ui.spinner.GenericSpinner)findByName("spinner1", root);
    }

    public com.codename1.ui.spinner.GenericSpinner findSpinner1() {
        com.codename1.ui.spinner.GenericSpinner cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("spinner1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("spinner1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerLastGuessDisplay(Component root) {
        return (com.codename1.ui.Container)findByName("containerLastGuessDisplay", root);
    }

    public com.codename1.ui.Container findContainerLastGuessDisplay() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("containerLastGuessDisplay", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("containerLastGuessDisplay", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButtonOkay(Component root) {
        return (com.codename1.ui.Button)findByName("buttonOkay", root);
    }

    public com.codename1.ui.Button findButtonOkay() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("buttonOkay", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("buttonOkay", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerTries(Component root) {
        return (com.codename1.ui.Container)findByName("containerTries", root);
    }

    public com.codename1.ui.Container findContainerTries() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("containerTries", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("containerTries", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerGuessButton(Component root) {
        return (com.codename1.ui.Container)findByName("containerGuessButton", root);
    }

    public com.codename1.ui.Container findContainerGuessButton() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("containerGuessButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("containerGuessButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerGuessSpinner(Component root) {
        return (com.codename1.ui.Container)findByName("containerGuessSpinner", root);
    }

    public com.codename1.ui.Container findContainerGuessSpinner() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("containerGuessSpinner", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("containerGuessSpinner", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("WinDialog".equals(f.getName())) {
            exitWinDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitWinDialog(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("WinDialog".equals(f.getName())) {
            beforeWinDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeWinDialog(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("WinDialog".equals(c.getName())) {
            beforeContainerWinDialog(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerWinDialog(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("WinDialog".equals(f.getName())) {
            postWinDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postWinDialog(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("WinDialog".equals(c.getName())) {
            postContainerWinDialog(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerWinDialog(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("WinDialog".equals(rootName)) {
            onCreateWinDialog();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateWinDialog() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("WinDialog".equals(f.getName())) {
            getStateWinDialog(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateWinDialog(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("WinDialog".equals(f.getName())) {
            setStateWinDialog(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateWinDialog(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("WinDialog")) {
            if("buttonOkay".equals(c.getName())) {
                onWinDialog_ButtonOkayAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("textAreaGuess1".equals(c.getName())) {
                onMain_TextAreaGuess1Action(c, event);
                return;
            }
            if("textAreaGuess2".equals(c.getName())) {
                onMain_TextAreaGuess2Action(c, event);
                return;
            }
            if("textAreaGuess3".equals(c.getName())) {
                onMain_TextAreaGuess3Action(c, event);
                return;
            }
            if("textAreaGuess4".equals(c.getName())) {
                onMain_TextAreaGuess4Action(c, event);
                return;
            }
            if("textAreaClue1".equals(c.getName())) {
                onMain_TextAreaClue1Action(c, event);
                return;
            }
            if("textAreaClue2".equals(c.getName())) {
                onMain_TextAreaClue2Action(c, event);
                return;
            }
            if("textAreaClue3".equals(c.getName())) {
                onMain_TextAreaClue3Action(c, event);
                return;
            }
            if("textAreaClue4".equals(c.getName())) {
                onMain_TextAreaClue4Action(c, event);
                return;
            }
            if("buttonGuess".equals(c.getName())) {
                onMain_ButtonGuessAction(c, event);
                return;
            }
        }
    }

      protected void onWinDialog_ButtonOkayAction(Component c, ActionEvent event) {
      }

      protected void onMain_TextAreaGuess1Action(Component c, ActionEvent event) {
      }

      protected void onMain_TextAreaGuess2Action(Component c, ActionEvent event) {
      }

      protected void onMain_TextAreaGuess3Action(Component c, ActionEvent event) {
      }

      protected void onMain_TextAreaGuess4Action(Component c, ActionEvent event) {
      }

      protected void onMain_TextAreaClue1Action(Component c, ActionEvent event) {
      }

      protected void onMain_TextAreaClue2Action(Component c, ActionEvent event) {
      }

      protected void onMain_TextAreaClue3Action(Component c, ActionEvent event) {
      }

      protected void onMain_TextAreaClue4Action(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonGuessAction(Component c, ActionEvent event) {
      }

}
