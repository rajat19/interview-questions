#!/bin/bash

usage() {
  # Function: Print a help message.
  echo "
  Usage:
  sh test.sh [ -p POST] [ -l LANGUAGE]
  " 1>&2
}

while getopts p:l:h option
do
	case "${option}"
		in
		p) POST=${OPTARG};;
    l) LANGUAGE=${OPTARG};;
    h | *) usage exit 1 ;;
	esac
done

if [ "$LANGUAGE" ]
then
	echo "Checking solution for $POST in $LANGUAGE language"
	cd _includes/code/"$POST" || exit
	case $LANGUAGE in
	"c")
		gcc solution.c -o solution.out
		./solution.out
		;;
	"cpp")
		g++ solution.cpp -o solution.out
		./solution.out
		;;
	"go")
 		go build solution.go
 		;;
	"java")
		javac solution.java
 		java Solution
  	;;
	"js")
		node solution.js
		;;
 	"py")
 		python3 solution.py
  	;;
	"php")
		php solution.php
		;;
	"rb")
		ruby solution.rb
		;;
 	*)
 		echo "Unknown language to test"
 esac
fi