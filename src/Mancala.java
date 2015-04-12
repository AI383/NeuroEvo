class Mancala {
//
//	int[] board;
//	int Bob, Alice, remaining;
//	
//	public Mancala() {
//		board = new int[14];
//		Bob = 0;
//		Alice = 0;
//	}
//	  
////	public void draw(){
////	    print \
////	      "  P1   *6   *5   *4   *3   *2   *1\n" \
////	      "+----+----+----+----+----+----+----+----+\n" \
////	      "|    |"
////	    
////	    @board[0..5].reverse.each do |x|
////	      print "%3s |" % x 
////	    end
////	    
////	    print \
////	      "    |\n" \
////	      "| %2s |----+----+----+----+----+----+ %2s |\n" \
////	      "|    |" % [@player1, @player2]
////	 
////	    @board[6..11].each do |x|
////	      print "%3s |" % x 
////	    end
////	    
////	    print \
////	      "    |\n" \
////	      "+----+----+----+----+----+----+----+----+\n" \
////	      "       *1   *2   *3   *4   *5   *6   P2\n\n"
////	 
////	    STDOUT.flush
////	}
//	  
//	  public int getBob(){ return Bob;}
//	  public int getAlice(){ return Alice;}
//	  public int[] getBoard(){ return board;}
//	  
//	  public boolean gameIsOver(){
//		  	if(remaining==0){
//			      if (Bob > Alice){
//				      System.out.println("Bob won!");
//			      }
//			      else if (Alice > Bob){
//				      System.out.println("Alice won!");
//			      }
//			      else{
//				      System.out.println("It is a tie");
//			      }
//				  return true;
//		  	}
//		  	return false;
//	  }
//			
//	  public void move(player, index, loud = true)
//	    if (player != 1 && player != 2)
//	      if loud
//	        puts "Invalid player number\n\n"
//	      end
//	      return player
//	    end
//	    if (index < 1 || index > 6)
//	      if loud
//	        puts "Invalid cell number\n\n"
//	      end
//	      return player
//	    end
//	    
//	    boardIndex = nil
//	    case player
//	      when 1 then boardIndex =  index - 1
//	      when 2 then boardIndex = index + 5
//	    end
//	      
//	    if (0 == @board[boardIndex])
//	      if loud
//	        puts "Empty cell\n\n"
//	      end
//	      return player
//	    end
//	    
//	    coins = @board[boardIndex]
//	    @board[boardIndex] = 0
//	    
//	    i = 1
//	    lastOneHome = false
//	    
//	    while i <= coins do
//	      boardIndex = (boardIndex + 1) % 12
//	      
//	      # Add one to the player's home or skip over the oponent's home
//	      if 1 == player && 6 == boardIndex then
//	        @player1 += 1
//	        lastOneHome = true
//	        i += 1
//	      elsif 2 == player && 0 == boardIndex then
//	        @player2 += 1
//	        lastOneHome = true
//	        i += 1
//	      end
//	 
//	      if i <= coins # Make sure we still have coints to spare
//	        @board[boardIndex] += 1
//	        lastOneHome = false
//	      end
//	      
//	      i += 1
//	    end
//	    
//	    # Current player has another turn if the last coin was put home.
//	    if lastOneHome
//	      if loud
//	        puts "Another turn for player %d\n\n" % player
//	      end
//	    end
//	    
//	    # If last coin was put in an empty player cell, he takes it and the oponent's cross cell coins.
//	    if 1 == @board[boardIndex]
//	      if 1 == player && boardIndex >= 0 && boardIndex <= 5 then
//	        @player1 += @board[boardIndex] + @board[@crosses[boardIndex]]
//	        @board[boardIndex] = 0
//	        @board[@crosses[boardIndex]] = 0
//	        if loud
//	          puts "Player 1 collected all coins from player 2's cell\n\n"
//	        end
//	      elsif 2 == player && boardIndex >= 6 && boardIndex <= 11 then
//	        @player2 += @board[boardIndex] + @board[@crosses[boardIndex]]
//	        @board[boardIndex] = 0
//	        @board[@crosses[boardIndex]] = 0
//	        if loud
//	          puts "Player 2 collected all coins from player 1's cell\n\n"
//	        end
//	      end
//	    end
//	    
//	    # If the player has no more coins in his cells, he takes everything left on the board.
//	    if 1 == player && 0 == @board[0..5].inject(:+) then
//	      @player1 += @board.inject(:+)
//	      @board = Array.new(12, 0)
//	      if loud
//	        puts "Player 1 cleared his coins and grabbed all of player 2's coins\n\n"
//	      end
//	      return player
//	    elsif 2 == player && 0 == @board[6..11].inject(:+) then
//	      @player2 += @board.inject(:+)
//	      @board = Array.new(12, 0)
//	      if loud
//	        puts "Player 2 cleared his coins and grabbed all of player 1's coins\n\n"
//	      end
//	      return player
//	    end
//	        
//	    return lastOneHome ? player : (1 == player ? 2 : 1)
//	    
//	  end
//	  
//	  # Run a single game
//	  def play(p1, p2)
//	    players = [p1, p2]
//	    turn = rand(2)
//	    
//	    puts "Player #%d was randomly chosen to start\n\n" % (turn + 1)
//	    
//	    until gameIsOver
//	      draw
//	      cell = players[turn].play(self.clone)
//	      nextTurn = move(turn + 1, cell)
//	      turn = nextTurn - 1
//	    end
//	    
//	    draw
//	  end
//	  
//	end
//	 
//	 
//	class MancalaHuman
//	  
//	  def initialize(num)
//	    @playerNumber = num
//	  end
//	  
//	  def play(m)
//	    print "Player #%d, please enter the cell you want to play with (1..6): " % @playerNumber
//	    return gets.chomp.to_i
//	  end
//	  
//	end
//	 
//	class MancalaAI
//	  
//	  def initialize(num)
//	    @playerNumber = num
//	  end
//	 
//	  def play(m)
//	    # Figure out which side you're on.
//	    if 1 == @playerNumber then
//	      scoreMethod = 'getPlayer1'
//	      boardIndex = 0
//	    else
//	      scoreMethod = 'getPlayer2'
//	      boardIndex = 6
//	    end
//	 
//	    currentScore = m.method(scoreMethod).call
//	    currentBoard = m.getBoard[boardIndex..(boardIndex+5)]
//	    currentTotal = currentBoard.inject(:+)
//	    
//	    resultScore = Array.new(6, nil)
//	    for i in (boardIndex..boardIndex+5)
//	      if currentBoard[i] > 0
//	        mClone = Marshal.load(Marshal.dump(m))
//	        rIndex = i - boardIndex        
//	        resultScore[rIndex] = 0
//	        turn = mClone.move(@playerNumber, rIndex+1, false)
//	        if (turn == @playerNumber)
//	          resultScore[rIndex] += 10
//	        end
//	        
//	        total = mClone.getBoard[boardIndex..(boardIndex+5)].inject(:+)
//	        resultScore[rIndex] += (currentTotal - total)
//	      end
//	    end
//	    
//	    key = 1
//	    maxScore = -1
//	    maxKey = -1
//	    resultScore.each do |score|
//	      if score != nil && score > maxScore
//	        maxScore = score
//	        maxKey = key
//	      end
//	      key += 1
//	    end
//	    
//	    puts "Computer plays cell #%d\n\n" % maxKey
//	    
//	    return maxKey
//	  end
//	  
//	end
//	 
//	type = 0
//	while type != 1 && type != 2
//	  puts \
//	    "Welcome to Mancala! You will be player #2 (at the bottom).\n" \
//	    "Please select a human or computer oponent to be player #1:\n\n" \
//	    "1. Human\n" \
//	    "2. Computer\n"
//	    
//	  type = gets.chomp.to_i
//	  puts "\n"
//	end
//	 
//	if 1 == type
//	  Mancala.new.play(MancalaHuman.new(1), MancalaHuman.new(2))
//	else
//	  Mancala.new.play(MancalaAI.new(1), MancalaHuman.new(2))
//	end
//
//  }
    
}
