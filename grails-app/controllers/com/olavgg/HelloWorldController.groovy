package com.olavgg

class HelloWorldController {

    static namespace = "bigWorld"

    def index(){ redirect action: 'testHello' }

    def testHello() { render text: "example"}
}
