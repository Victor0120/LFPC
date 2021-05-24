# LL1 Parsing Algorithm
# Variant 2

Parsing Algorithm on paper:

![](https://github.com/Victor0120/LFPC/blob/master/lab1/screens/screen15.png)

As we can see there are cells with multiple transitions in them, which means that this grammar is not LL1-parseable.

The grammar with which I have tested the Algorithm is the following:

S > E

E > FcA

A > b | dD

D > Fe

F > aX

X > baX | eps

This is a LL1-parseable grammar. It has been written in the following form in the grammar.txt file:

![](https://github.com/Victor0120/LFPC/blob/master/lab1/screens/screen12.png)

Example of output with the input string "abacdae":

![](https://github.com/Victor0120/LFPC/blob/master/lab1/screens/screen13.png)

Example of output with the input string "cabacaa":

![](https://github.com/Victor0120/LFPC/blob/master/lab1/screens/screen14.png)
