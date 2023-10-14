def fact(q):
    if (q ==0 or q==1):
        return 1
    else :
        return fact((q-1)*q)
    a=int(input("Enter the No"))
    
result = fact(a)
print("The Factorial of no is :",result) 