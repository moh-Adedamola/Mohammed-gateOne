sum = 0

average = 0;


for score in range(1,11):

	scores = int(input('Enter A Score: '))

	sum += score;

	average = sum / scores

print("Average Of The Scores Is: " + str(average))