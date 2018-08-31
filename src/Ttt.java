

/**
 * This program generates a 4x4x4 grid for tic tac toe, and it plays along with the user. It blocks the user from win situations
 * while creatings wins for itself.
 * Authors: Vishal Vaddadhi
 */
import java.util.Random;
import java.util.Scanner;

public class Ttt {
	public static void main(String[] args) {
		Random rand = new Random();
		int board[][][]= new int [4][4][4];
		printBoard(board);
		do{
		userInput(board);
		compInput(rand, board);
		printBoard(board);
		}while(!checkWin(board));
		
	}

	public static void compInput(Random rand, int[][][] board) {
		int count=0;
		//1
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[i][j][0]==0){
							board[i][j][0]=1;
							return;
						}
						if (board[i][j][1]==0){
							board[i][j][1]=1;
							return;
						}
						if (board[i][j][2]==0){
							board[i][j][2]=1;
							return;
						}
						if (board[i][j][3]==0){
							board[i][j][3]=1;
							return;
						}
					}
				}
			}
		}
		//2
		for(int i=0; i<4;i++){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[i][0][k]==0){
							board[i][0][k]=1;
							return;
						}
						if (board[i][1][k]==0){
							board[i][1][k]=1;
							return;
						}
						if (board[i][2][k]==0){
							board[i][2][k]=1;
							return;
						}
						if (board[i][3][k]==0){
							board[i][3][k]=1;
							return;
						}
					}
				}
			}
		}
		//3
		for(int k=0; k<4;k++){	
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int i=0; i<4;i++){
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[0][j][k]==0){
							board[0][j][k]=1;
							return;
						}
						if (board[1][j][k]==0){
							board[1][j][k]=1;
							return;
						}
						if (board[2][j][k]==0){
							board[2][j][k]=1;
							return;
						}
						if (board[3][j][k]==0){
							board[3][j][k]=1;
							return;
						}
					}
				}
			}
		}
		//4
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					j=k;
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[i][0][0]==0){
							board[i][0][0]=1;
							return;
						}
						if (board[i][1][1]==0){
							board[i][1][1]=1;
							return;
						}
						if (board[i][2][2]==0){
							board[i][2][2]=1;
							return;
						}
						if (board[i][3][3]==0){
							board[i][3][3]=1;
							return;
						}
					}
				}
			
			}
		}
		//5
		for(int i=0; i<4;i++){
			count=0;
			for(int j=3; j>=0;j--){
				count=0;
				for (int k=0; k<4;k++){
					j=3-k;
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[i][3][0]==0){
							board[i][3][0]=1;
							return;
						}
						if (board[i][2][1]==0){
							board[i][2][1]=1;
							return;
						}
						if (board[i][1][2]==0){
							board[i][1][2]=1;
							return;
						}
						if (board[i][0][3]==0){
							board[i][0][3]=1;
							return;
						}
					}
				}
			
			}
		}
		//6
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					i=k;
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[0][j][0]==0){
							board[0][j][0]=1;
							return;
						}
						if (board[1][j][1]==0){
							board[1][j][1]=1;
							return;
						}
						if (board[2][j][2]==0){
							board[2][j][2]=1;
							return;
						}
						if (board[3][j][3]==0){
							board[3][j][3]=1;
							return;
						}
					}
				}
			
			}
		}
		//7
		for(int i=3; i>=0;i--){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					i=3-k;
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[3][j][0]==0){
							board[3][j][0]=1;
							return;
						}
						if (board[2][j][1]==0){
							board[2][j][1]=1;
							return;
						}
						if (board[1][j][2]==0){
							board[1][j][2]=1;
							return;
						}
						if (board[0][j][3]==0){
							board[0][j][3]=1;
							return;
						}
					}
				}
			
			}
		}
		//8
		for(int i=0; i<4;i++){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					i=j;
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[0][0][k]==0){
							board[0][0][k]=1;
							return;
						}
						if (board[1][1][k]==0){
							board[1][1][k]=1;
							return;
						}
						if (board[2][2][k]==0){
							board[2][2][k]=1;
							return;
						}
						if (board[3][3][k]==0){
							board[3][3][k]=1;
							return;
						}
					}
				}
			
			}
		}
		//9
		for(int i=3; i>=0;i--){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					i=3-j;
					if (board[i][j][k]==5)
						count++; 
					if(count==3){
						if (board[0][3][k]==0){
							board[0][3][k]=1;
							return;
						}
						if (board[1][2][k]==0){
							board[1][2][k]=1;
							return;
						}
						if (board[2][1][k]==0){
							board[2][1][k]=1;
							return;
						}
						if (board[3][0][k]==0){
							board[3][0][k]=1;
							return;
						}
					}
				}
			
			}
		}
		//1 (looking for 3 Circles in a Row)
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[i][j][0]==0){
							board[i][j][0]=1;
							return;
						}
						if (board[i][j][1]==0){
							board[i][j][1]=1;
							return;
						}
						if (board[i][j][2]==0){
							board[i][j][2]=1;
							return;
						}
						if (board[i][j][3]==0){
							board[i][j][3]=1;
							return;
						}
					}
				}
			}
		}
		//2 
		for(int i=0; i<4;i++){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[i][0][k]==0){
							board[i][0][k]=1;
							return;
						}
						if (board[i][1][k]==0){
							board[i][1][k]=1;
							return;
						}
						if (board[i][2][k]==0){
							board[i][2][k]=1;
							return;
						}
						if (board[i][3][k]==0){
							board[i][3][k]=1;
							return;
						}
					}
				}
			}
		}
		//3
		for(int k=0; k<4;k++){	
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int i=0; i<4;i++){
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[0][j][k]==0){
							board[0][j][k]=1;
							return;
						}
						if (board[1][j][k]==0){
							board[1][j][k]=1;
							return;
						}
						if (board[2][j][k]==0){
							board[2][j][k]=1;
							return;
						}
						if (board[3][j][k]==0){
							board[3][j][k]=1;
							return;
						}
					}
				}
			}
		}
		//4
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					j=k;
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[i][0][0]==0){
							board[i][0][0]=1;
							return;
						}
						if (board[i][1][1]==0){
							board[i][1][1]=1;
							return;
						}
						if (board[i][2][2]==0){
							board[i][2][2]=1;
							return;
						}
						if (board[i][3][3]==0){
							board[i][3][3]=1;
							return;
						}
					}
				}
			
			}
		}
		//5
		for(int i=0; i<4;i++){
			count=0;
			for(int j=3; j>=0;j--){
				count=0;
				for (int k=0; k<4;k++){
					j=3-k;
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[i][3][0]==0){
							board[i][3][0]=1;
							return;
						}
						if (board[i][2][1]==0){
							board[i][2][1]=1;
							return;
						}
						if (board[i][1][2]==0){
							board[i][1][2]=1;
							return;
						}
						if (board[i][0][3]==0){
							board[i][0][3]=1;
							return;
						}
					}
				}
			
			}
		}
		//6
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					i=k;
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[0][j][0]==0){
							board[0][j][0]=1;
							return;
						}
						if (board[1][j][1]==0){
							board[1][j][1]=1;
							return;
						}
						if (board[2][j][2]==0){
							board[2][j][2]=1;
							return;
						}
						if (board[3][j][3]==0){
							board[3][j][3]=1;
							return;
						}
					}
				}
			
			}
		}
		//7
		for(int i=3; i>=0;i--){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					i=3-k;
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[3][j][0]==0){
							board[3][j][0]=1;
							return;
						}
						if (board[2][j][1]==0){
							board[2][j][1]=1;
							return;
						}
						if (board[1][j][2]==0){
							board[1][j][2]=1;
							return;
						}
						if (board[0][j][3]==0){
							board[0][j][3]=1;
							return;
						}
					}
				}
			
			}
		}
		//8
		for(int i=0; i<4;i++){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					i=j;
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[0][0][k]==0){
							board[0][0][k]=1;
							return;
						}
						if (board[1][1][k]==0){
							board[1][1][k]=1;
							return;
						}
						if (board[2][2][k]==0){
							board[2][2][k]=1;
							return;
						}
						if (board[3][3][k]==0){
							board[3][3][k]=1;
							return;
						}
					}
				}
			
			}
		}
		//9
		for(int i=3; i>=0;i--){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					i=3-j;
					if (board[i][j][k]==1)
						count++; 
					if(count==3){
						if (board[0][3][k]==0){
							board[0][3][k]=1;
							return;
						}
						if (board[1][2][k]==0){
							board[1][2][k]=1;
							return;
						}
						if (board[2][1][k]==0){
							board[2][1][k]=1;
							return;
						}
						if (board[3][0][k]==0){
							board[3][0][k]=1;
							return;
						}
					}
				}
			
			}
		}
		int x=rand.nextInt(3);
		int y=rand.nextInt(3);
		int z=rand.nextInt(3);
		while(board[x][y][z]==1||board[x][y][z]==5){
			x=rand.nextInt(3);
			y=rand.nextInt(3);
			z=rand.nextInt(3);
		}
		board[x][y][z]=1;
	
	}
				
			
		
	
	
	public static boolean checkWin(int[][][] board){
		int count = 0;
		//1 
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			}
		}
		//2 
		for(int i=0; i<4;i++){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			}
		}
		//3
		for(int k=0; k<4;k++){	
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int i=0; i<4;i++){
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			}
		}
		//4
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					j=k;
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			
			}
		}
		//5
		for(int i=0; i<4;i++){
			count=0;
			for(int j=3; j>=0;j--){
				count=0;
				for (int k=0; k<4;k++){
					j=3-k;
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			
			}
		}
		//6
		for(int i=0; i<4;i++){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					i=k;
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			
			}
		}
		//7
		for(int i=3; i>=0;i--){
			count=0;
			for(int j=0; j<4;j++){
				count=0;
				for (int k=0; k<4;k++){
					i=3-k;
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			
			}
		}
		//8
		for(int i=0; i<4;i++){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					i=j;
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			
			}
		}
		//9
		for(int i=3; i>=0;i--){
			count=0;
			for(int k=0; k<4;k++){
				count=0;
				for (int j=0; j<4;j++){
					i=3-j;
					if (board[i][j][k]==1)
						count++; 
					if(count==4){
						return true;
					}
				}
			
			}
		}
		return false;
	}

	
	public static void printBoard(int[][][] board) {
		for (int i =3; i>=0; i--){
			System.out.println();
			for (int j = 3; j>=0;j--){
				System.out.print(i);
				System.out.print(j);
				for (int k = 0; k<4; k++){
					if(board[i][j][k]==5)
						System.out.print(" X");
					else if (board[i][j][k]==1)
						System.out.print(" O");
					else
						System.out.print(" -");
				}
				System.out.println();
			}
		}
	}

	public static void userInput(int[][][] board) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int z = n%10;
        n = n/10;
        int y = n%10;
        n = n/10;
        int x = n%10;
        checkError(x,y,z,board);
		board[x][y][z]=5;
		
	}
	public static void checkError(int x, int y, int z, int[][][] board){
		if (board[x][y][z]==5 || board[x][y][z]==1){
			System.out.println("That spot is taken. Try Another three digit number");
			userInput(board);
		}

	}
	
}
