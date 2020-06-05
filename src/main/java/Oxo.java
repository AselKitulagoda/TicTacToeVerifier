import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Oxo {
    private State[][] oxogrid=new State[3][3];

    public enum State{
        X,O,EMPTY
    }

    public Oxo(State [][] arr){
        for (int i=0;i<arr.length;i++){
            if (arr.length != 3 || arr[i].length != 3){
                    throw new ClassCastException("Input needs to be a 3x3 grid");
                }
            }
        this.oxogrid = arr;
    }


    public static Boolean findWinners(Oxo oxoinput,State player){
        Boolean won = true;
        int[] magicSquare = new int[]{4,9,2,3,5,7,8,1,6};
        for (int i=0;i<oxoinput.oxogrid.length;i++) {
            won = true;
            int magicnum_rows = 0;
            int magicnum_cols = 0;
            for (int j = 0; j < oxoinput.oxogrid[i].length; j++) {
                if (oxoinput.oxogrid[i][j] != State.EMPTY) {
                    if (oxoinput.oxogrid[i][j].equals(player)) {
                        magicnum_rows += magicSquare[i + j * 3];
                    }
                }
                if (oxoinput.oxogrid[j][i] != State.EMPTY) {
                    if (oxoinput.oxogrid[j][i].equals(player)) {
                        magicnum_cols += magicSquare[i * 3 + j];
                    }
                }
                if (magicnum_rows == 15 || magicnum_cols == 15) {
                    return true;
                }
            }
        }
        won = true;
        for (int i=0;i<oxoinput.oxogrid.length;i++){
            if (oxoinput.oxogrid[i][i]!= State.EMPTY) {
                if (!oxoinput.oxogrid[i][i].equals(player)) {
                    won = false;
                    break;
                }
            }
            else {
                won = false;
            }

        }
        if (won) return true;

        won = true;
        for (int i=0;i<oxoinput.oxogrid.length;i++){
            if (oxoinput.oxogrid[i][oxoinput.oxogrid.length-i-1]!= State.EMPTY) {
                if (!oxoinput.oxogrid[i][oxoinput.oxogrid.length-i-1].equals(player)) {
                    won = false;
                    break;
                }
            }
            else {
                won=false;
            }
        }
        if (won) return true;

        return false;
    }

    public static void main(String[] args) throws IOException {
        State[][] oxoinput = {{State.O,State.O,State.X},{State.X,State.X,State.O},{State.X,State.O,State.X}};
        Oxo oxogrid = new Oxo(oxoinput);

        if (findWinners(oxogrid,State.X)){
            System.out.println("crosses (X) has won");
        }
        else if (findWinners(oxogrid,State.O)){
            System.out.println("noughts (O) has won");
        }
        else {
            System.out.println("Yet to be decided");
        }
    }
}
