package app

import grails.gorm.multitenancy.*

@WithoutTenant
class BootStrap {

    def init = { servletContext ->
        Book book = new Book(title: 'created').save(failOnError: true)
    }
    def destroy = {
    }
}
