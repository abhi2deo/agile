bill = [[101,200,300],[102,500,0],[103,200,400],[104,400,0]]
sum = 0
for i in bill:
    sum+=i[1]+i[2]
print("Net electricity used:",sum,"units")

cost = 0
#10rs for first 100
#20rs for next 200
#30 rs for remaining
for i in bill:
    cost = 0
    if(i[1]>100):
        cost = 1000
        if((i[1]-100)>0):
            cost = cost + (i[1]-100)*20
            if((i[1]-300)>0):
                cost = cost + (i[1]-300)*30
    print("Cost of house number",i[0],"is",cost)

#houses electricity units > 300 are eligible

max = 0
house = 0
for i in bill :
    if(i[1]>max):
        max = i[1]
        house = i[0]
    if(i[1]>300):
        print("House number",i[0],"is eligible for green incentive")

print("Highest consumer is house number",house)

for i in bill:
    print("House number",i[0],"consumes",i[1],"units and generates",i[2],"units of solar energy")
