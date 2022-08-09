package io.jeremylshepherd.assignment_tracker.controllers


import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AssignmentTrackerController {

    @GetMapping("/")
    fun index(): String {
        println("GET:// index route hit")
        return "index"
    }
}