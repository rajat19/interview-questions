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
 case $LANGUAGE in
 "java")
    cd _includes/code/"$POST" || exit
    javac solution.java
    java Solution
    ;;
 *)
   echo "Unknown language to test"
 esac
fi