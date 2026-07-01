[English version](./README.md)

#  News

**News** — Android-приложение, которое позволяет подписываться на интересующие темы и получать свежие новости по ним. Статьи загружаются из NewsAPI, кэшируются локально в Room и автоматически обновляются в фоне через WorkManager. 

## Демонстрация
<table>
  <tr>
    <td align="center"><b>Главный экран</b></td>
    <td align="center"><b>Применение настроек языка</b></td>
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


## Основные возможности приложения
* **Подписки на темы:** добавление любых ключевых слов (тем) и чтение новостей по ним.
* **Лента новостей:** все статьи по подпискам отображены в ленте на главном экране, с возможностью фильтрации по теме.
* **Переход к источнику:** возможность открытия полной статьи в браузере по клику.
* **Шэринг статьей:** возможность отправки ссылки на статью через любое приложение.
* **Фоновое обновление:** автоматическое обновление статей в фоне с настраиваемой периодичностью и умной загрузкой только по Wi-Fi (через WorkManager).
* **Уведомления:** push-уведомления при появлении новых статей.
* **Гибкие настройки:** выбор языка новостей, интервала обновления, настройка Wi-Fi only и уведомлений.

## Стек технологий
| Категория | Библиотека / Инструмент |
|:----------|:-----------|
| UI | Jetpack Compose (Material 3) |
| Архитектурный паттерн | Clean Architecture, MVVM |
| Навигация | Navigation Compose | 
| DI | Hilt | 
| Асинхронность | Kotlin Coroutines, Flow | 
| Сеть | Retrofit | 
| Сериализация | Kotlinx Serialization | 
| Локальная БД | Room | 
| Хранение настроек | DataStore Preferences | 
| Фоновые задачи | WorkManager | 
| Загрузка изображений | Coil 3 | 
| Splash Screen | Core SplashScreen | 
| API | [NewsAPI](https://newsapi.org/) | 

## APK download
Требование: минимум API 24 (Android 7.0 Nougat)

[![Release](https://img.shields.io/github/v/release/yana-chernaya/News)](https://github.com/yana-chernaya/News/releases/latest)


## Автор проекта 
Яна Черная — [**GitHub профиль**](https://github.com/yana-chernaya)

***

Сделано с ❤️ для портфолио Android-разработчика
