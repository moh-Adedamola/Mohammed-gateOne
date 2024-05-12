from datetime import date

def calculate_age(birthdate):

	current_date = datetime.now()

	birthdate = datetime.strftime(birthdate, %d/%m/%Y)

	age = current_date.year - birthdate.year 

	
	return age

