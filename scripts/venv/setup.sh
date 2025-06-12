#!/usr/bin/env bash

if [ ! -d "./leetenv/bin" ]; then
    echo "leetenv does not exist."
    brew install pyenv
    pyenv install 3.12
    virtualenv -p ~/.pyenv/versions/3.12.3/bin/python3.12 leetenv
fi