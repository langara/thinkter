package org.jetbrains.demo.thinkter

import kotlinx.html.*
import org.jetbrains.demo.tictactoe.TicTacToe
import org.jetbrains.demo.todomvc.TodoMVC
import react.ReactComponentNoProps
import react.ReactComponentNoState
import react.ReactComponentSpec
import react.dom.ReactDOM
import react.dom.ReactDOMBuilder
import react.dom.ReactDOMComponent
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    ReactDOM.render(document.getElementById("content")) {
        Application { }
    }
}

class Application : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    companion object : ReactComponentSpec<Application, ReactComponentNoProps, ReactComponentNoState>

    override fun ReactDOMBuilder.render() {
        div {
            h2("tic") {
                +"Tic Tac Toe"
            }
            table {
                tbody {
                    tr {
                        td("tic") { TicTacToe { id = 1 } }
                        td("tic") { TicTacToe { id = 2 } }
                        td("tic") { TicTacToe { id = 3 } }
                    }
                    tr {
                        td("tic") { TicTacToe { id = 4 } }
                        td("tic") { TicTacToe { id = 5 } }
                        td("tic") { TicTacToe { id = 6 } }
                    }
                }
            }
            TodoMVC { id = 1 }
            TodoMVC { id = 2 }
        }
    }

    init {
        state = ReactComponentNoState()
    }
}

external fun generateUUID(): String