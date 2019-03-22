package app

import grails.gorm.multitenancy.*
import app.BootstrapService

class BootStrap {
    def bootstrapService
    def init = { servletContext ->
        bootstrapService.globalBootstrap()
    }
    def destroy = {
    }
}
