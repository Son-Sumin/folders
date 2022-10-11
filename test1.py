print('Q1.  ')
a = [11,21,31,1,1,2,3,4,2,1,4,5,6,7,8,10]
setA = set(a)
a = list(setA)
print(a)
a.reverse()
print(a)
a.sort()
print(a)


print('Q2.  ')
a= {"name" : "park", "score" : 70}
b= {"name" : "kim", "score" : 80}
c= {"name" : "park", "score" : 50}
print("%s는 점수가 80점 이상이 %s\n" %(a.get("name"), a["score"]>=80)),
print("%s는 점수가 80점 이상이 %s\n" %(b.get("name"), b["score"]>=80)),
print("%s는 점수가 80점 이상이 %s\n" %(c.get("name"), c["score"]>=80))




tmpd = {"name" : "re", "age" : 100}
list = [tmpd]
list1 = list
list2 = list.copy()
list3 = [tmpd.copy]
print("list")
print(list)
print("list1")
print(list1)
print("list2")
print(list2)
print("list3")
print(list3)

list.append(1)
print("list")
print(list)
print("list1")
print(list1)
print("list2")
print(list2)
print("list3")
print(list3)

tmpd["name"] = "lee"
print("list")
print(list)
print("list1")
print(list1)
print("list2")
print(list2)
print("list3")
print(list3)