package org.example.housie


import grails.plugin.springsecurity.annotation.Secured

class BoardController {
	
	def index() {

		[ newNumber:Board.newNumber , adminMessage:Board.adminMessage , selectedNumbers:Board.selectedNumbers , potNumbers:Board.potNumbers , fastestFive:Board.fastestFive , firstRow:Board.firstRow , secondRow:Board.secondRow , thirdRow:Board.thirdRow , fullHouse1:Board.fullHouse1 , fullHouse2:Board.fullHouse2 ]

	}
	
	@Secured( [ 'ROLE_ADMIN' ] )
	def manageBoard() {
		
		def pauseContinue = ''
		
		if( Board.enabled )
			pauseContinue = 'Pause'
		else
			pauseContinue = 'Continue'
			
		[ pauseContinue:pauseContinue , message:Board.adminMessage , firstRow:Board.firstRow , secondRow:Board.secondRow , thirdRow:Board.thirdRow , fastestFive:Board.fastestFive , fullHouse1:Board.fullHouse1 , fullHouse2:Board.fullHouse2 ]
		
	}
	
	@grails.plugin.springsecurity.annotation.Secured( [ 'ROLE_ADMIN' ] )
	def updateMessage() {
		
		Board.adminMessage = params.message
		redirect( view : 'index' )
		
	}
	
	@Secured( [ 'ROLE_ADMIN' ] )
	def updateWinners() {
		
		Board.firstRow = params.firstRow
		Board.secondRow = params.secondRow
		Board.thirdRow = params.thirdRow
		Board.fastestFive = params.fastestFive
		Board.fullHouse1 = params.fullHouse1
		Board.fullHouse2 = params.fullHouse2
		Board.adminMessage = params.message
		redirect( view : 'index' )
		
	}
	
	@Secured( [ 'ROLE_ADMIN' ] )
	def pauseContinueGame() {
		
		if( Board.enabled )
			Board.enabled = false
		else
			Board.enabled = true
		
		redirect( view : 'index' )
		
	}
	
	@Secured( [ 'ROLE_ADMIN' ] )
	def restartBoard() {
		
		Board.newNumber = 'Stay tuned for the first lucky number!!!'
		Board.adminMessage = 'The game will begin momentarily...'
		Board.selectedNumbers = []
		Board.potNumbers = []
		Board.enabled = true
		
		Board.fastestFive = ''
		Board.firstRow = ''
		Board.secondRow = ''
		Board.thirdRow = ''
		Board.fullHouse1 = ''
		Board.fullHouse2 = ''
		
		Board.randomNumberGenerator = new Random( new Date().getTime() )
		
		( 1..90 ).each {
			
			Board.potNumbers += it
			
		}
		
		redirect( view : 'index' )
		
		while( Board.potNumbers.size() > 0 ) {
			
			if( Board.enabled ) {
			
				int timeout = 0
				
				switch ( Board.potNumbers.size() ) {
					
					case 81..90 : timeout = 25000;break
					case 71..80 : timeout = 30000;break
					case 61..70 : timeout = 35000;break
					case 51..60 : timeout = 40000;break
					case 41..50 : timeout = 45000;break
					default : timeout = 50000;break
					
				}

				Thread.sleep( timeout )
				int randomNum = Board.randomNumberGenerator.nextInt( Board.potNumbers.size() )
				int luckyNumber = Board.potNumbers[randomNum]
				Board.potNumbers -= luckyNumber
				Board.selectedNumbers += luckyNumber
				Board.newNumber = "${Board.funNames[luckyNumber]} : $luckyNumber"
			
			}
			
		}
		
	}
	
}