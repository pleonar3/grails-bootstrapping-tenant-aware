package app

import grails.gorm.transactions.Transactional
import grails.gorm.multitenancy.*

@Transactional
class BootstrapService {

    @WithoutTenant
    def globalBootstrap() {
        Book book = new Book(title: 'created').save(failOnError: true)
    }
}
