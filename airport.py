flight = [[1,"Delhi",9,4],[2,"Mumbai",10,30],[3,"Bangalore",21, 0],[4,"Pune",22,70]]

max = 0
num = 1
sum = 0
sorted_flight = []
for i in flight:
    if(i[3]>0):
        print("Flight number",i[0],"is delayed by",i[3],"minutes")
        sum+=i[3]
        if (i[3]>max):
            max = i[3]
            num = i[0]
print("Maximum delay is",max,"minutes of flight number",num)
print("Average delay",sum/(len(flight)),"minutes")

for i in flight:
    if(i[3]>60):
        print("Flight number",i[0],"is delayed by more than 60 minutes")

print("Sorted according to departure time: ")

for i in flight:
    print(i[0],end="\t")
