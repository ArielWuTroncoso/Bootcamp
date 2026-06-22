const prompt=require("prompt-sync")();

let nombre= prompt("¿Cuál es tú nombre? ")
let jobname= prompt("¿Cuál es tu puesto de trabajo? ")
let firstadjetive= prompt("¿Cómo ha sido el grupo? ")
let secondtadjetive= prompt("¿Cómo ha sido tú profes@r? ")
let firstfood= prompt("¿Que comes cómo comida principal? ")
let secondfood= prompt("¿Que comes cómo comida secundaria? ")
let afeeling= prompt("¿Cómo te sientes al repasar tus estudios? ")

console.log(``<nombre>` started their first Generation course today. They are training as a `<jobname>`. They found their cohort to be very `<firstadjetive>` but their teacher was, at least, `<secondtadjetive>`. For lunch they have `<firstfood>` and `<secondfood>` while reviewing their notes. They feel `<afeeling>` but are determined to complete the course.`)