def fact(q):
    if (q==0 or q==1):
        return 1
    else :
        return fact((q-1)*q)
    q=int (input("Enter the No"))
    
result = fact(q)
print("The Factorial of no is :",result)