#!/usr/bin/env groovy

def call(inputParameters, env){

    def userInput

    userInput = input(id: "proceed_${env}", 
                          message: "Deploy no ambiente ${env}?", 
                          parameters: inputParameters)

    //return user input object
    userInput
}