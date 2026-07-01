[Русская версия](./README.ru.md)

# News

**News** is an Android app that allows users to subscribe to topics of interest and receive the latest news related to them. Articles are loaded from NewsAPI, cached locally in Room, and automatically refreshed in the background using WorkManager.

## Demo
<table>
  <tr>
    <td align="center"><b>Subscriptions Screen</b></td>
    <td align="center"><b>Applying Language Settings</b></td>
  </tr>
  <tr>
    <td align="center" width="300">
      <video src="https://github.com/user-attachments/assets/3073dbb0-6251-4854-bea4-62984e976846" width="300"></video>
    </td>
    <td align="center" width="300">
      <video src="https://github.com/user-attachments/assets/82fa05ce-fa71-4fb9-b469-9a08b3e5f2ab" width=300"></video>
    </td>
  </tr>
</table>

## Key Features
* **Topic subscriptions:** add any keywords (topics) and read news related to them.
* **News feed:** all articles from subscriptions are displayed in the feed on the main screen, with the ability to filter by topic.
* **Go to source:** ability to open the full article in the browser with a click.
* **Article sharing:** ability to share the article link through any application.
* **Background refresh:** automatic article updates in the background with configurable intervals and smart Wi-Fi-only loading (using WorkManager).
* **Notifications:** push notifications when new articles appear.
* **Flexible settings:** choose the news language, refresh interval, configure Wi-Fi only mode and notifications.

## Tech Stack
| Category | Library / Tool |
|:----------|:-----------|
| UI | Jetpack Compose (Material 3) |
| Architectural Pattern | Clean Architecture, MVVM |
| Navigation | Navigation Compose | 
| DI | Hilt | 
| Asynchronous Programming | Kotlin Coroutines, Flow | 
| Networking | Retrofit | 
| Serialization | Kotlinx Serialization | 
| Local Database | Room | 
| Preferences Storage | DataStore Preferences | 
| Background Tasks | WorkManager | 
| Image Loading | Coil 3 | 
| Splash Screen | Core SplashScreen | 
| API | [NewsAPI](https://newsapi.org/) | 

## APK Download
Requirement: minimum API 24 (Android 7.0 Nougat)

[![Release](https://img.shields.io/github/v/release/yana-chernaya/News)](https://github.com/yana-chernaya/News/releases/latest)

## Author
Yana Chernaya — [**GitHub profile**](https://github.com/yana-chernaya)

***

Made with ❤️ for an Android developer portfolio
