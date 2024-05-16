from datetime import datetime

counter = 0
total = 1
sub_total = 0
quantity = []
items = []
price = []
grand_total = []

print("WELCOME TO SEMICOLON STORES")

customer_name = input("\nWhat is the customer's Name? ")

user_response = ""

today = datetime.today()

while user_response != "no":
	item_bought = input("What did the user buy? ")
	number_of_pieces = int(input("How many pieces of goods? "))
	price_per_unit = int(input("How much per unit? "))
	user_response = input("Add more items? (yes/no) ")

	total = number_of_pieces * price_per_unit

	cashier_name = input("What is your name? ")

	discount_given = int(input("How much discount will they get? "))

	print("SEMICOLON STORES")

	print("MAIN BRANCH")

	print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABO, LAGOS")

	print("TEL: 03293828343")

	print(today)

	print("Cashier:", cashier_name)

	print("Customer's Name:", customer_name)

	print("=================================")

	print("ITEM \t QTY \t PRICE \t  TOTAL")

	print("----------------------------------")

	for counter in range(len(items)):
        	print(items[counter], "\t", quantity[counter], "\t", price[counter], "\t", totals[counter])
        	sub_total += totals[counter]

	discount = discount_given * sub_total / 100

	vat = 17.50 / 100 * sub_total

	bill_total = sub_total + discount + vat

	print("--------------------------------------")

	print("\tSub Total:\t", sub_total)

	print("\tDiscount:\t", discount)

	print("\tVAT @17.50:\t", vat)

	print("--------------------------------------")

	print("\tBill Total:\t", bill_total)

	print("=================================")

	print("THIS IS NOT A RECEIPT, KINDLY PAY", bill_total)

	print("=================================")

	amount_paid = float(input("How much did the customer give to you? "))

	balance = bill_total - amount_paid

	print("SEMICOLON STORES")

	print("MAIN BRANCH")

	print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABO, LAGOS")

	print("TEL: 03293828343")

	print(today)

	print("Cashier:", cashier_name)

	print("Customer's Name:", customer_name)

	print("=================================")

	print("ITEM \t QTY \t PRICE \t  TOTAL")

	print("----------------------------------")

	print("--------------------------------------")

	print("\tSub Total:\t", sub_total)

	print("\tDiscount:\t", discount)

	print("\tVAT @17.50:\t", vat)

	print("--------------------------------------")

	print("\tBill Total:\t", bill_total)

	print("\tAmount Paid:\t", amount_paid)

	print("\tBalance:\t", balance)

	print("=================================")

	print("THANK YOU FOR YOUR PATRONAGE")

	print("=================================")

	

	

	

	

	

	



	

