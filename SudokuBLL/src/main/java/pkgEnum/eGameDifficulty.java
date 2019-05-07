package pkgEnum;

import java.util.ArrayList;

public enum eGameDifficulty{
	EASY(10), MEDIUM(30), HARD(50);
	
	public static eGameDifficulty[] enumList;
	private final int iDifficulty;
	
	private static java.util.Map<java.lang.Integer,eGameDifficulty> lookup;
	
	
	public int getiDifficulty() {
		return this.iDifficulty;
	}
	public static eGameDifficulty[] values(int iDifficulty) {
		

		for (eGameDifficulty c : eGameDifficulty.values()) {
		    System.out.println(c);
			
		}
		return enumList;
	}
	
	private eGameDifficulty (int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}
	public static eGameDifficulty get(int iDifficulty) {
		eGameDifficulty myEnum = null;
		for (eGameDifficulty c: eGameDifficulty.values()) {
			if (c.iDifficulty <= iDifficulty)
				myEnum = c;
		}
		return myEnum;
	}
	private boolean IsDifficultyMet(int iPossibleValues) {
		int myValues=this.eGameDifficulty.get(iPossibleValues);
		int DIFF= this.eGameDifficulty.iDifficulty;
		
		
		if (myValues == 0) 
			return false;
		
		else if (myValues >= DIFF) {
			return true;
		
			}
		else {
			return false;
		}

	}
	
	private void RemoveCells() throws Exception {
		
	do{
		
		Random randNumGenerator = new Random();
		int randNum1 = randNumGenerator.nextInt(this.iSize) ;
		int randNum2 = randNumGenerator.nextInt(this.iSize);
		this.getPuzzle()[randNum1][randNum2] = 0;
		
		
	}while (IsDifficultyMet(PossibleValuesMultiplier(this.cells)) == false);
}
	
	private static int PossibleValuesMultiplier(HashMap<Integer, Sudoku.SudokuCell> cells) throws Exception {

        Sudoku s = new Sudoku(9);

        fillRemaining(LstRemainingValidValues);

        cells.put(Math.random()*this.iSize*this.iSize, 0);

       

        int multiplier = 1;



        for (int key : cells.keySet()) {

                      try {

                                    if (cells.get(key).getLstRemainingValidValues().size() == 0)

                                                 multiplier *= 1;

                                    else

                                                 multiplier *= cells.get(key).getLstRemainingValidValues().size();

                      } catch (Exception e) {

                                    multiplier = Integer.MAX_VALUE;

                                    break;

                      }

        }           

}
	
}