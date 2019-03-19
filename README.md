# AngularCalculator
Calculate MOA to MIL as well as MOA to length and back.

This app is a "shooting calculator buddy" for people going back and
forth between the minute of angle to angular mils and also want to know
exactly how much of these (MIL or MOA) this represents in actual
distance (inch, cm or mm) at a certain distance (yard, feet or meter).

## Inspiration
This is an Android app that I made which was inspired by the
following two websites:

https://www.traditionaloven.com/tutorials/angle/convert-angle-unit-minute-to-angular-mil-unit.html
http://www.indecorous.com/bullseye/moacalc.html

Because they're websites, they (of course!) don't work when
offline, so I wanted an app with big text so it could easily
be viewed quickly as well as have everything I often need to
know in one place.

## Windows
There are three windows in the app and you scroll to them by
swiping left or right:
1) MIL/MOA to MOA/MIL
2) MIL/MOA to length
3) Length to MIL/MOA

## Knowns
We know that
1) 1MOA = 0.30MIL
2) 1MOA @ 100 yards = 1.047"
3) 1MIL = 3.38MOA
4) 1MIL @ 100 meters = 9.999cm
5) 1" = 25.4mm
6) 1ft = 12" = 304.8mm

### Formulas
#### Screen 1 - MOA to MIL
* xMOA * 0.30MIL

#### Screen 2 - MIL to MOA
* xMIL * 3.38MOA

#### Screen 3 - MOA to Length
* xYARD
* xFEET
* xMETER

* yINCH
* yCENTIMETER
* yMILIMETER

* zMOA

#### Screen 4 - Length to MOA
* xYARD
* xFEET
* xMETER

* yINCH
* yCENTIMETER
* yMILIMETER

# Licensing
It, both the source code and the application, is distributed under
the GNU General Public License v3 (see the LICENSE file).

It was built using the Android Studio IDE.
