Public Sub JScript_Example()
     
  Dim objScriptControl                                  As Object
     
  Set objScriptControl = CreateObject("MSScriptControl.ScriptControl")
  
  objScriptControl.Language = "JScript"
  
  objScriptControl.AddCode "function x(a,b) {return 'the answer is:' +(a+b);}"
  
  MsgBox objScriptControl.Run("x", 1, 2), _
         vbInformation Or vbOKOnly


  Set objScriptControl = Nothing
  
End Sub
