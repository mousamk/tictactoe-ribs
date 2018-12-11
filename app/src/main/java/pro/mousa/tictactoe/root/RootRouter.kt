package pro.mousa.tictactoe.root

import com.uber.rib.core.ViewRouter
import pro.mousa.tictactoe.root.logged_out.LoggedOutBuilder
import pro.mousa.tictactoe.root.logged_out.LoggedOutRouter


/**
 * Adds and removes children of {@link RootBuilder.RootScope}.
 */
class RootRouter(view: RootView,
                 interactor: RootInteractor,
                 component: RootBuilder.Component,
                 private val loggedOutBuilder: LoggedOutBuilder)
    : ViewRouter<RootView, RootInteractor, RootBuilder.Component>(view, interactor, component)
{
    private var loggedOutRouter: LoggedOutRouter? = null


    internal fun attachLoggedOut()
    {
        val childRouter = loggedOutBuilder.build(view)
        attachChild(childRouter)
        view.addView(childRouter.view)
        loggedOutRouter = childRouter
    }
}
