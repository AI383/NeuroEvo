
import java.io.*;

class  MancalaBoard  {
  
    MancalaBoard()  {
      pits  =  new  Pit[totalPits];
      for  (int  pitNum  =  0;  pitNum  <  totalPits; pitNum++)
			  pits[pitNum]  =  new Pit();
    }

    public  void  setUpForPlay()  {
        for  (int  pitNum  =  0;  pitNum  <  totalPits; pitNum++)
          if  (!isAMancala(pitNum))
            pits[pitNum].addStones(4);
    }

//GETTERS------------------------------------------------------------------------
    public  int  stonesInMancala(int  playerNum)  {return  pits[getMancala(playerNum)].getStones();}
    public  int  stonesInPit(int  playerNum, int pitNum)  {return  pits[getPitNum(playerNum, pitNum)].getStones();}
    private  int  getPitNum(int  playerNum, int  pitNum) {return  playerNum  *  (playingPits+1)  +  pitNum;}
    private  int  getMancala(int  playerNum)  {return  playerNum  *  (playingPits+1);}
    private  boolean  isAMancala(int  pitNum)  {return  pitNum  %  (playingPits+1)  ==  0;}
  	private  int  ownerOf(int  pitNum)  {return  pitNum  /  (playingPits+1);}
  	private  int  oppositePitNum(int  pitNum)  {return  totalPits  -  pitNum;}
  	private  int  otherPlayerNum(int  playerNum)  {
  		if  (playerNum  ==  0)return  1;
  		else return  0;
  	}

    public  MancalaBoard  makeACopy()  {
        MancalaBoard  newBoard  =  new  MancalaBoard();
        for  (int  pitNum  =  0;  pitNum  <  totalPits; pitNum++)
           newBoard.pits[pitNum].addStones(this.pits[pitNum].getStones());
        return  newBoard;
    }

    public  boolean  doTheMove(int  currentPlayerNum, int  chosenPitNum)  {
		  int  pitNum  =  getPitNum(currentPlayerNum, chosenPitNum);
        int  stones  =  pits[pitNum].removeStones();
        while  (stones  !=  0)  {
           pitNum--;
           if  (pitNum  <  0)
                   pitNum  =  totalPits  -  1;
           if  (pitNum  !=
           getMancala(otherPlayerNum(currentPlayerNum)))  {
               pits[pitNum].addStones(1);
               stones--;
               }
        }
        if  (pitNum  ==  getMancala(currentPlayerNum))
           return  true;
        if  (ownerOf(pitNum)  ==  currentPlayerNum  &&
               pits[pitNum].getStones()  ==  1)  {
			stones  =  pits[oppositePitNum(pitNum)].removeStones();
			pits[getMancala(currentPlayerNum)].addStones(stones);
        }
	    return false;
	}

	public  boolean  gameOver()  {
		for  (int  player  =  0;  player  <  2;  player++)  {
	        int  stones  =  0;
		    for  (int  pitNum  =  1;  pitNum  <=  playingPits; pitNum++)
				stones  +=  pits[getPitNum(player, pitNum)].getStones();
			if  (stones  ==  0)
               return  true;
        }
        return  false;
    }

    public  void  emptyStonesIntoMancalas()  {
        for  (int  player  =  0;  player  <  2;  player++)
           for  (int  pitNum  =  0;  pitNum  <=  playingPits;  pitNum++)  {
               int  stones  =  pits[getPitNum(player,
                                 pitNum)].removeStones();
                                 pits[getMancala(player)].
                                 addStones(stones);
           }
    }

    Pit  []  pits;
    static  final  int  playingPits=6,
                          totalPits  =  2*(playingPits+1);
}

class  Pit  {
    Pit()  {this.stones  =  0;}
    public  int  getStones()  {return  stones;}
    public  void  addStones(int  stones) {this.stones += stones;}
    public  boolean  isEmpty() {return stones == 0;}
    public  int  removeStones() {
        int  stones  =  this.stones;
        this.stones  =  0;
        return  stones;
    }
    int  stones;
}

class  Player  {
    Player(String  name,  int  playerNum)  {
        this.name  =  name;
        this.playerNum  =  playerNum;
    }

    public  String  getName()  {
           return  name;
    }

    public  int  getPlayerNum()  {
        return  this.playerNum;
    }

//=====REPLACE WITH AI======================================================

    public  int  selectAMove(MancalaBoard board)   throws IOException  {

    // Computer player - need to determine best move
    int  bestMove  =  -1;
    int  repeatMove  =  -1;
    int  maxNewStones  =  -1;
    
    // Trying the possible moves
    for  (int  pitNum  =  1;  pitNum  <=
          board.playingPits;  pitNum++)  {
        if  (board.stonesInPit(playerNum, pitNum)  !=  0)  {
			MancalaBoard  testBoard  =  board.makeACopy();
			boolean  goAgain  =testBoard.doTheMove(playerNum, pitNum);
			if (goAgain) repeatMove  =  pitNum;
			int newStones  = testBoard.stonesInMancala(playerNum)  - board.stonesInMancala(playerNum);
			if(newStones  >  maxNewStones) {
                   maxNewStones = newStones;
                   bestMove  =  pitNum;
               }
           }
        }
        
        if  (maxNewStones  >  1)
			return  bestMove;
        else  if  (repeatMove  !=  -1)
			return  repeatMove;
        else
			return  bestMove;
    }
//==========================================================================


    String  name;
    int  playerNum;
}
