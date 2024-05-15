from datetime import datetime



print("WELCOME TO THE MENSTRUAL CYCLE CALCULATOR")

print("Assumed Length Of Cycle Is Between 21 - 35 Days")

last_flow_date = input("Enter The Date Of Your Last Menstrual Flow(YYYY-MM-DD): ")

cycle_length = int(input("Enter The Average Length Of Your Cycle In Days: "))

next_menstrual_flow = last_flow_date + cycle_length

print("Your Next Menstrual Flow Starts On: ", next_menstrual_flow)

ovulation_date = next_menstrual_flow - 14

print("Your Ovulation Date Is: ", ovulation_date)

fertile_period_start = ovulation_date - 7

fertile_period_end = ovulation_date + 2

print("Your Fertile Period Is Between: ", fertile_period_start, "-" , fertile_period_end)

print("Your Safe Period Is Between: ", safe_period_start, "-" , safe_period_end  )