//**********************************
//  TowersOfHanoi.java
//  Author: Vincent Yu
//  Solves the Towers of Hanoi with x number of disks using recursion.
//**********************************

import java.util.*;
import javax.swing.*;

public class TowersOfHanoi
{
    private int numDisks;
    private ArrayList<Integer> peg1 = new ArrayList<Integer> ();
    private ArrayList<Integer> peg2 = new ArrayList<Integer> ();
    private ArrayList<Integer> peg3 = new ArrayList<Integer> ();
    private String finalMessageWithSolution;

    //Constructor method: Towers of Hanoi with n disks
    public TowersOfHanoi(int n)
    {
        finalMessageWithSolution = "";
        numDisks = n;
        for(int i=numDisks; i>0; i--)
            peg1.add(i);
    }

    //*************ACCESSOR METHODS****************

    //---------------------------------------------------
    //   getNumDisks ()
    //   Returns the number of disks in the Towers of Hanoi.
    //---------------------------------------------------
    public int getNumDisks()
    {
        return numDisks;
    }

    //---------------------------------------------------
    //   getPeg1 ()
    //   Returns the first peg.
    //---------------------------------------------------
    public ArrayList<Integer> getPeg1()
    {
        return peg1;
    }

    //---------------------------------------------------
    //   getPeg2 ()
    //   Returns the middle peg.
    //---------------------------------------------------
    public ArrayList<Integer> getPeg2()
    {
        return peg2;
    }

    //---------------------------------------------------
    //   getPeg3 ()
    //   Returns the last peg.
    //---------------------------------------------------
    public ArrayList<Integer> getPeg3()
    {
        return peg3;
    }

    //---------------------------------------------------
    //   getFinalMessage ()
    //   Returns the finalMessage to be outputted to the user (includes step-by-step solution).
    //---------------------------------------------------
    public String getFinalMessage()
    {
        return finalMessageWithSolution;
    }

    //---------------------------------------------------
    //   solve (int disks, ArrayList<Integer> fromPeg, ArrayList<Integer> toPeg, ArrayList<Integer> viaPeg)
    //   Solves the Towers of Hanoi.
    //
    //   Precondition: disks > 0; fromPeg, toPeg, and viaPeg are filled with integers
    //   Postcondition: Towers of Hanoi is solved
    //---------------------------------------------------
    public void solve(int disks, ArrayList<Integer> fromPeg, ArrayList<Integer> toPeg, ArrayList<Integer> viaPeg)
    {
        //Once disks reaches 0, get the current position of all the disks and concat it to the finalMessage
        if(disks == 0)
        {
            finalMessageWithSolution += toString();
        }
        //Recursive solution to Towers of Hanoi
        else {
            solve(disks-1,fromPeg,viaPeg,toPeg);
            int index = fromPeg.size()-1;
            fromPeg.remove(index);
            viaPeg.add(disks);
            solve(disks-1,toPeg,fromPeg,viaPeg);
        }
    }

    //---------------------------------------------------
    //   toString ()
    //   Returns the Towers of Hanoi (the disks and their positions on each peg) as a string.
    //---------------------------------------------------
    public String toString()
    {
        String summary = "";
        summary += peg1;
        summary += peg2;
        summary += peg3;
        summary += "\n";
        return summary;
    }

} //closes TowersOfHanoi class