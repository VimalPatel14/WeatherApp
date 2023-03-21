# WeatherApp Using RXJAVA

**Coroutines VS RXJava**
-------------------
They're different tools with different strengths. Like a tank and a cannon, they have a lot of overlap but are more or less desirable under different circumstances.
        - Coroutines Is light wight threads for asynchronous programming.
        - RX-Kotlin/RX-Java is functional reactive programming, its core pattern relay on
        observer design pattern, so you can use it to handle user interaction with UI while you
        still using coroutines as main core for background work.

**How does Coroutines concept work ?**
------------
 - Kotlin coroutine is a way of doing things asynchronously in a sequential manner. Creating a coroutine is a lot cheaper vs creating a thread.


**When I can choose Coroutines or RX-Kotlin to do some behaviour ?**
--------------------------
 - Coroutines : *When we have concurrent tasks , like you would fetch data from Remote connections
 , database , any background processes , sure you can use RX in such cases too, but it looks like
  you use a tank to kill ant.*
 - RX-Kotlin : *When you would to handle stream of UI actions like : user scrolling , clicks ,
 update UI upon some events .....ect .*


**What is the Coroutines benefits?**
-----------------------------

 - Writing an asynchronous code is sequential manner.
 - Costing of create coroutines are much cheaper to crate threads.
 - Don't be over engineered to use observable pattern, when no need to use it.
 - parent coroutine can automatically manage the life cycle of its child coroutines for you.
