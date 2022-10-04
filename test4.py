list = [1,2,3,4,5,6,2,3,5,1]
i = 0
while i < len(list) :
    if list[i] % 2 == 0:
        print(f"{list[i]}은 짝수입니다")
    else:
        # print(i)
        print(f"{list[i]}은 홀수입니다")
        # continue #반복문의 continue 뒤 실행 X, break 반복문 끝남
        # break
        # print("끝")
    i+=1