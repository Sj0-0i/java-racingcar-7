# java-racingcar-precourse

---

## 기능 목록

---

1. 사용자에게 자동차 이름을 입력 받는다.
   + 자동차 이름은 쉼표로 구분한다.
   + 이름은 2개 이상 입력 받는다. 
   + 이름은 빈 문자열을 허용하지 않는다.
   + 이름에 공백은 포함되지 않는다.
   + 이름은 5자 이하만 가능하다.
   + 이름은 중복을 허용하지 않는다.
   + camp.nextstep.edu.missionutils.Console의 readLine() 활용


2. 사용자에게 경주 횟수를 입력 받는다.
   + 경주 횟수만큼 경주를 진행한다.
   + 자동차는 2가지 상태를 가진다. (멈춤 / 전진)
   + 자동차마다 무작위 값을 뽑는다.
     + 0 ~ 9 사이 무작위 값, camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange() 활용
     + 4 이상일 때 전진 가능, -로 표시한다.
     + 매 경주마다 반복한다.


3. 경주 결과를 출력한다. 


4. 경주를 완료하면 최종 우승자를 구한다.
   + 전진 횟수가 가장 많은 자동차가 우승
   + 공동 우승자가 가능하다. ,(쉼표)로 구분한다.



## 예외 처리

--- 

1. 자동차
- [ ] 이름이 빈 문자열인 경우
- [ ] 이름에 공백이 포함된 경우
- [ ] 구분자가 ,(쉼표)가 아닌 경우
- [ ] 이름을 2개 이상 입력하지 않은 경우
- [ ] 이름이 6자 이상인 경우
- [ ] 이름에 중복이 존재하는 경우


2. 경주 횟수
- [ ] 값이 양수가 아닌 경우
- [ ] 숫자 이외의 문자가 존재하는 경우
