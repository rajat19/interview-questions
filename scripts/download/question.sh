#!/usr/bin/env bash

. ./leetenv/bin/activate && python -V

BASEDIR=$(dirname "$0")
python3 $BASEDIR/leetcode.py