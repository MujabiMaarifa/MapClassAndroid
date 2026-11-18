# SimpleApp - Student Credentials App

An Android application built with **Kotlin** and **Jetpack Compose** using **Material 3** design components. The application displays a student credentials card with personal and academic details.

---

## 📋 Features & What the Project Does

- **Student Credential Card**: Displays a styled, elevated card showing:
  - **Main Title**: e.g., `"WELCOME TO OUR MAP CLASS"`
  - **Section Title**: e.g., `"Student Credentials"`
  - **Student Name**: e.g., `"David Mujabi"`
  - **Registration Number**: e.g., `"C026-01-0802/2024"`
  - **School/Faculty**: e.g., `"School of Computing"`
- **Jetpack Compose & Material 3**: UI built declaratively using `ElevatedCard`, `Column`, `Text`, `Spacer`, and `HorizontalDivider`.
- **Edge-to-Edge UI**: Configured with `enableEdgeToEdge()` and `Scaffold` layout.
- **Live Preview Support**: Supports Android Studio Compose `@Preview` for instant visual inspection.

---

## 📁 Project Tree Structure

Below is the directory structure of the project highlighting key files and the location of `MainActivity.kt`:

```
SimpleApp/
├── build.gradle.kts                   # Top-level Gradle build configuration
├── settings.gradle.kts                # Project settings and module definitions
├── gradle.properties                  # Gradle properties
├── gradle/                            # Gradle wrapper configuration & version catalog
│   └── libs.versions.toml             # Dependency versions catalog
├── gradlew / gradlew.bat              # Gradle wrapper scripts
└── app/                               # Main application module
    ├── build.gradle.kts               # Module-level Gradle configuration (dependencies, SDK versions)
    ├── README.md                      # App documentation
    └── src/
        ├── main/
        │   ├── AndroidManifest.xml    # App manifest declaring components and permissions
        │   ├── java/com/example/simpleapp/
        │   │   ├── MainActivity.kt    <-- 📍 LOCATED HERE (Main Entry Point & UI)
        │   │   └── ui/
        │   │       └── theme/
        │   │           ├── Color.kt   # Theme colors definition
        │   │           ├── Theme.kt   # SimpleApp Material 3 Theme setup
        │   │           └── Type.kt    # Typography settings
        │   └── res/                   # Drawable, mipmap (icons), values, and XML resources
        ├── test/                      # Local unit tests
        └── androidTest/               # Instrumentation / UI tests
```

---

## 📍 `MainActivity.kt` Location & How to Edit It

### Location
The main activity file is located at:
`[MainActivity.kt](file:///Users/mujabimaarifa/AndroidStudioProjects/SimpleApp/app/src/main/java/com/example/simpleapp/MainActivity.kt)`

Relative path from project root:
`app/src/main/java/com/example/simpleapp/MainActivity.kt`

### How to Edit `MainActivity.kt`

1. **Open the File in Android Studio**:
   - In the Project Window (left sidebar), navigate to:
     `app` > `src` > `main` > `java` > `com.example.simpleapp` > `MainActivity.kt`.

2. **Editing Student Information**:
   - Locate the `onCreate` method inside `MainActivity`:
     ```kotlin
     StudentCredentialCard(
         mainTitle = "WELCOME TO OUR MAP CLASS",
         title = "Student Credentials",
         name = "David Mujabi",
         regNo = "C026-01-0802/2024",
         school = "School of Computing",
         modifier = Modifier.padding(innerPadding)
     )
     ```
   - Change the string arguments passed to `name`, `regNo`, `school`, `mainTitle`, or `title` to update the information displayed on screen.

3. **Modifying the UI Layout & Styling**:
   - Look at the `@Composable` function `StudentCredentialCard(...)`:
     - Modify `MaterialTheme.typography` or `FontWeight` to change text styling.
     - Adjust `padding` or `spacedBy` values to tweak spacing inside the card.
     - Add extra fields (e.g., Department, Course) by adding new `Text` composables inside the `Column`.

4. **Using Compose Live Preview**:
   - Inside `MainActivity.kt`, find `@Preview fun StudentCredentialsPreview()`.
   - Open the **Split** or **Design** view tab in Android Studio (top right of the editor) to preview UI changes in real time without launching an emulator.

---

## 🛠️ Setup and How to Run the Project

### Prerequisites
- **Android Studio**: Ladybug (2024.2.1+) or Hedgehog/Iguana/Jellyfish.
- **JDK**: JDK 11 or higher (configured in Android Studio Settings > Build, Execution, Deployment > Build Tools > Gradle).
- **Android SDK**: `compileSdk = 37`, `minSdk = 24`.
- **Emulator / Physical Device**: Running Android 7.0 (API 24) or higher.

### Setup Instructions

1. **Clone or Open Project**:
   - Launch Android Studio.
   - Click **Open** and select the `SimpleApp` project folder (`/Users/mujabimaarifa/AndroidStudioProjects/SimpleApp`).

2. **Sync Gradle**:
   - Android Studio will automatically prompt a Gradle Sync.
   - Alternatively, click `File > Sync Project with Gradle Files` or run `./gradlew build` in the terminal.

### Running the App

#### Option 1: Via Android Studio IDE
1. Select the `app` configuration in the top toolbar run dropdown.
2. Choose your target **Device/Emulator** from the target dropdown.
3. Click the green **Run** button (or press `Shift + F10` / `Control + R`).

#### Option 2: Via Terminal (Gradle CLI)
- **Build Debug APK**:
  ```bash
  ./gradlew assembleDebug
  ```
- **Install and Run on Connected Device**:
  ```bash
  ./gradlew installDebug
  ```
