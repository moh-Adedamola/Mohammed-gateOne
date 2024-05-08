sum = 0



for numbers in range(1,11):


	scores = int(input('Enter A Score: '))

		
	if (numbers % 2 == 0):

		sum += numbers;

	
print("The sum of The Even Indexes Is: " + str(sum))
