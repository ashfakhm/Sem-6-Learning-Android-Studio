<div align="center">

# Android Development Lab Programs

### BSc Computer Science • Semester 6 • Farook College

[![Android](https://img.shields.io/badge/Platform-Android-green.svg?style=flat-square&logo=android)](https://developer.android.com/)
[![Java](https://img.shields.io/badge/Language-Java-orange.svg?style=flat-square&logo=java)](https://www.java.com/)
[![Gradle](https://img.shields.io/badge/Build-Gradle-blue.svg?style=flat-square&logo=gradle)](https://gradle.org/)
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green.svg?style=flat-square&logo=android-studio)](https://developer.android.com/studio)

_A curated collection of 20 hands-on Android applications exploring core framework components and UI patterns_

**Lab Partner:** [@MNK-21](https://github.com/MNK-21/)

</div>

---

## 📖 Overview

This repository documents my journey through Android application development during the 6th semester Android Java Development Lab at Farook College. Each program is a self-contained Android Studio project designed to demonstrate specific framework capabilities, from basic UI components to complex user interaction patterns.

These programs represent both practical lab exercises and theoretical coursework, providing a comprehensive foundation in native Android development using Java.

---

## 🎯 Program Index

<table>
<tr>
<td width="50%">

**Foundation & UI Components**

1. [Toast Notifications](#1-toast-notifications)
2. [Addition of Two Numbers](#2-addition-of-two-numbers)
3. [Activity Navigation](#3-activity-navigation)
4. [Copy TextView Content](#4-copy-textview-content)
5. [Dynamic Background Color](#5-dynamic-background-color)

**Visual & Layout Components**

6. [Dynamic Background Image](#6-dynamic-background-image)
7. [ListView](#7-listview)
8. [GridView Layout](#8-gridview-layout)
9. [Spinner Widget](#9-spinner-widget)
10. [Custom Adapters](#10-custom-adapters)

</td>
<td width="50%">

**Image & Input Controls**

11. [ImageView Implementation](#11-imageview-implementation)
12. [Date & Time Picker Dialogs](#12-date--time-picker-dialogs)
13. [Date & Time Pickers](#13-date--time-pickers)
14. [Chronometer Widget](#14-chronometer-widget)
15. [CheckBox Controls](#15-checkbox-controls)

**Advanced Features**

16. [RadioButton Groups](#16-radiobutton-groups)
17. [Alert Dialogs](#17-alert-dialogs)
18. [Multiplication Table Generator](#18-multiplication-table-generator)
19. [Login System](#19-login-system)
20. [Passing Data Between Activities](#20-passing-data-between-activities)
21. [Database Android Program](#21-database-android-program)

</td>
</tr>
</table>

---

## 📱 Program Details

### 1. Toast Notifications

**Objective:** Implement lightweight, non-intrusive user feedback  
**Key Concepts:** `Toast` API, message duration, positioning  
**Use Case:** Displaying transient status messages without disrupting user flow

### 2. Addition of Two Numbers

**Objective:** Build a simple calculator for adding two numbers  
**Key Concepts:** Event handling, input validation, arithmetic operations  
**Components:** `EditText`, `Button`, `TextView`, number parsing, error handling

### 3. Activity Navigation

**Objective:** Master inter-activity communication  
**Key Concepts:** `Intent`, activity lifecycle, back stack management  
**Skills:** Activity transitions, navigation patterns, starting new activities

### 4. Copy TextView Content

**Objective:** Programmatic text manipulation between view components  
**Key Concepts:** View references, text getters/setters, `EditText` to `TextView` copying  
**Pattern:** Basic UI synchronization and text transfer

### 5. Dynamic Background Color

**Objective:** Programmatic color scheme modification  
**Key Concepts:** Color resources, `setBackgroundColor()`, hex/ARGB values  
**Application:** Runtime theme customization, user-driven color changes

### 6. Dynamic Background Image

**Objective:** Runtime background image manipulation  
**Key Concepts:** `Drawable` resources, background setters, resource management  
**Technique:** Programmatic theme customization with images

### 7. ListView

**Objective:** Render scrollable vertical lists  
**Key Concepts:** `ListView`, view recycling, list item layouts  
**Performance:** Efficient rendering of large datasets

### 8. GridView Layout

**Objective:** Display items in multi-column grid format  
**Key Concepts:** `GridView`, column configuration, item spacing, adapters  
**Use Case:** Photo galleries, icon dashboards, tile-based navigation

### 9. Spinner Widget

**Objective:** Create dropdown selection menus  
**Key Concepts:** `Spinner`, `ArrayAdapter`, selection listeners  
**Pattern:** User-driven single-choice selection from predefined options

### 10. Custom Adapters

**Objective:** Bridge data sources to `AdapterView` components  
**Key Concepts:** `BaseAdapter`, view holder pattern, data binding  
**Architecture:** MVC pattern in Android UI layer

### 11. ImageView Implementation

**Objective:** Display and manipulate bitmap images  
**Key Concepts:** `ImageView`, drawable resources, scaling modes  
**Topics:** Image loading, memory management, aspect ratios

### 12. Date & Time Picker Dialogs

**Objective:** Dialog-based date and time selection  
**Key Concepts:** `DatePickerDialog`, `TimePickerDialog`, callbacks  
**UX:** Space-efficient modal pickers for date and time input

### 13. Date & Time Pickers

**Objective:** Inline date and time selection widgets  
**Key Concepts:** `DatePicker`, `TimePicker`, calendar integration  
**Components:** Month/day/year selectors, hour/minute controls

### 14. Chronometer Widget

**Objective:** Implement timer and stopwatch functionality  
**Key Concepts:** `Chronometer`, elapsed time tracking, start/stop controls  
**Features:** Real-time time display, format customization

### 15. CheckBox Controls

**Objective:** Multi-select input mechanism  
**Key Concepts:** `CheckBox`, state management, compound buttons  
**Pattern:** Independent boolean selections

### 16. RadioButton Groups

**Objective:** Mutually exclusive option selection  
**Key Concepts:** `RadioButton`, `RadioGroup`, single selection enforcement  
**Pattern:** Form inputs requiring exactly one choice

### 17. Alert Dialogs

**Objective:** Modal user prompts and confirmations  
**Key Concepts:** `AlertDialog`, positive/negative/neutral buttons  
**Use Case:** Critical decisions, confirmations, informational alerts

### 18. Multiplication Table Generator

**Objective:** Programmatically generate multiplication tables  
**Key Concepts:** Dynamic view creation, loops, string formatting  
**Pattern:** Algorithm-driven UI generation

### 19. Login System

**Objective:** Complete authentication interface  
**Key Concepts:** Input validation, credential handling, basic authentication  
**Security:** Input validation patterns, credential handling

### 20. Passing Data Between Activities

**Objective:** Transfer data between different activities  
**Key Concepts:** `Intent` extras, `putExtra()`, `getIntent()`, data serialization  
**Skills:** Inter-activity communication, data passing patterns

### 21. Database Android Program

**Objective:** Implement a simple database-driven Android application using SQLite
**Key Concepts:** `SQLiteOpenHelper`, CRUD operations, persistent storage, database schema
**Features:**

- Create, Read, Update, Delete (CRUD) operations on a local SQLite database
- User interface for adding, viewing, updating, and deleting records
- Example code for database helper and activity integration

**Learning Outcomes:**

- Understand SQLite integration in Android
- Learn to perform CRUD operations in an Android app
- Gain experience with Android Studio project structure

---

## 🛠️ Technology Stack

| Component           | Technology                  |
| ------------------- | --------------------------- |
| **Language**        | Java                        |
| **Framework**       | Android SDK                 |
| **IDE**             | Android Studio (Kotlin DSL) |
| **Build System**    | Gradle 8.x                  |
| **Version Control** | Git                         |
| **UI Toolkit**      | Android Views & Widgets     |

---

## 🏗️ Architecture

Each project follows standard Android application structure:

```
ProjectName/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/projectname/
│   │   │   │   └── MainActivity.java
│   │   │   ├── res/
│   │   │   │   ├── layout/activity_main.xml
│   │   │   │   ├── values/strings.xml
│   │   │   │   ├── values/colors.xml
│   │   │   │   └── drawable/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle.kts
├── gradle/
│   └── wrapper/
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

---

## 🚀 Quick Start

### Prerequisites

```
✓ Android Studio Hedgehog | 2023.1.1+
✓ JDK 11 or JDK 17
✓ Android SDK Platform 33+
✓ Gradle 8.0+
```

### Setup Instructions

```bash
# Clone the repository
git clone <repository-url>
cd Sem-6-Android_Studio_Programs

# Open individual project in Android Studio
# File → Open → Select project directory (e.g., "1-Implement Toast")

# Sync Gradle
# Android Studio will automatically trigger Gradle sync

# Run on emulator or physical device
# Click Run ▶️ or press Shift+F10
```

### Device Requirements

- **Minimum SDK:** API 21 (Android 5.0 Lollipop)
- **Target SDK:** API 33 (Android 13)
- **Recommended:** API 30+ for best compatibility

---

## 📚 Learning Outcomes

Upon completing these programs, you will have mastered:

#### Core Android Concepts

- Activity lifecycle and task management
- Intent-based navigation and data passing
- Resource management (layouts, strings, drawables)
- Event-driven programming model

#### UI/UX Development

- XML layout design and view hierarchy
- Material Design component implementation
- Responsive layouts and constraint systems
- User input handling and validation

#### Architecture Patterns

- Model-View-Controller (MVC) fundamentals
- Adapter pattern for data binding
- Observer pattern for state management
- Component lifecycle awareness

#### Best Practices

- Code organization and separation of concerns
- Null safety and defensive programming
- Resource optimization and memory management
- Debugging and testing strategies

---

## 📂 Project Organization

Projects are numbered sequentially following the lab syllabus. Each is fully independent with its own:

- Complete Android Studio project structure
- Self-contained resources and assets
- Dedicated `build.gradle.kts` configuration
- Standalone execution capability

**No dependencies exist between projects** — run any program individually without prerequisite setup.

---

## 🔍 Code Quality

All programs adhere to:

- ✅ Android development guidelines
- ✅ Java naming conventions (camelCase for methods, PascalCase for classes)
- ✅ Inline documentation and comments
- ✅ Logical code organization
- ✅ Error handling and edge case management

---

## 🤝 Collaboration

**Lab Partner:** [@MNK-21](https://github.com/MNK-21/)  
These programs were developed collaboratively as part of our academic lab coursework.

---

## 📄 Academic Context

**Institution:** Farook College  
**Program:** Bachelor of Science in Computer Science  
**Semester:** 6  
**Course:** Android Java Development Lab  
**Academic Year:** 2025-2026

This repository serves as both coursework submission and a portfolio of Android development fundamentals.

---

## 🙏 Acknowledgments

- Farook College Computer Science Department
- Android Developer Documentation Team
- Lab instructors and mentors
- [@MNK-21](https://github.com/MNK-21/) for collaborative development

---

## 📞 Support

For questions, discussions, or collaboration opportunities:

- 🐛 **Issues:** Use the GitHub issue tracker
- 💬 **Discussions:** Open a discussion thread
- 🔀 **Pull Requests:** Improvements and suggestions welcome

---

<div align="center">

**Built with ❤️ for learning Android development**

![Android](https://img.shields.io/badge/Made%20for-Android%20Developers-3DDC84?style=for-the-badge&logo=android&logoColor=white)

</div>
