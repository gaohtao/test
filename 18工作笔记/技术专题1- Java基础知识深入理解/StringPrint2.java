package test;

public class StringPrint {

	public static char[][] strH = { 
		{ '*', ' ', ' ', '*'  }, 
		{ '*', ' ', ' ', '*'  }, 
		{ '*', '*', '*', '*'  }, 
		{ '*', ' ', ' ', '*'  }, 
		{ '*', ' ', ' ', '*'  } };
	public static int[][] strE = { 
		{ '*', '*', '*', '*'  }, 
		{ '*', ' ', ' ', ' '  }, 
		{ '*', '*', '*', '*'  }, 
		{ '*', ' ', ' ', ' '  }, 
		{ '*', '*', '*', '*'  } };
	public static int[][] strL = { 
		{ '*', ' ', ' ', ' '  }, 
		{ '*', ' ', ' ', ' '  }, 
		{ '*', ' ', ' ', ' '  }, 
		{ '*', ' ', ' ', ' '  }, 
		{ '*', '*', '*', '*'  } };
	public static int[][] strO = { 
		{ ' ', '*', '*', ' '  }, 
		{ '*', ' ', ' ', '*'  }, 
		{ '*', ' ', ' ', '*'  }, 
		{ '*', ' ', ' ', '*'  }, 
		{ ' ', '*', '*', ' '  } };

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

	public static void printCharacter(char ch) {
		char[][] charray = null;
		
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
					System.out.print(charray[i][j]);								
			}
			System.out.println();
		}
	}

}
