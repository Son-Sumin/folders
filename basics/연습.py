#  test1>>>>

# print('Q1. ')
# a = [12,21,1,2,3,4,5,89,65,15,74]
# setA = set(a)
# print(setA)
# list(setA)
# print(list(setA))
# a.reverse()
# print(a)
# a.sort()
# print(a)



# print('Q2. ')
# a = {"name" : "park", "score" : 70}
# b = {"name" : "kim", "score" : 80}
# c = {"name" : "park", "score" : 50}

# print("%s는 점수가 80점 이상이 %s\n" %(a.get("name"), a.get("score")>=80))
# print("%s는 점수가 80점 이상이 %d\n" %(b.get("name"), b.get("score")>=80))
# print("%s는 점수가 80점 이상이 %f\n" %(c.get("name"), c.get("score")>=80))


# print('Q3. ')
# p1 = {"name" : "kim", "money" : 50000}
# p2 = {"name" : "park", "money" : 30000}
# print("%s는 %s보다 %d 더 있습니다" %(p1.get("name"), p2.get("name"), p1.get("money")-p2.get("money")))

# print("%s와 %s의 합계는 %d 입니다" %(p1.get("name"), p2.get("name"), p1.get("money")+p2.get("money")))

# print("%s와 %s의 평균은 %5.5f입니다" %(p1.get("name"), p2.get("name"),
#                                       (p1.get("money")+p2.get("money"))/2))


# print("복습문제1")
# a = {"num" : 80}
# print("%s는 %s이다" %(a.get("num"),
# (a.get("num")%2==0)))

# print("%s는 %d이다" %(a.get("num"), a.get("num")%2==0))

# print(f"80은 짝수인가 {80%2 ==0}")


# print("복습문제2")
# list1 = [2,1,5,6,2,40,50,2,5,32]
# list2 = [4,6,2,3,9,10,2,3,42,5,4,63]
# set(list1)
# print(set(list1))

# set(list1) & set(list2)
# print(set(list1) & set(list2))

# intersection = list(set(list1) & set(list2))
# print(intersection)
# intersection.sort()
# print(intersection)
# print(intersection [0])
# print(intersection[len(intersection)-1])




#  test2>>>>

# 제어문
# a = 10
# b = 5
# str = ''

# if a>b:
#     str = 'a는 b보다 크다'
# elif a<b:
#     str = 'a는 b보다 작다'
# else:
#     str = 'a와 b는 같다'
# print({str})

# c= [1,2,3]
# if len(c) > 3:
#     print(c[0])
# if len(c) > 2:
#     print(c[0])


# 반복문
# a = ["a", "b", "c", "d", "e"]

# for i in range(0, len(a)):
#     print(i)
#     print(a[i])

# for i in range(0, len(a),2):
#     print(i)
#     print(a[i])

# for i in a:
#     print(i)

# re=0
# while re < 5 :
#     print(a[re])
#     re += 1

# b = [1,2,3,4,5]
# re = 0
# while True:
#     print(b[re])
#     if b[re] % 2 ==0 :
#         break
#     re += 1

# for i in a:
#     if i == "c" :
#         break
#     print(i)


# while True :
#     print(b[re])
#     if(b[re] % 2 ==0) :
#         break 
#     re+=1
# for i in a :
#     if i =="c" :
#         break
#     print(i)




#  test3>>>>
list = [1,2,3,4,5,6,2,3,5,1]
# for i in list:
#     if i % 2 ==0:
#         print(f"{i}는 짝수입니다")
#     elif i % 2 ==1:
#         print(f"{i}는 홀수입니다")

i=0
while i < len(list) :
    if list[i] % 2 == 0:
        print(f"{list[i]}는 짝수입니다")
    elif list[i] % 2 ==1:
        print(i)
        # print(f"{list[i]}는 홀수입니다")
        break
        print("끝")
        i +=1


# while i < len(list) :
#     if list[i] % 2 == 0:
#         print(f"{list[i]}은 짝수입니다")
#     elif list[i] % 2 == 1:
#          # print(i)
#         # print(f"{list[i]}은 홀수입니다")
#         # continue #반복문의 continue 뒤 실행 X, break 반복문 끝남
#         break
#         # print("끝")
#         i +=1