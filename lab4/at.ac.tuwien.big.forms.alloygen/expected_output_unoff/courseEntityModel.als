module ME14
sig Student {
	name: one Int,
	likes: one Course,
	enrols: one Course
}
sig Course {
	title: one Int,
	isEnroledBy: set Student,
	isLikedBy: set Student
}
fact {
	all c: Course | #c.isLikedBy =< 5
	all c: Course | #c.isLikedBy >= 5
	all c: Course | #c.isEnroledBy =< 10
}
//Valid Test 2
pred show {}
run show for  40 Student, 40 Course