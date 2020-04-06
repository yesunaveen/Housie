package org.example.housie

import grails.plugin.springsecurity.annotation.Secured

@Secured( ['ROLE_ADMIN'] )
class Board {
	
	static String newNumber
	static String adminMessage
	static def selectedNumbers
	static def potNumbers
	static boolean enabled
	static Random randomNumberGenerator
	static String fastestFive
	static String firstRow
	static String secondRow
	static String thirdRow
	static String fullHouse1
	static String fullHouse2
	static def funNames = [1:"Kelly's Eye",
2:"One Little Duck",
3:"Buy 2 get 1 free",
4:"Knock at the Door",
5:"Hum Panch",
6:"In a fix",
7:"Saat Sur",
8:"One fat lady",
9:"U are mine",
10:"10 Downing street",
11:"Twin Towers",
12:"Mid night",
13:"Bakers dozen",
14:"Valentine's Day",
15:"Indian Independence Day",
16:"Sweet Sixteen",
17:"Not so sweet",
18:"Now you can vote",
19:"Goodbye-Teens",
20:"Blind one score",
21:"Women's age never crosses",
22:"Two little ducks",
23:"You & me",
24:"Two dozen",
25:"Silver Jublee",
26:"Indian Republic Day",
27:"Gateway to heaven",
28:"Out on a date",
29:"Gin and lime",
30:"Dirty Gertie",
31:"Baskin Robin's",
32:"Buckle my Shoe",
33:"All the three's dirty knees",
34:"Ask for More",
35:"Jump and Jive",
36:"Chatis ka Aankda",
37:"More than Eleven",
38:"Oversize",
39:"Watch your waistline",
40:"Life begins at",
41:"Life's Begun",
42:"Winnie the Pooh",
43:"Climb a tree",
44:"All the fours",
45:"Halfway Home",
46:"Up to tricks",
47:"Four and Seven",
48:"Four Dozen",
49:"Rise and shine",
50:"Half a century",
51:"On the run",
52:"Pack of cards",
53:"Pack with a joker",
54:"House with a bamboo door",
55:"Nagging wife",
56:"Whisky, Beer do not mix",
57:"All the beans",
58:"Time to retire",
59:"Just retired",
60:"Five dozen",
61:"Bakers Bun",
62:"Over haul is due",
63:"Love comes Free",
64:"Hardcore",
65:"Old Age Pension",
66:"All the 6's click",
67:"Made in Heaven",
68:"Mota seth",
69:"Ulta Pulta",
70:"Lucky blind",
71:"Seven is lucky when one has it",
72:"A different view",
73:"Queen B",
74:"Still want more",
75:"Diamond jubilee",
76:"Ran out of tricks",
77:"Hum saat saat hain",
78:"Wipe the slate",
79:"One More Time",
80:"Eight & Blank",
81:"Said and done",
82:"Straight On Through",
83:"India wins 1st Cricket World Cup",
84:"Haggard and bored",
85:"Still alive",
86:"Pick up a walking stick",
87:"Torquay in Devon",
88:"Two Fat Ladies",
89:"Nearly There",
90:"Top of the Ellucian house"]

    static constraints = {
    }
	
	def static numberColor( number ) {
		
		if( selectedNumbers.contains( number ) )
			return '#00FF00'
		else
			return ''
		
	}
	
}
