#!/usr/bin/env bash

# Check if virtual environment is already activated
# if ! pyenv virtualenv -v >/dev/null 2>&1; then
#   echo "pyenv not found. Skipping virtual environment activation."
# else
#   # Check if leetenv is already active
#   if [[ ! $(pyenv which python) == *"leetenv"* ]]; then
#     source ./leetenv/bin/activate
#     echo "Activated leetenv virtual environment."
#   else
#     echo "Running in leetenv....."
#   fi
# fi

if [[ "$VIRTUAL_ENV" == "" ]]
then
    echo "Activating leetenv"
    . ./leetenv/bin/activate
fi

# Run the Python script regardless of virtual environment status
BASEDIR=$(dirname "$0")
python3 $BASEDIR/leetcode.py