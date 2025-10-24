<h1 align="center">OpenMRS.org Project - E2E Test Automation</h1>
Bu proje, [OpenMRS](https://openmrs.org/) platformu için geliştirilmiş bir uçtan uca (E2E) test otomasyon suitidir. Amaç, kritik kullanıcı hikayelerini (User Stories) doğrulamak ve sistemin kararlılığını garanti altına almaktır.

---

## 🎯 Test Kapsamı (User Stories)

Bu framework, iki ana kullanıcı rolünün (Doktor ve Kullanıcı) kritik iş akışlarını test eder:

### 👤 Kullanıcı Senaryoları
* Başarılı ve hatalı **Giriş (Login)** senaryoları.
* Güvenli **Çıkış (Logout)** işlemi.
* Yeni **Hasta Kaydı** oluşturma.
* **Hesap Ayarlarına** hızlı erişim.
* Farklı zaman dilimi (Timezone) için randevu hatasının doğrulanması.

### 🩺 Doktor Senaryoları
* Tüm hastaları **Listeleme**.
* Hasta **Arama** (İsim veya ID ile).
* İki ayrı hasta kaydını **Birleştirme (Merge)**.
* Bir hasta kaydını **Silme (Delete)**.

---

## 🛠️ Teknoloji ve Araçlar

* **Dil:** Java
* **Otomasyon:** Selenium WebDriver
* **Test Çerçevesi:** TestNG (Paralel test desteği ile)
* **Tasarım Deseni:** Page Object Model (POM)
* **Proje Yönetimi:** Maven
* **Yapılandırma:** `configuration.properties` ile dinamik veri yönetimi

---

## 🚀 Nasıl Çalıştırılır?

### 1. Kurulum

```bash
# Projeyi klonlayın
git clone [GITHUB REPO ADRESINIZ]

# Proje dizinine gidin
cd [PROJE-KLASOR-ADI]

# Gerekli bağımlılıkları yükleyin
mvn clean install
