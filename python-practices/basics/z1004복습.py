#제어문
# a = 10
# b = 5
# str1 = ""
# if a>b :
#     str1 = "크다"
#     print(f"a>b 크다")
# elif a<b :
#     str1 = "작다"
#     print(f"a<b 작다")
# else :
#     str1 = "같다"
#     print(f"a=b 같다")
# print(f"a>b {str1}")


# c = [1,2,3]
# if len(c) > 3 :
#     print(c[0])
# if len(c) > 2 :
#     print(c[0])



#반복문
# a = ("a", "b", "c", "d", "e")
# for i in range(0, len(a)) :
#     print(i)
#     print(a[i])
# for i in range(0, len(a), 2) :
#     print(i)
#     print(a[i])

a = ("a", "b", "c", "d", "e")
for i in a :
    print(i)

re = 0
while re < 5 :
    print(a[re])
    re+=1

b = [1,2,3,4,5]
re = 0
while True :
    print(b[re])
    if(b[re] % 2 ==0) :
        break
    re+=1
for i in a :
    if i == "c" :
        break
    print(i)