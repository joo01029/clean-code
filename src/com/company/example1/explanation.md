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


# 주석 사용 최소화 하기
## 코드 자체만으로 어떤 역할을 하는지 알 수 있게 코드를 작성한다.

# 일관성있는 검색 가능한 이름

>FriendRepo -> FriendRepository
> 
> LikeRp -> LikeRepository
> 
> UserRepository -> UserRepository

# 함수의 매개변수 최소화

[BadExample]
> MakePayment(3500, 10, 3, "nam", "01010101010");

[BetterExample]
> MakePayment(price:3500, productID:10, Quantity:3,BuyerName:"nam",BuyerPhoneNUmber:"01010101010")

[BestExample]
> ProductInfo product = new ProductInfo(price:3500, productID:10,Quantity:3);<br>
> BuyerInfo productBuyer = new BuyerInfo(name:"nam", phoneNumber:"01010101010");<br>
> MakePayment(product:product, buyer:productBuyer);


# 안쓰는 것들을 삭제

#전역 변수 최소화
* 전역변수는 모듈들을 커플링 시켜 각각의 모듈을 관리하기 어렵게 만듬 (모든 모듈이 전역변수에 접근성을 가짐)
* 전역변수가 많아질수록 각각의 모듈들에 대한 가독성이 떨어짐 