function gradingStudents(grades) {
    for(let i=0; i< grades.length; i++){
        if(grades[i]< 38){
            continue;
        }
        let individualGrade = grades[i];
        individualGrade = Math.ceil(individualGrade/5)* 5;
        if(individualGrade - grades[i]< 3){
            grades[i] = individualGrade;
        }
    }
    console.log(grades);
    return grades;
}


gradingStudents([73,67,38,33]);