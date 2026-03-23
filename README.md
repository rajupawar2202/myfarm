# myfarm

## Overview
This is a web application for Pawar Farms located in Panshet, showcasing organically grown mango and regional fruits. The application provides information about the farm, displays farm photos in a slideshow, and offers contact details.

## Technical Details
- **Language**: Java 21
- **Framework**: Spring Boot 3.2.1
- **Build Tool**: Maven
- **Template Engine**: Thymeleaf
- **Dependencies**:
  - Spring Boot Starter Web
  - Spring Boot Starter Thymeleaf
  - Spring Boot Starter Validation
  - Lombok (optional)
- **Main Class**: `org.example.farmsite.SlideshowApplication`

## Web Pages Created
The application includes three main pages:

### 1. Home Page (`/`)
- **Description**: Welcome page with farm overview and mission statement.
- **Features**:
  - Responsive two-column layout (info section and photo slideshow).
  - Navigation menu with Services submenu (Farm Visit, Fruits, Consultant).
  - Farm description highlighting organic practices, crops (Mangoes, Guava, Jackfruit, Cashewnuts, Watermelons, Kokam, Lemon, Jamuns), and commitment to AtmaNirbhar (self-reliance).
  - Interactive photo slideshow with crossfade transitions.

### 2. Photos Page (`/photos`)
- **Description**: Dedicated page for viewing farm photos.
- **Features**:
  - Full-featured photo slideshow with manual controls (Prev, Next, Pause/Resume).
  - Keyboard navigation (arrow keys, spacebar to pause).
  - Automatic cycling every 5 seconds (pausable).
  - Responsive design.

### 3. Contact Page (`/contact`)
- **Description**: Contact information page.
- **Features**:
  - Contact details: Email (rajupawar2202@gmail.com), Phone (+91-9850527090), Address (Gondekhal, Panshet-Ghol Road, Panshet, Taluka Rajgad, Pune).
  - Two-column layout with contact info and photo slideshow.

## Static Resources
- Farm images stored in `src/main/resources/static/`:
  - Panshet_Farm_1.jpg
  - Panshet_Farm_2.jpg
  - Panshet_Farm_Index.jpg

## Running the Application
1. Ensure Java 21 is installed.
2. Run `mvn clean install` to build the project.
3. Execute `java -jar target/farmsite-0.0.1-SNAPSHOT.jar` to start the application.
4. Access the application at `http://localhost:8080`.
