//********************************
//  TowersOfHanoiDriver.java
//  Author: Vincent Yu
//  Demonstrates the functionality of TowersOfHanoi.java
//********************************

import javax.swing.*;

public class TowersOfHanoiDriver
{
    public static void main(String[] args)
    {
        //Beginning of a do-while loop that allows the user to redo this method until he/she confirms he is done
        int redo;
        do { //do-while loop begin

            //Asks for user input on how many disks to solve for in the Towers of Hanoi
            String numDisksUser = JOptionPane.showInputDialog("How many disks do you want to solve for in the Towers of Hanoi?");
            int numDisks = Integer.parseInt(numDisksUser);

            //Constructs TowersOfHanoi with user-inputted number of disks
            TowersOfHanoi towers = new TowersOfHanoi(numDisks);

            //Solves the Towers of Hanoi
            towers.solve(towers.getNumDisks(), towers.getPeg1(), towers.getPeg2(), towers.getPeg3());

            //Prints to user the step-by-step procedure to solve the Towers of Hanoi using x number of disks
            JOptionPane.showMessageDialog(null, towers.getFinalMessage() + "The Towers of Hanoi with " + numDisks + " disks was solved!");

            //End of the do-while loop that allowed the user to redo this method until he/she confirmed he was done
            redo = JOptionPane.showConfirmDialog(null, "Do you want solve the Towers of Hanoi again?");
        } while (redo == JOptionPane.YES_OPTION); //do-while loop end

    } //closes main method

} //closes TowersOfHanoiDriver class