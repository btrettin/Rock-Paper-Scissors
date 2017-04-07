
public enum Move {
		Rock, Paper, Scissors;
	public int compareMoves(Move otherMove){
		if (this == otherMove)
			return 0;
		switch (this){
		case Rock:
			if(otherMove==Rock) {
				return 0;
			} else if(otherMove==Paper) {
				return -1;
			} else if(otherMove==Scissors) {
				return 1;
			}
			//return (otherMove == Scissors ? 1 : -1);
		case Paper:
			if(otherMove==Rock) {
				return 1;
			} else if(otherMove==Paper) {
				return 0;
			} else if(otherMove==Scissors) {
				return -1;
			}
			
		case Scissors:
			if(otherMove==Rock) {
				return -1;
			} else if(otherMove==Paper) {
				return 1;
			} else if(otherMove==Scissors) {
				return 0;
			}
		}
		return 0;
	}

}
