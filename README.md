# 📚 SOLU Kütüphanesi | Topluluk Odaklı Kitap Paylaşım Platformu

**SOLU Kütüphanesi**, kullanıcıların fiziksel kitaplarını birbirleriyle paylaşabildiği, ödünç alıp verebildiği ve okuma alışkanlıklarını takip edebildiği modern bir web uygulamasıdır.

Proje, topluluk güvenine dayalı bir **"Güven Puanı (Trust Score)"** sistemi üzerine kurulmuştur. Kitaplarını zamanında teslim eden kullanıcılar puan kazanır, rozetler elde eder ve topluluk içinde seviye atlar.

---

## 📸 Proje Görselleri

Uygulamanın temel ekranları ve akışları aşağıdadır:

### 1. Keşfet ve Vitrin

Kullanıcıların paylaşılan tüm kitapları görebildiği, arama ve filtreleme yapabildiği ana sayfa.
![Ana Sayfa](screenshots/HomePage.png)

### 2. Kitap İstek Süreci

Bir kitabı ödünç almak için gün sayısı belirterek istek gönderme ekranı.

<p float="left">
  <img src="screenshots/BookRequest.png" width="45%" />
</p>

### 3. Profil ve Rozet Sistemi

Kullanıcının güven puanını, kazandığı rozetleri (Hızlı, Güvenilir vb.) ve kişisel bilgilerini yönettiği ekran.
![Profil Sayfası](screenshots/ProfilePage.png)

### 4. Kütüphane Yönetimi

Kullanıcının sahip olduğu kitapları listelediği ve gelen ödünç isteklerini yönettiği panel.
![Kütüphanem](screenshots/myLibraryPage.png)

---

## 🚀 Özellikler

### 👤 Kullanıcı Deneyimi

- **Giriş & Kayıt:** Güvenli kimlik doğrulama ve ziyaretçi modu.
- **Responsive Tasarım:** Mobil uyumlu hamburger menü ve grid yapısı.
- **Akıllı Profil:** Otomatik hesaplanan güven skoru ve dinamik rozetler.

### 📖 Kitap Döngüsü

- **Paylaşım:** Kitap adı, yazarı ve görseli ile sisteme katkı sağlama.
- **İstek Yönetimi:** Kitap sahipleri gelen istekleri onaylayabilir veya reddedebilir.
- **İade Sistemi:** Ödünç alan kişi iadeyi başlatır, sahip onaylayınca puanlar güncellenir.

---

## 🛠️ Teknolojiler

| Alan         | Teknolojiler                                              |
| :----------- | :-------------------------------------------------------- |
| **Backend**  | Java 17, Spring Boot 3.x, Spring Data JPA                 |
| **Database** | H2 Database (Geliştirme), MySQL/PostgreSQL uyumlu yapı    |
| **Frontend** | HTML5, CSS3 (Modern Variables), Vanilla JavaScript (ES6+) |
| **API**      | RESTful API                                               |

---

## ⚙️ Kurulum ve Çalıştırma Rehberi

Projeyi kendi bilgisayarınızda sıfırdan kurmak için aşağıdaki adımları izleyin.

### 1. Gereksinimler

- **Java JDK 17** veya üzeri.
- **Maven** (Bağımlılık yönetimi için).
- Bir Kod Editörü (IntelliJ IDEA veya VS Code önerilir).

### 2. Projeyi Klonlama

Terminali açın ve projeyi bilgisayarınıza indirin:

````bash
git clone [https://github.com/T4pio/Solu_library.git](https://github.com/T4pio/Solu_library.git)
cd SOLU-Library

### 3. Veritabanı Kurulumu (H2 Database)
Bu proje varsayılan olarak **H2 In-Memory Database** kullanır. Yani ekstra bir MySQL veya PostgreSQL kurulumu yapmanıza gerek yoktur. Proje çalıştığında veritabanı bellekte otomatik oluşur.

*Veritabanı Ayarları (`backend/src/main/resources/application.properties`):*

```properties
spring.datasource.url=jdbc:h2:mem:librarydb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

Not: Veritabanı konsoluna http://localhost:3000/h2-console adresinden erişebilirsiniz.4. Backend'i Başlatma Terminalde backend klasörüne gidin ve uygulamayı ayağa kaldırın:Bashcd backend
mvn spring-boot:run
Terminalde Started LibraryApplication in ... seconds yazısını gördüğünüzde sunucu 3000 portunda çalışıyor demektir.5. Frontend'i ÇalıştırmaFrontend tamamen statik dosyalardan oluştuğu için ekstra bir kuruluma (npm install vb.) ihtiyaç duymaz.frontend klasörüne gidin.login.html dosyasına sağ tıklayın ve tarayıcınızda açın (veya VS Code kullanıyorsanız Live Server eklentisi ile açın).Kayıt olun ve uygulamayı kullanmaya başlayın!📂 Proje Klasör YapısıPlaintextSOLU-Library/
├── backend/
│   ├── src/main/java/com/solu/library/
│   │   ├── controller/      # API Endpoints (İstekleri karşılar)
│   │   ├── model/           # Veritabanı Tablo Karşılıkları (Entity)
│   │   ├── repository/      # Veri Erişim Katmanı (SQL İşlemleri)
│   │   └── service/         # İş Mantığı ve Kurallar
│   └── resources/           # Ayar dosyaları
│
├── frontend/
│   ├── login.html           # Giriş/Kayıt
│   ├── index.html           # Vitrin (Ana Sayfa)
│   ├── profile.html         # Profil Yönetimi
│   ├── myLibrary.html       # Kitaplarım
│   └── borrow.html          # Ödünç İşlemleri
│
└── screenshots/             # Proje görselleri

SCREENSHOTS KLASÖRÜNDEN PROJENİN UI GÖRÜNTÜLERİNİ GÖREBİLİRSİNİZ


````


