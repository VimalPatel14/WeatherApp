# Welcome to WeatherApp Using RXJAVA 🌦️

WeatherApp Using RXJAVA is a sleek and efficient weather application built with the power of RXJAVA, designed to provide you with accurate weather forecasts and real-time updates. Whether you're a developer looking to explore RXJAVA or a weather enthusiast seeking reliable weather information, this app is your go-to solution.

Key Features:

🔍 Real-time Weather Updates: Stay informed with up-to-the-minute weather data, ensuring you're always prepared for the day ahead.

🌍 Global Weather Data: Access weather forecasts for any location worldwide, helping you plan your activities regardless of where you are.

🌡️ Accurate Weather Information: Utilizing RXJAVA's powerful asynchronous programming capabilities, this app delivers precise and reliable weather details.

📈 Interactive Graphs: Visualize weather trends over time with intuitive graphs, allowing you to understand weather patterns effortlessly.

🌅 Sunrise and Sunset Times: Plan your day effectively by knowing the exact times of sunrise and sunset for any location.

🌩️ Weather Alerts: Receive timely notifications for severe weather conditions, ensuring your safety during storms and other weather-related emergencies.

🌐 Multiple Units: Customize the app to display temperature and other weather data in your preferred units, providing a personalized user experience.

📱 Responsive Design: Enjoy a seamless user experience across various devices, including smartphones and tablets, thanks to the app's responsive design and RXJAVA's adaptability.

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
