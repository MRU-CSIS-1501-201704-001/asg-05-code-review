do{
    double nextGPA = keyboard.nextDouble();
    if(nextGPA >= HONOURS_THRESHOLD){
        honoursTally = honoursTally + "*"; 
    }
    if(nextGPA < HONOURS_THRESHOLD && nextGPA >= PASS_THRESHOLD){
        passTally = passTally + "*";
    }
    if(nextGPA < PASS_THRESHOLD){
        failTally = failTally + "*";
    }

    numStudents -= 1;
}while(numStudents > 0);