/**
 * Your application code goes here
 */
package userclasses;

import codebreaker.Code;
import codebreaker.CodeNode;
import generated.StateMachineBase;
import com.codename1.ui.*;
import com.codename1.ui.events.*;
import com.codename1.ui.list.ListModel;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {

    private static Code clues;
    private static Code code;
    private static Code guess;
    private static int numTry;

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of the
     * constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        code = new Code();
        code.initialize();
        numTry = 0;
        clues = new Code();
        guess = new Code();
    }

    @Override
    protected void onCreateMain() {
        
    }

    @Override
    protected void onMain_ButtonGuessAction(Component c, ActionEvent event) {
        char value1 = findSpinner1().getValue().toString().charAt(0);
        char value2 = findSpinner2().getValue().toString().charAt(0);
        char value3 = findSpinner3().getValue().toString().charAt(0);
        char value4 = findSpinner4().getValue().toString().charAt(0);

        char[] codeArray = {value1, value2, value3, value4};

        guess = new Code(codeArray);

        clues = (Code) code.getClues(guess);

        numTry++;

        findLabelTries().setText(String.valueOf(numTry));

        findTextAreaGuess1().setText(guess.get(0).toString());
        findTextAreaGuess2().setText(guess.get(1).toString());
        findTextAreaGuess3().setText(guess.get(2).toString());
        findTextAreaGuess4().setText(guess.get(3).toString());

        findTextAreaClue1().setText(clues.get(0).toString());
        findTextAreaClue2().setText(clues.get(1).toString());
        findTextAreaClue3().setText(clues.get(2).toString());
        findTextAreaClue4().setText(clues.get(3).toString());

        if (clues.toString().equals("XXXX")) {
            //game is won, handle it here

            showForm("WinDialog", null);
            findLabelTries().setText(String.valueOf(numTry));

        }

    }

    @Override
    protected void onWinDialog_ButtonOkayAction(Component c, ActionEvent event) {
        showForm("Main", null); 
    }
}
