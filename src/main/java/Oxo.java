import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Oxo {
    private String[][] oxogrid=new String[3][3];
    public Oxo(String[][] arr){
            for (int i=0;i<arr.length;i++){
                if (arr.length != 3 || arr[i].length != 3){
                    try {
                        throw new ClassCastException("Input needs to be a 3x3 grid");
                    }
                    catch (ArithmeticException e) {
                        System.out.println("Found grid was not 3x3 ");
                        throw new ClassCastException("input not properly formatted");
                    }
                }
                for (int j=0;j<arr[i].length;j++){



                        if (((arr[i][j] != null && !arr[i][j].equals("")))&&!arr[i][j].toUpperCase().equals("X") && !arr[i][j].toUpperCase().equals("O")){
                    try {
                        throw new ClassCastException("input not properly formatted");

                    }
                    catch (ArithmeticException e){
                        System.out.println("Found input not properly formatted");
                        throw new ClassCastException("input not properly formatted");
                    }
                    }
                }
            }

            this.oxogrid = arr;
        }


        public static Boolean findWinners(Oxo oxoinput,String player){
        String[] board = new String[9];
        Arrays.fill(board,"");
        int[] magicSquare = new int[]{4,9,2,3,5,7,8,1,6};
            for (int i=0;i<oxoinput.oxogrid.length;i++){
                for (int j=0;j<oxoinput.oxogrid[i].length;j++){
                    board[i + j*3] = oxoinput.oxogrid[i][j];
                }}
            System.out.println(Arrays.toString(board));
            for (int i=0;i<9;i++){
                for (int j=0;j<9;j++){
                    for (int k=0;k<9;k++){
                        if (i !=j && i!=k && j!=k){
                            if (board[i] != null && board[j] != null && board[k] != null){
                            if (board[i].toUpperCase().equals(player) && board[j].toUpperCase().equals(player) && board[k].toUpperCase().equals(player)) {

                                if (magicSquare[i] + magicSquare[j] + magicSquare[k] == 15) {

                                    return true;
                                }
                            }
                            }
                        }
                    }
                }
            }





        return false;
        }

    public static void main(String[] args) throws IOException {
    System.out.println("here");
//    = new String[3][3];
    String[][] oxoinput = {{"O","O","X"},{"X","X","O"},{"X","O"}};
//    System.out.println(oxoinput[][2]);
        Oxo oxogrid = new Oxo(oxoinput);

        if (findWinners(oxogrid,"X")){
            System.out.println("crosses won");
        }
        else if (findWinners(oxogrid,"O")){
            System.out.println("Noughts won");
        }
        else {
            System.out.println("Yet to be decided");
        }
    }
}

