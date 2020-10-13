@echo off

set my="C:\xampp\mysql\bin\mysql.exe"
set curr=%~dp0

set db=nsdb
set user=developer
set password=nop4ssword
set host=localhost

set init=%curr%dml\initdb-core.sql
set core=%curr%dml\nsdb-mysql.sql

if exist "%dml%\nsdb-mysql.sql" (
    copy "%dml%\nsdb-mysql.sql" %core% /y
)

%my% -u %user% -p%password% -h %host% < %init%
%my% -u %user% -p%password% -h %host% %db% < %core%

echo done....

pause