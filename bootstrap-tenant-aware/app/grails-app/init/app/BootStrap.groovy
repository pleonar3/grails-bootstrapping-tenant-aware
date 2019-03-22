package app

import grails.gorm.multitenancy.*

@WithoutTenant
class BootStrap {

    @WithoutTenant
    void method() {
        Book book = new Book(title: 'created').save(failOnError: true)
    }

    def init = { servletContext ->
        method()
    }
    def destroy = {
    }
}
