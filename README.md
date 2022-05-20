# PrinterQueue
A simple way to control the order of files sent to a printer device.

The printer queue is a simple way to control the order of files sent to a printer device. We know that a single printer can be shared between multiple devices. So to preserve the order of the files sent, we can use a queue. 
Write a program, which takes filenames until the "print" command is received. Then as output print the filenames in the order of printing. Some of the tasks may be canceled if you receive "cancel" you have to remove the first file to be printed. If there is no current file to be printed print "Printer is on standby".

Examples
--------

Input | Output
------|-------
Lab.docx | Canceled Lab.docx
cancel | Printer is on standby 
cancel | Canceled Presentation.pptx
Presentation.pptx | NoteNothing.txt
NoteNothing.txt | SomeCode.java
SomeCode.java |
cancel |
print |

•	Use an ArrayDeque<>.

•	Use offer(), when adding the file.

