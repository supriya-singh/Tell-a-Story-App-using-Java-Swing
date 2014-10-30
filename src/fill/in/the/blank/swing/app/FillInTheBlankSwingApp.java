/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fill.in.the.blank.swing.app;

/**
 *
 * @author supriyasingh
 */
import javax.swing.JOptionPane;

public class FillInTheBlankSwingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FillInTheBlankSwingApp();
    }

    public FillInTheBlankSwingApp() {
        boolean done = false;
        while (!done) {
            done = true;
            String[] ans = new String[9];

            JOptionPane.showMessageDialog(null, "Lets's make story :)", "Fill in the Blank", JOptionPane.INFORMATION_MESSAGE);

            String[] colors = {
                "orange",
                "red",
                "blue",
                "green"
            };

            int color_index = JOptionPane.showOptionDialog(null, "Whats your favourite color ?", "Color", 0, JOptionPane.QUESTION_MESSAGE, null, colors, 0);
            ans[0] = colors[color_index];

            ans[1] = JOptionPane.showInputDialog(null, "Whats do like to drink ?", "Liquid", JOptionPane.QUESTION_MESSAGE);
            ans[2] = JOptionPane.showInputDialog("Name something to bring to shcool(plural noun)");
            ans[3] = JOptionPane.showInputDialog("Name fruits you like(plural noun)");
            ans[4] = JOptionPane.showInputDialog("Name something you own multiple time(plural noun)");
            ans[5] = JOptionPane.showInputDialog("Describe your current leader in one word(plural noun)");
            ans[6] = JOptionPane.showInputDialog("what is something you do like in travelling");
            ans[7]=JOptionPane.showInputDialog("Describe yourself in a positve way (adjective)");
            ans[8]=JOptionPane.showInputDialog("What kind of exercise do you do these days?(present tense verb)");
            //ans[9]=JOptionPane.showInputDialog("Name something to bring to shcool(plural noun)");
            //ans[10]=JOptionPane.showInputDialog("Name something to bring to shcool(plural noun)");
            //Basic for of show confirm returns in this order:: , yes, no, cancel
            int input = JOptionPane.showConfirmDialog(null, "Are you sure your are ready to see the result?");
            if (input == 1 || input == 2) {
                done = false;
            } else {
                input = JOptionPane.showConfirmDialog(null, "Really this is your  last chance ?", "", JOptionPane.YES_NO_OPTION);
                if (input == 1) {
                    done = false;
                } else {
                    input = JOptionPane.showConfirmDialog(null, "OK we will move on, but if still can press cancle if you are not ready", "", JOptionPane.OK_CANCEL_OPTION);
                    if (input == 1) {
                        done = false;
                    }

                }


            }
            if (done) {
            JOptionPane.showMessageDialog(null,
            "Each spring, the sky turns "+ans[0]+ ". Giant drops of " + ans[1]+ " fall from the sky. \n" +
            "All this "+ ans[1]+ " helps the grass and the " + ans[2]+ " to grow, but it can make things really \n" +
            ans[3]+ " too. Some places get so much "+ ans[1]+ ", that rivers " + ans[4]+ " into the streets. \n"
            + "Driving can be tricky when this happens, so some people put special " + ans[5]+ " on their cars. \n" +
            "And when the " +ans[1] + " is falling, don't forget your " + ans[6] + ". Otherwise, your feet might get \n" + 
                    ans[7] + " if you "+ ans[8]+ "in puddles!");

        } else {
            JOptionPane.showMessageDialog(null, "Ok we will start again");
        }
        }
        
    }
}
