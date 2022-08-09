package io.jeremylshepherd.assignment_tracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AssignmentTrackerApplication

fun main(args: Array<String>) {
	runApplication<AssignmentTrackerApplication>(*args)
}
