import org.example.Role
import org.example.User
import org.example.UserRole
import org.example.housie.Board;

class BootStrap {

    def init = { servletContext ->

        def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role( authority:'ROLE_ADMIN' ).save(flush:true, failOnError: true )

        def adminUser = User.findByUsername('admin') ?: new User( username:'admin' , password:'on_the_house' , enabled:true ).save(flush:true, failOnError:true )

        if ( !adminUser.authorities.contains( adminRole ) ) {

            UserRole.create adminUser , adminRole

        }

        Board.newNumber = 'Stay tuned for the first lucky number!!!'
        Board.adminMessage = 'The game will begin momentarily...'
        Board.enabled = false
        Board.randomNumberGenerator = new Random( new Date().getTime() )

        Board.fastestFive = ''
        Board.firstRow = ''
        Board.secondRow = ''
        Board.thirdRow = ''
        Board.fullHouse1 = ''
        Board.fullHouse2 = ''

        Board.selectedNumbers = []
        Board.potNumbers = []

        ( 1..90 ).each {

            Board.potNumbers += it

        }

    }
    def destroy = {
    }
}
