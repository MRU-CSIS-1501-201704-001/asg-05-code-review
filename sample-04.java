final int LAST_SIM = 10;
final int MAX_WOMEN = 10000;
int simulationNum;

System.out.print("Run#  M : F");        
for(simulationNum = 1; simulationNum <= LAST_SIM; simulationNum++){
    
    int maleCounter = 0;
    System.out.printf("%n%4d%3d : ", simulationNum, 1);
    for(int numBirths = 1; numBirths <= MAX_WOMEN; numBirths++){
        int baby = randomGenerator.nextInt(2);
        //Male = 0, Female = 1
        while(baby == 0){
            maleCounter++;
            baby = randomGenerator.nextInt(2);
            
        }
