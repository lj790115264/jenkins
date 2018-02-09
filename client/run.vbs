Dim WinScriptHost
Set WinScriptHost = CreateObject("WScript.Shell")
WinScriptHost.Run Chr(34) & "D:\caring\caring\hmrmyy-patient\client\run.bat" & Chr(34), 0
Set WinScriptHost = Nothing