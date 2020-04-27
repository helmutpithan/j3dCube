# j3dCube

Magic Cube with j3d

### PURPOSE OF PROJECT: demonstrating java3d on raspbian raspberry 4, OS X , Debian , Windows

VERSION or DATE: 2020,4,13:

### HOW TO START THIS PROJECT: 

Main class:  Actionframe

### AUTHORS

Helmut Pithan h.pithan(at)t-online.de

### How to install

For simplicity I use bluej to run the project.
You have to put the contents of `userlib0` into the bluej userlib, 

when using raspbian, you will find the bluej userlib in `/usr/share/bluej/userlib`
 
when using OS X, you will find the bluej userlib in 
`/Applications/BlueJ\ 4.1.2/BlueJ.app/Contents/Resources/Java/userlib`

when using Debian, you will find the bluej user lib in `/usr/share/bluej/userlib`

when using Windows, you will find the bluej userlib in `C:\Program Files\BlueJ\lib\userlib`

<aside class="warning">
Warning:
The bluej Editor is to slow for such big textfiles.
I used jEdit and compiled with bluej rebuild package.
</aside>

#How to use this project
##First Stepps
1.  Push the Button:       randomInput(n)
	Effect:	the input textfield  is filled with  a random instruction string of      length n=20
	Push the Button:  execute
	Effect:                     the  Cube will be mixed up
	Push the Button: Axes (wait until done)
	Push the Button: WhiteCross (wait until done)
	Push the Button: UpCorners  (wait until done)
	Push the Button: MiddlePlain (wait until done)
	
	Now you may move the cube with the mouse to look at the  down side.
	
	Push the Button: YellowCross  (wait until done)
	Push the Button: DownCorners  (wait until done)

2.  Push the Buttons : clr, clrArea, reset
	Type into the Input TextField: U
	Push the Buttons : cycleTest: (after some seconds you see 4 in the  cycleTest textField)
	
	Do it again with : UF  (after some minutes you see 105 in the  cycleTest textField)
	 You may do it again with : UFl and see 360

3.	Choice: Examples      choose Cross  , the input textfield is filled , Push the Button:  execute
	Try  the other examples

4. 	Push the Button:       randomInput(n)
    Push the Button:  execute (wait until done)
    Push the Button:  invert 
    Push the Button:  execute (wait until done)

5.  n= 20
    m= 3
    Push the Button:    randomTest(n,m) (wait,..wait) 
    random Cube will be solved 3 times                
    

6.  Type into  n= 50
    Type into  m= 1000
    Push the Button:    randomTest(n,m) (wait,..wait ...two days) 
    random Cube will be solved 1000 times  