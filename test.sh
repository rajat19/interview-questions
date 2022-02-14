#!/bin/bash

usage() {
  # Function: Print a help message.
  echo "
  Usage:
  sh [ -p POST] [ -l LANGUAGE] test.sh
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
	"java")
		javac solution.java
 		java Solution
  	;;
 	"py")
 		python solution.py
  	;;
 	"go")
 		go run solution.go
 		;;
 	*)
 		echo "Unknown language to test"
 esac
fi