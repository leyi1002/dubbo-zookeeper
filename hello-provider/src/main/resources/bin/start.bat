@echo off & setlocal enabledelayedexpansion

set LIB_JARS=..\conf
cd ..\lib
for %%i in (*) do set LIB_JARS=!LIB_JARS!;..\lib\%%i
cd ..\bin

echo Starting the server [shoppingmall-member-service] ......

java -classpath %LIB_JARS% com.alibaba.dubbo.container.Main

endlocal