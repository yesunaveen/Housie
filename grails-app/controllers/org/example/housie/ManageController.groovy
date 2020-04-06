package org.example.housie

import grails.plugin.springsecurity.annotation.Secured

@Secured( ['ROLE_ADMIN'] )
class ManageController {

    def manageBoard() { render( view:'manageBoard') }
	
	def updateMessage() {
		
		Board.adminMessage = 'This is changed'
		redirect( controller:"Board" )
		
	}
	
}
