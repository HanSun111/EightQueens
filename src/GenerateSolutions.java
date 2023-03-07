import java.util.Arrays;
public class GenerateSolutions {
    private String[][] stuff;
    private int numOfSolutions;

    public GenerateSolutions(int numOfRC) {
        stuff = new String[numOfRC][numOfRC];
        setStuff();
    }

    public String[][] getStuff() {
        return stuff;
    }

    public void Queens() {
        // setting the queen in the first row, 0 to last index
        for (int i = 0; i < stuff.length; i++) {
            stuff[0][i] = "Q";

        }
    }

    // sets every item in 2D Array to space.
    public void setStuff() {
        for (int i = 0; i < stuff.length; i++) {
            for (int j = 0; j < stuff.length; j++) {
                stuff[i][j] = " ";
            }
        }
    }

    public void QueensPaths() {
        //no queen on same row
        for(int i = 0; i < stuff.length; i++){
            if(!stuff[0][i].equals("Q")){
                stuff[0][i] = "-";
            }
        }
        // no queen on same column
        for(int i = 0; i < stuff.length - 1; i++){
            if(stuff[0][i].equals("Q")){
                int n = i;
                stuff[i + 1][n] = "-";
            }
        }
        // no queen diagonal CODE IT


    }

    // checks every row for a queen... unfinished
    public boolean CheckForQueen() {
        int QueenNum = 0;
        for (int i = 0; i < stuff.length; i++) {
            for (int j = 0; j < stuff.length; j++) {
                if (stuff[i][j].equals("Q")) {
                    QueenNum++;
                }
            }
        }
    }


}