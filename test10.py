#핸드폰 번호 가리기
#input 번호 받아서 010-2222-2222
#뒷 4자리만 살리고 ***-****-2222
#02-8888-8888 -> **-****-8888

# def solution(phone_number):
#     answer = ''
#     for i in range(0, len(phone_number)):
#         if i < len(phone_number)-4 :
#             if phone_number[i] == "-":
#                 answer += "-"
#             else: 
#                 answer += "*"
#         else :
#             answer += phone_number[i]
#     return answer

# print(solution("01033334444"))
# print(solution("0277778888"))


# 파일 입출력
# 상대 경로 (내 위치에서 가고픈 곳으로 가고 싶음)
# . : 현재위치 c/test
# .. c
# . 현재위치 c/test/test1
# ../test12.py

#절대 경로
#C:\test\test-python

# f = open("./test.txt", 'w')
# f.write("hi1")
# f.write("\n")
# f.write("\n")
# f.write("\tbye1")
# f.close()

# f = open("./test.txt", 'r')
# lines = f. readlines()
# for line in lines :
#     print(line)
# f.close()

f = open("./test.txt", 'a')
f.write("""
        asdfasdfasdf""")
f.close()


#git add.
#git commit

#내일 업데이트, class
