from datetime import datetime, timedelta



print("WELCOME TO THE MENSTRUAL CYCLE CALCULATOR")

print("Assumed Length Of Cycle Is Between 21 - 35 Days")

last_flow_date = input("Enter The Date Of Your Last Menstrual Flow(DD-MM-YYYY): ")

last_flow_date = datetime.strptime(last_flow_date, "%d-%m-%Y")

cycle_length = int(input("Enter The Average Length Of Your Cycle In Days: "))

next_menstrual_flow = last_flow_date + timedelta(days=cycle_length)

print("Your Next Menstrual Flow Starts On: ", next_menstrual_flow.strftime("%d-%m-%Y"))

ovulation_date = next_menstrual_flow - timedelta(days=14)

print("Your Ovulation Date Is: ", ovulation_date.strftime("%d-%m-%Y"))

fertile_period_start = ovulation_date - timedelta(days=7)

fertile_period_end = ovulation_date + timedelta(days=2)

print("Your Fertile Period Is Between: ", fertile_period_start.strftime("%d-%m-%Y"), "-", fertile_period_end.strftime("%d-%m-%Y") )

safe_period_start = ovulation_date + timedelta(days=5)

safe_period_end = next_menstrual_flow - timedelta(days=5)

print("Your Safe Period Is Between: ", safe_period_start.strftime("%d-%m-%Y"), "-" , safe_period_end.strftime("%d-%m-%Y"))