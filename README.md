# 🚀 INSTULEARN UI TEST OTOMASYON PROJESİ 🚀
_"Quality at the Speed of Light" ⚡_

**🌐 TEST ORTAMI:** [https://qa.instulearn.com/](https://qa.instulearn.com/)

---

## 📖 PROJE HİKAYESİ

Bu proje, Instulearn platformunun kalitesini garanti altına almak için tasarlanmış  bir test framework'üdür.
Selenium WebDriver + Cucumber + Java üçlüsü ile güçlendirilmiş olup, BDD yaklaşımını benimseyerek "business & tech" köprüsü kurar.

## 🎯 NİHAİ HEDEFLER

- ✅ UI test otomasyonunu kolaylaştırmak ve standartlaştırmak
- ✅ BDD yaklaşımı ile iş ve teknik ekipler arasında köprü kurmak
- ✅ CI/CD süreçleri ile tam uyumlu, güvenilir bir framework geliştirmek
- ✅ Kapsamlı raporlama ve loglama sistemi oluşturmak
- ✅ Modüler ve yeniden kullanılabilir kod yapısı sağlamak

## 🚀 GELECEK VİZYONU

- 📊 JSON, XML raporlama formatları
- ⚡ Paralel test çalıştırma
- 📱 Mobil test otomasyonu
- 🐳 Docker container desteği
- ☁️ Cloud testing platform entegrasyonları

## 🛠️ TEKNOLOJİ ARSENALI

| 🏗️ TEMEL TEKNOLOJİ      | 🧪 TEST FRAMEWORK'LER | 📊 RAPORLAMA         |
| ---------------------- | --------------------- | -------------------- |
| • Java 17 (Corretto)   | • JUnit 5             | • Allure Reports     |
| • Maven 3.6+           | • TestNG 7.9.0        | • Extent Reports     |
| • Selenium 4.14.0      | • Soft Assert         | • Cucumber Reports   |
| • Cucumber 7.13.0      | • QR Code             |                      |

### 🎁 YARDIMCI KÜTÜPHANELER

| Kütüphane           | Açıklama                   |
| ------------------- | -------------------------- |
| • WebDriver Manager | Otomatik driver yönetimi     |
| • Log4j2            | Gelişmiş loglama sistemi     |
| • Apache POI        | Excel operasyonları        |
| • QR Code Generator | QR kod işlemleri           |

## 📁 PROJE MİMARİSİ

```
draftCucumberProject/
├── 🎯 .idea/                          # IDE konfigürasyon dosyaları
├── 📚 Documents/                      # Proje dokümantasyonu
├── 🗂️ src/
│   ├── ⚙️ main/
│   │   ├── ☕ java/
│   │   │   ├── ⚙️ config/
│   │   │   │   └── ConfigReader.java           # Konfigürasyon yönetimi
│   │   │   ├── 🚗 drivers/
│   │   │   │   ├── BrowserFactory.java         # Browser başlatma
│   │   │   │   └── DriverManager.java          # Driver yaşam döngüsü
│   │   │   ├── 🏠 pages/
│   │   │   │   ├── BasePage.java               # Tüm page'ler için temel
│   │   │   │   ├── LoginPage.java              # Login sayfası PO
│   │   │   │   └── HomePage.java               # Ana sayfa PO
│   │   │   └── 🛠️ utils/
│   │   │       ├── 🖱️ ClickUtils.java          # Gelişmiş tıklama
│   │   │       ├── ⌨️ SendKeyUtils.java        # Smart Send Keys
│   │   │       ├── 🪟 SwitchToWindow.java      # Dosya yükleme
│   │   │       ├── 📸 MultiScreenShotsMethods.java # Çoklu screenshot
│   │   │       ├── 🌍 GlobalVars.java          # Dinamik String
│   │   │       ├── 🔦 HighLighToElements.java  # Locate pointer
│   │   │       ├── ⚡ JSUtils.java             # Gizli elementler
│   │   │       ├── 🌐 BrowserUtils.java        # Pencere geçişleri
│   │   │       ├── 📜 ScrollMethods.java       # Akıllı kaydırma
│   │   │       ├── 📊 ExcelReader.java         # Excel operasyonları
│   │   │       ├── 🪵 LoggerHelper.java        # Loglama
│   │   │       ├── 🔄 ReusableMethods.java     # Yeniden kullanılabilir
│   │   │       ├── 🧪 TestUtils.java           # Test yardımcıları
│   │   │       └── ⏳ WaitHelper.java          # Akıllı bekleme
│   │   └── 📁 resources/
│   │       ├── config.properties               # Ana konfigürasyon
│   │       └── log4j2.xml                      # Loglama konfigürasyonu
│   └── 🧪 test/
│       ├── ☕ java/
│       │   ├── 📝 features/                    # Cucumber feature'ları
│       │   │   ├── 🔐 login/
│       │   │   │   └── login.feature
│       │   │   ├── 👤 registration/
│       │   │   │   └── registration.feature
│       │   │   └── 🔄 common/
│       │   │       └── common.feature
│       │   ├── 🏃 runners/
│       │   │   └── TestRunner.java             # Test koşucu
│       │   └── 🚶 stepdefinitions/
│       │       ├── Hooks.java                  # Before/After
│       │       ├── LoginSteps.java             # Login step'leri
│       │       └── exampleSteps.java           # Method çağrı örnekleri
│       └── 📁 resources/
│           ├── extent-config.xml               # Extent Report
│           └── test-data/                      # Test verileri
│               └── testdata.xlsx
├── 🎯 target/                                 # Derleme çıktıları
├── 📊 reports/                                # Test raporları
├── 🙈 .gitignore                              # Git ignore
├── 📦 pom.xml                                 # Maven bağımlılıkları
└── 📖 README.md                               # Bu dosya!
```

## ⚙️ KURULUM REHBERİ

### 🎯 GEREKSİNİMLER
- IDE (IntelliJ IDEA veya Eclipse) - Tercihen IntelliJ
- Java JDK 17 - Amazon Corretto 17+ **ZORUNLU**
- Maven 3.6.0 veya üzeri
- Git (Yardımcı Program)

### 🚀 KURULUM ADIMLARI

1.  **PROJEYİ KLONLAYIN:**
    ```bash
    git clone [repository-url]
    cd com.instuLearn
    ```


