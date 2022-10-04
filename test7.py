# 2~20까지 짝수의 합
sum = 0
i = 2
while 1 < i < 21 :
    if i%2 == 0 :
        sum += i   
    i+=1
print(sum)

i =2
answer = 0
while i <= 20 :
    if i%2 == 0 :
        answer += i
    i+=2
print(answer)

answer =0
for index in range(2,21) :
    if index%2 == 0:
        answer +=index
print(answer)