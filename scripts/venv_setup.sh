#!/usr/bin/env bash

brew install pyenv
pyenv install 3.12
virtualenv -p ~/.pyenv/versions/3.12.3/bin/python3.12 leetenv
. ./leetenv/bin/activate && python -V
pip3 install requests