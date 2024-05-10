
card_number = str(input("Enter A Card Number: "))

def isValid(card_number):

	return (CreditCard.getSize(card_number) == 16 ) and (CreditCard.prefixMatched(card_number, 4) or CreditCard.prefixMatched(card_number, 5) or CreditCard.prefixMatched(number, 6))