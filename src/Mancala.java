import  java.io.*;
class  MancalaGame  {
  
	MancalaGame(String  name0,  String  name1)  {
        board  =  new MancalaBoard();
        board.setUpForPlay();
        players  =  new Player[2];
        players[0]  =  new Player(name0,  0);
        players[1]  =  new Player(name1,  1);
        currentPlayer  =  0;
    }

    public  void play()  throws  IOException  {
      displayBoard();
      while  (!board.gameOver())  {
        int  pitNum  =  players[currentPlayer].selectAMove(board);
		    boolean  goAgain=board.doTheMove(currentPlayer, pitNum);

  			System.out.println(players[currentPlayer].getName()+" moved  from  "  +  pitNum);
  			displayBoard();
  			if(!goAgain){
    			if(currentPlayer == 0){
    				currentPlayer  =  1;
    			}
    			else{
    				currentPlayer  =  0;
    			}
  			}
    		else{
    			System.out.println(players[currentPlayer].getName()+"  goes  again");
  			}
  		}
  		board.emptyStonesIntoMancalas();
  		displayBoard();
  		if(board.stonesInMancala(0) >board.stonesInMancala(1))
  		  System.out.println(players[0].getName()+"  wins");
  		else if (board.stonesInMancala(0)<board.stonesInMancala(1))
  			System.out.println(players[1].getName()+"  wins");
  		else
  			System.out.println("Tie");
  	}

    private  void  displayBoard()  {
        String  mancalaLineFiller  =  "";
        
        //displaying top player
        System.out.println("-----------------------");
        System.out.print("| ");
        for  (int  i  =  1;  i  <= board.playingPits;  i++)  {
           System.out.print("\u001b[1;32m"+board.stonesInPit(1,  i)+"\u001b[0m | ");
        }
        
        System.out.println("\t"+"("+players[1].getName()+")");
        
        //displaying scores
        System.out.print(board.stonesInMancala(1)+"-----------------------");
        System.out.println(board.stonesInMancala(0));
        
        //displaying bottom player
        System.out.print("| ");
        for  (int  i  =  board.playingPits; i  >=  1;  i--)
           System.out.print("\u001b[1;31m"+board.stonesInPit(0,  i)+"\u001b[0m | ");
           
        System.out.println("\t"+"("+players[0].getName()+")");
        
        System.out.println("-----------------------");
        
        System.out.print("  ");
        for  (int  i  =  board.playingPits; i  >=  1;  i--)
           System.out.print(i+" | ");
    }

    public  static  void  main(String  []  args)  throws IOException  {
		  MancalaGame  game  =  new  MancalaGame("MAX",  "GORDON");
		  game.play();
    }

    int  currentPlayer  =  0;
    MancalaBoard  board;
    Player  []  players;
}