B = int(input().strip())
discount1 = B * 0.1
discount2 = 100
max_discount = max(discount1, discount2)
amount_to_pay = B - max_discount
print(int(amount_to_pay))

