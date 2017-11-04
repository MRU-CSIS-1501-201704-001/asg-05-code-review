if (numStudents <= 0){
    System.out.println ("It is not possible to have that number of students.");
    return;
}

for (int numStudentCounter = 1; numStudentCounter <= numStudents; numStudentCounter++){
    double studentGPA = kbd.nextDouble ();
    if (studentGPA >= HONOURS_LOWER_LIMIT) {
        numHonoursStudents ++;
    }
    else if (studentGPA < FAIL_UPPER_LIMIT) {
        numFailStudents ++;
    }
    else {
        numPassStudents ++;
    }
}