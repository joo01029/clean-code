# 가독성 좋은 이름 짓기

## 1. 함수명은 '동사' Class 및 변수 이름은 '명사'로 사용
> int age = userAge()  ->  int age = uetUserAge()


## 2, 간소화된 이름은 사용을 최소화
> int[] genRandNums() -> int[] getGeneratedRandomNumbers()


## 3. 상수 사용을 최소화 (상수가 의미하는 바 명확하게 표기)
>[BadExample] <br>
>setCleaningInterval(86400);
>
>[GoodExample] <br>
>final int SECOND_IN_A_DAY = 86400;<br>
>setCleaningInterval(SECOND_IN_A_DAY);

## 4. 해당 기능 혹은 존재를 정확하게 묘사하는 모호하지 않은 구체적인 이름

>double[] getData(int p) -> XYLv getMeasuredXYLv(int measuredPoint);