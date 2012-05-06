@echo off

echo Creating Eclipse .project and .classpath files ...
call "%~dp0\sbt.bat" %* eclipse
