package test;

public class StringPrint {

	public static int[][] strH = { 
		{ 1, 0, 0, 1 }, 
		{ 1, 0, 0, 1 }, 
		{ 1, 1, 1, 1 }, 
		{ 1, 0, 0, 1 }, 
		{ 1, 0, 0, 1 } };
	public static int[][] strE = { 
		{ 1, 1, 1, 1 }, 
		{ 1, 0, 0, 0 }, 
		{ 1, 1, 1, 1 }, 
		{ 1, 0, 0, 0 }, 
		{ 1, 1, 1, 1 } };
	public static int[][] strL = { 
		{ 1, 0, 0, 0 }, 
		{ 1, 0, 0, 0 }, 
		{ 1, 0, 0, 0 }, 
		{ 1, 0, 0, 0 }, 
		{ 1, 1, 1, 1 } };
	public static int[][] strO = { 
		{ 0, 1, 1, 0 }, 
		{ 1, 0, 0, 1 }, 
		{ 1, 0, 0, 1 }, 
		{ 1, 0, 0, 1 }, 
		{ 0, 1, 1, 0 } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printString("HELLO");
	}

	public static void printString(String str) {
		// 分解字符串的每一个字母，分别打印
		char[] array = str.toCharArray();
		for (char ch : array) {
			//System.out.print(ch);
			printCharacter(ch);
		}
	}

	public static void printCharacter(char ch, char print) {
		int[][] charray = null;
		
		switch (ch) {
		case 'H':
			charray = strH;
			break;
		case 'E':
			charray = strE;
			break;
		case 'L':
			charray = strL;
			break;
		case 'O':
			charray = strO;
			break;
		default:
			break;
		}
		
		for(int i=0;i<charray.length;i++){
			for(int j=0;j<charray[i].length;j++){
				if(charray[i][j]==0){
					System.out.print(" ");
				}else{
					System.out.print(print);
				}					
			}
			System.out.println();
		}
	}

}
