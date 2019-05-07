package pkgEnum;


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
	public static eGameDifficulty valueOf(java.lang.name) {
		
		if (iDifficulty >= 100 && iDifficulty < 500) {
			return eGameDifficulty.valueOf("EASY");
	}
		else if(iDifficulty >= 500 && iDifficulty < 1000) {
			return eGameDifficulty.valueOf("MEDIUM");
		}
		else if (iDifficulty >= 1000) {
			return eGameDifficulty.valueOf("HARD");
		}
		else 
			return null;
	}
}
