final int BOY = 1;
final int GIRL = 2;
for (int simulations = 1; simulations <= MAX_SIMS; simulations++) { //runs simulation 10x
    final int WOMEN = 10000;
    int currWomen = 0;
    int boyCount = 0;
    int girlCount = 0;
    while (currWomen < WOMEN) { //Limits women to 10,000
        
        int answer = rn.nextInt(2) + 1;
        while (answer == BOY) {
            boyCount++;
            answer = rn.nextInt(2) + 1; //Creates another random int 1 or 2
            
        } 
        if (answer == GIRL) {
            girlCount++;
            currWomen++; //Moves on to next Women
        }
       

    }
<SNIP>