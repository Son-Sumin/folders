# 2~20까지 짝수의 합
# sum = 0
# i = 2

# for i in range(2,21) : 
#     if i % 2 == 0 :
#         sum += i
#     i+=1
# print(sum)


# #구구단
# # for i in range(2,10) :
# #     for num in range(1,10):
# #         print(f"{i} * {num} = {i * num}")


# #별 찍기
# text = "*"
# st = ""
# for i in range(1,6) :
#     for j in (0, i) :
#         st = text * j
#     print(st)


# 2~30 소수 리스트 뽑아내기
prime = []
for i in range(2,31):
    isPrimary = True
    for j in range(2, i) :
        if i % j == 0:
            isPrimary = False
            break
    if isPrimary :
        prime.append(i)
print(prime)


# prime = []
# for i in range(2,31) :
#     isPrimary = True # 소수인가?
#     for j in range(2,i) :
#         if (i % j == 0):
#             isPrimary = False
#             break
#     if isPrimary :
#         prime.append(i)
# print(prime)