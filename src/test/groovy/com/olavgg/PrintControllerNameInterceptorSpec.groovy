package com.olavgg

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class PrintControllerNameInterceptorSpec extends Specification implements InterceptorUnitTest<PrintControllerNameInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test printControllerName interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"printControllerName")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
