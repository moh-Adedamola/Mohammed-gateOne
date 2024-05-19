const prompt = require("prompt-sync")();

console.log("WELCOME TO THE MENSTRUAL CYCLE CALCULATOR");

console.log();

console.log("Assumed Length Of Cycle Is Between 21 - 35 Days");

console.log();

const lastFlowDate = prompt("Enter The Date Of Your Last Menstrual Flow (DD-MM-YYYY): ");

const cycleLength = parseInt(prompt("Enter The Average Length Of Your Cycle In Days: "));

const lastFlowDatePeriod = new Date(lastFlowDate);

const nextMenstrualFlow = new Date(lastFlowDatePeriod.getTime() + cycleLength );

console.log("Your Next Menstrual Flow Starts On: " + nextMenstrualFlow.toLocaleDateString());

const ovulationDate = new Date(nextMenstrualFlow.getTime() - 14 );

console.log("\nYour Ovulation Date Is: " + ovulationDate.toLocaleDateString() + "\n");

const fertilePeriodStart = new Date(ovulationDate.getTime() - 7 );

const fertilePeriodEnd = new Date(ovulationDate.getTime() + 2 );

console.log("Your Fertile Period Is Between : " + fertilePeriodStart.toLocaleDateString() + " - " + fertilePeriodEnd.toLocaleDateString() + "\n");

const safePeriodStart = new Date(ovulationDate.getTime() + 5 );

const safePeriodEnd = new Date(nextMenstrualFlow.getTime() - 5 );

console.log("Your Safe Period Is Between: " + safePeriodStart.toLocaleDateString() + " - " + safePeriodEnd.toLocaleDateString());

