package org.example

class Role {

	String authority

	static mapping = {
		cache true
		autowire true
	}

	static constraints = {
		authority blank: false, unique: true
	}
}
