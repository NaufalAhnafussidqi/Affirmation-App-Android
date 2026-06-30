# ✨ Affirmation App Android

**Tugas Pemrograman Perangkat Bergerak**

Aplikasi Android sederhana yang menampilkan daftar kutipan motivasi (affirmations) dalam format daftar kartu. Dibangun menggunakan **Kotlin** dan **Jetpack Compose**.

---

## ✨ Fitur

- 📜 **Daftar Affirmations** — Menampilkan 8 kutipan motivasi dalam daftar scrollable
- 🃏 **Tampilan Kartu** — Setiap kutipan ditampilkan dalam komponen `Card` yang rapi
- 🌙 **Tema Dinamis** — Mendukung dark mode dan dynamic color (Android 12+)
- 📱 **UI Modern** — Menggunakan Jetpack Compose dengan Material Design 3
- ⬆️ **Lazy Loading** — Menggunakan `LazyColumn` untuk performa optimal

---

## 🛠️ Teknologi

| Komponen | Versi |
|----------|-------|
| Android Gradle Plugin | 9.1.1 |
| Kotlin | 2.2.10 |
| Compile SDK | 36 |
| Min SDK | 24 (Android 7.0) |
| Target SDK | 36 |
| Jetpack Compose BOM | 2026.02.01 |
| Material Design | 3 (Material3) |

---

## 📂 Struktur Proyek

```
Affirmation-App-Android/
├── app/
│   ├── build.gradle.kts          # Konfigurasi build aplikasi
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/com/example/tiptime/
│           │   ├── MainActivity.kt       # Entry point aplikasi
│           │   ├── TipTimeLayout.kt      # UI daftar affirmations
│           │   └── ui/theme/
│           │       ├── Color.kt          # Definisi warna
│           │       ├── Theme.kt          # Tema aplikasi (TipTimeTheme)
│           │       └── Type.kt           # Tipografi
│           └── res/
│               ├── drawable/             # Icon launcher
│               ├── mipmap-*/             # App icons
│               └── values/
│                   ├── strings.xml       # String resource
│                   └── themes.xml        # Tema legacy
├── build.gradle.kts              # Konfigurasi build root
├── settings.gradle.kts           # Pengaturan project
├── gradle/
│   └── libs.versions.toml        # Version catalog dependencies
├── gradlew / gradlew.bat         # Gradle wrapper
└── README.md                     # Dokumentasi proyek
```

---

## 🚀 Cara Menjalankan

### Prasyarat
- Android Studio (versi terbaru direkomendasikan)
- JDK 11 atau lebih tinggi
- Android SDK dengan API Level 36

### Langkah-langkah

1. **Clone repository**
   ```bash
   git clone https://github.com/NaufalAhnafussidqi/Affirmation-App-Android.git
   cd Affirmation-App-Android
   ```

2. **Buka di Android Studio**
   - Pilih **File → Open** dan arahkan ke folder proyek
   - Tunggu Gradle sync selesai

3. **Jalankan aplikasi**
   - Hubungkan perangkat Android atau buka emulator
   - Klik tombol **Run** (▶️) atau tekan `Shift + F10`

---

## 📝 Penjelasan Kode

### `MainActivity.kt`

Entry point aplikasi yang mengatur tema dan memanggil composable utama:

```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipTimeTheme {
                Surface {
                    TipTimeLayout()
                }
            }
        }
    }
}
```

### `TipTimeLayout.kt`

Composable utama yang menampilkan daftar affirmations menggunakan `LazyColumn`:

```kotlin
@Composable
fun TipTimeLayout() {
    val daftarQuotes = listOf(
        "Keep going",
        "Never give up",
        "Believe in yourself",
        "Stay positive",
        "Success takes time",
        "Learn every day",
        "Be confident",
        "Dream big"
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(daftarQuotes) { quote ->
            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = quote,
                    modifier = Modifier.padding(20.dp)
                )
            }
        }
    }
}
```

| Komponen | Fungsi |
|----------|--------|
| `LazyColumn` | Daftar scrollable yang hanya merender item yang terlihat |
| `items()` | Iterasi daftar quotes untuk membuat item |
| `Card` | Wadung dengan elevation untuk tampilan kartu |
| `Text` | Menampilkan teks kutipan dengan padding |

### Daftar Affirmations

1. ✅ Keep going
2. ✅ Never give up
3. ✅ Believe in yourself
4. ✅ Stay positive
5. ✅ Success takes time
6. ✅ Learn every day
7. ✅ Be confident
8. ✅ Dream big

### `Theme.kt`

Mendukung 3 mode tema:
- **Dynamic Color** — Warna mengikuti tema sistem (Android 12+)
- **Light Theme** — Skema warna terang
- **Dark Theme** — Skema warna gelap

---

## 👤 Author

**Naufal Ahnafussidqi Perdana**

---

## 📄 Lisensi

Proyek ini dibuat untuk keperluan tugas pemrograman perangkat bergerak.
