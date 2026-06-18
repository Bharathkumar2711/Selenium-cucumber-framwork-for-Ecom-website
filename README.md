# Saucedemo Automation (Cucumber + TestNG + Selenium)

## How to run
```bash
mvn test -Dheadless=true -Dcucumber.filter.tags=@smoke
```
or run all scenarios:
```bash
mvn test -Dheadless=true
```

## Structure
- `src/test/java/com/saucedemo/core` – WebDriver setup and base utilities
- `src/test/java/com/saucedemo/pages` – Page Objects
- `src/test/java/com/saucedemo/steps` – Cucumber step definitions & hooks
- `src/test/java/com/saucedemo/runners` – TestNG Cucumber runner
- `src/test/resources/features` – Feature files
