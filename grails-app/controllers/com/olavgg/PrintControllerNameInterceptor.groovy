package com.olavgg


class PrintControllerNameInterceptor {

    int order = 1

    PrintControllerNameInterceptor(){
        matchAll()
    }

    boolean before() {
        println "Namespace: " + controllerNamespace
        println "Controller Name: " + controllerName
        println "Action Name: " + actionName
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
