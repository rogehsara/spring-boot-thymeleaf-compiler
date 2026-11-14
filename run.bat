@echo off
set ANTLR=lib\antlr-4.13.1-complete.jar

java -jar %ANTLR% -Dlanguage=Java -visitor -Xexact-output-dir -o gen grammar\JavaLexer.g4 grammar\JavaParser.g4 grammar\HTMLLexer.g4 grammar\HTMLParser.g4
if errorlevel 1 goto end

if not exist out mkdir out
javac -encoding UTF-8 -cp %ANTLR% -d out gen\*.java src\Main.java
if errorlevel 1 goto end

for %%f in (tests\*.java tests\*.html) do (
    echo.
    echo ############ %%f ############
    java -cp out;%ANTLR% Main %%f
)

:end
